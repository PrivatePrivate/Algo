package my.algo.sort;

public class ArraySortUtil {
	
	public static void bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			boolean continueSorting = false;
			for (int inner = array.length - 1; inner > i; inner--) {
				if (array[inner] < array[inner - 1]) {
					swap(array, inner, inner - 1);
					continueSorting = true;
				}
			}

			if (!continueSorting) {
				break;
			}
		}
	}
	
	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int k = i;
			while (k > 0) {
				if (array[k] < array[k - 1]) {
					swap(array, k, k - 1);
					k--;			
				} else {
					break;
				}
			}
		}
	}
	
	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			int k = i + 1;
			int minIndex = i;
			while (k < array.length) {
				if (array[minIndex] > array[k]) {
					minIndex = k;
				}
				k++;
			}
			swap(array, i, minIndex);
		}

	}

	private static void swap(int [] array, int i, int k) {
	    int bufor = array[i];
	    array[i] = array[k];
	    array[k] = bufor;
    }

}
