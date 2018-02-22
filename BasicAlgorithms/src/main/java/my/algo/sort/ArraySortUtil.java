package my.algo.sort;

public class ArraySortUtil {
	
	public static void bubbleSort(int[] array) {

        if(array == null) {
            return;
        }

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

        if(array == null) {
            return;
        }
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

	    if(array == null) {
	        return;
        }

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

	public static void quickSort(int[] array) {
        if(array == null) {
            return;
        }
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int array[], int start, int end) {

		if(end <= start) {
			return;
		}

		int pivotValue = array[end];
		int helperIndex = start - 1;
		for(int i = start; i <= end; i++) {
			if(array[i] < pivotValue) {
				helperIndex++;
				swap(array, helperIndex, i);
			}
		}
		helperIndex++;
		swap(array, helperIndex, end);
		quickSort(array, start, helperIndex - 1);
		quickSort(array, helperIndex + 1, end);

	}

	private static void swap(int [] array, int i, int k) {
	    int bufor = array[i];
	    array[i] = array[k];
	    array[k] = bufor;
    }

    public static void heapSort(int[] testData) {

	    if(testData == null) {
	        return;
        }

		buildHeap(testData);
		for(int i = testData.length - 1; i > 0; i--) {
			heapify(testData, 0, i);
			swap(testData, 0, i);
		}
    }

    private static void buildHeap(int[] array) {

		for(int i = getParentIndex(array.length - 1); i >= 0; i--) {
			heapify(array, i, array.length - 1);
		}
	}

	private static void heapify(int [] array, int rootIndex, int lastIndex) {

		int maxIndex = rootIndex;
		int leftChildIndex = getLeftChildIndex(rootIndex);
		int rightChildIndex = getRightChildIndex(rootIndex);

		if(leftChildIndex <= lastIndex && array[leftChildIndex] > array[maxIndex]) {
			maxIndex = leftChildIndex;
		}

		if(rightChildIndex <= lastIndex && array[rightChildIndex] > array[maxIndex]) {
			maxIndex = rightChildIndex;
		}

		if(rootIndex != maxIndex) {
			swap(array, rootIndex, maxIndex);
			heapify(array, maxIndex, lastIndex);
		}
	}

	private static int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	private static int  getLeftChildIndex(int parentIndex) {
		return parentIndex * 2 + 1;
	}

	private static int getRightChildIndex(int parentIndex) {
		return parentIndex * 2 + 2;
	}


    public static void mergeSort(int[] array) {
		if(array == null || array.length <= 1) {
			return;
		}
		mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int [] array, int startIndex, int endIndex) {

		if(endIndex <= startIndex) {
			return;
		}

		int middleIndex = startIndex + (endIndex - startIndex) / 2;

		mergeSort(array, startIndex, middleIndex);
		mergeSort(array, 1 + middleIndex, endIndex);

		int [] result = new int [endIndex - startIndex + 1];

		merge(array, startIndex, 1 + middleIndex, endIndex, result);

		for(int resInd = 0, i = startIndex; i <= endIndex; i++, resInd++) {
			array[i] = result[resInd];
		}

	}
	 private static void merge(int [] array, int startIndex, int middleIndex, int endIndex, int [] result) {

		int startMove = startIndex;
		int midMove = middleIndex;
		int resultIndex = 0;
		while(startMove < middleIndex && midMove <= endIndex) {
			if(array[startMove] <= array[midMove]) {
				result[resultIndex] = array[startMove];
				startMove++;
			} else {
				result[resultIndex] = array[midMove];
				midMove++;
			}
			resultIndex++;
		}

		for(; startMove < middleIndex; startMove++) {
			result[resultIndex] = array[startMove];
			resultIndex++;
		}

		 for(; midMove <= endIndex; midMove++) {
			 result[resultIndex] = array[midMove];
			 resultIndex++;
		 }
	 }

    public static void countSort(int[] testData, int maxValue) {
    }
}
