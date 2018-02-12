package my.algo.sort;

public class ArraySortUtil {
	
	public static void bubbleSort(int [] array) {

		for(int i = 0; i < array.length; i++) {
		    boolean continueSorting = false;
		    for(int inner = array.length - 1; inner > i; inner--) {
		        if(array[inner] < array[inner - 1]) {
                    swap(array, inner, inner - 1);
                    continueSorting = true;
                }
            }

            if(!continueSorting) {
		        break;
            }
        }
	}
	
	public static void insertionSort(int [] array) {

	}
	
	public static void selectionSort(int [] array) {
		
	}

	private static void swap(int [] array, int i, int k) {
	    int bufor = array[i];
	    array[i] = array[k];
	    array[k] = bufor;
    }

}
