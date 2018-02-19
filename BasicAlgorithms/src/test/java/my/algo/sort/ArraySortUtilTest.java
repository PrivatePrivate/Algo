package my.algo.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArraySortUtilTest {


	//********************* BUBBLE SORT *************************************
	@Test
	public void bubbleSortTest1() {
		int[] testData = {1, 2, 3};
		ArraySortUtil.bubbleSort(testData);
		int [] expectedResult = {1, 2, 3};
        assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void bubbleSortTest2() {
		int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
        ArraySortUtil.bubbleSort(testData);
		int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
        assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void bubbleSortTest3() {
		int[] testData = {3, 3, 2, 2, 1, 1};
        ArraySortUtil.bubbleSort(testData);
		int [] expectedResult = {1, 1, 2, 2, 3, 3};
        assertArrayEquals(expectedResult, testData);
	}

    @Test
    public void bubbleSortOneElementArrayTest() {
        int[] testData = {5};
        ArraySortUtil.bubbleSort(testData);
        int [] expectedResult = {5};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void bubbleSortEmptyArrayTest() {
        int[] testData = {};
        ArraySortUtil.bubbleSort(testData);
        int [] expectedResult = {};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void bubbleSortNullArrayTest() {
        int[] testData = null;
        ArraySortUtil.bubbleSort(testData);
        int [] expectedResult = null;
        assertArrayEquals(expectedResult, testData);
    }

	//************************ SELECTION SORT **************************************

	@Test
	public void selectionSortTest1() {
		int[] testData = {1, 2, 3};
        ArraySortUtil.selectionSort(testData);
		int [] expectedResult = {1, 2, 3};
        assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void selectionSortTest2() {
		int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
        ArraySortUtil.selectionSort(testData);
		int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
        assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void selectionSortTest3() {
		int[] testData = {3, 3, 2, 2, 1, 1};
		ArraySortUtil.selectionSort(testData);
		int [] expectedResult = {1, 1, 2, 2, 3, 3};
		assertArrayEquals(expectedResult, testData);
	}

    @Test
    public void selectionSortOneElementArrayTest() {
        int[] testData = {5};
        ArraySortUtil.selectionSort(testData);
        int [] expectedResult = {5};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void selectionSortEmptyArrayTest() {
        int[] testData = {};
        ArraySortUtil.selectionSort(testData);
        int [] expectedResult = {};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void selectionSortNullArrayTest() {
        int[] testData = null;
        ArraySortUtil.selectionSort(testData);
        int [] expectedResult = null;
        assertArrayEquals(expectedResult, testData);
    }

	//*********************** INSERTION SORT *******************************************

	@Test
	public void insertionSortTest1() {
		int[] testData = {1, 2, 3};
        ArraySortUtil.insertionSort(testData);
		int [] expectedResult = {1, 2, 3};
        assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void insertionSortTest2() {
		int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
        ArraySortUtil.insertionSort(testData);
		int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
        assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void insertionSortTest3() {
		int[] testData = {3, 3, 2, 2, 1, 1};
		ArraySortUtil.insertionSort(testData);
		int [] expectedResult = {1, 1, 2, 2, 3, 3};
        assertArrayEquals(expectedResult, testData);
	}

    @Test
    public void insertionSortOneElementArrayTest() {
        int[] testData = {5};
        ArraySortUtil.insertionSort(testData);
        int [] expectedResult = {5};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void insertionSortEmptyArrayTest() {
        int[] testData = {};
        ArraySortUtil.insertionSort(testData);
        int [] expectedResult = {};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void insertionSortNullArrayTest() {
        int[] testData = null;
        ArraySortUtil.insertionSort(testData);
        int [] expectedResult = null;
        assertArrayEquals(expectedResult, testData);
    }

	//**************** QUICK SORT *********************************
	@Test
	public void quickSortTest1() {
		int[] testData = {1, 2, 3};
		ArraySortUtil.quickSort(testData);
		int [] expectedResult = {1, 2, 3};
		assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void quickSortTest2() {
		int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
		ArraySortUtil.quickSort(testData);
		int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
		assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void quickSortTest3() {
		int[] testData = {3, 3, 2, 2, 1, 1};
		ArraySortUtil.quickSort(testData);
		int [] expectedResult = {1, 1, 2, 2, 3, 3};
		assertArrayEquals(expectedResult, testData);
	}

    @Test
    public void quickSortOneElementArrayTest() {
        int[] testData = {5};
        ArraySortUtil.quickSort(testData);
        int [] expectedResult = {5};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void quickSortEmptyArrayTest() {
        int[] testData = {};
        ArraySortUtil.quickSort(testData);
        int [] expectedResult = {};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void quickSortNullArrayTest() {
        int[] testData = null;
        ArraySortUtil.quickSort(testData);
        int [] expectedResult = null;
        assertArrayEquals(expectedResult, testData);
    }

	//**************** HEAP SORT *********************************
	@Test
	public void heapSortTest1() {
		int[] testData = {1, 2, 3};
		ArraySortUtil.heapSort(testData);
		int [] expectedResult = {1, 2, 3};
		assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void heapSortTest2() {
		int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
		ArraySortUtil.heapSort(testData);
		int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
		assertArrayEquals(expectedResult, testData);
	}

	@Test
	public void heapSortTest3() {
		int[] testData = {3, 3, 2, 2, 1, 1};
		ArraySortUtil.heapSort(testData);
		int [] expectedResult = {1, 1, 2, 2, 3, 3};
		assertArrayEquals(expectedResult, testData);
	}

    @Test
    public void heapSortOneElementArrayTest() {
        int[] testData = {5};
        ArraySortUtil.heapSort(testData);
        int [] expectedResult = {5};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void heapSortEmptyArrayTest() {
        int[] testData = {};
        ArraySortUtil.heapSort(testData);
        int [] expectedResult = {};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void heapSortNullArrayTest() {
        int[] testData = null;
        ArraySortUtil.heapSort(testData);
        int [] expectedResult = null;
        assertArrayEquals(expectedResult, testData);
    }

    //**************** MERGE SORT *********************************
    @Test
    public void mergeSortTest1() {
        int[] testData = {1, 2, 3};
        ArraySortUtil.mergeSort(testData);
        int [] expectedResult = {1, 2, 3};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void mergeSortTest2() {
        int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
        ArraySortUtil.mergeSort(testData);
        int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void mergeSortTest3() {
        int[] testData = {3, 3, 2, 2, 1, 1};
        ArraySortUtil.mergeSort(testData);
        int [] expectedResult = {1, 1, 2, 2, 3, 3};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void mergeSortOneElementArrayTest() {
        int[] testData = {5};
        ArraySortUtil.mergeSort(testData);
        int [] expectedResult = {5};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void mergeSortEmptyArrayTest() {
        int[] testData = {};
        ArraySortUtil.mergeSort(testData);
        int [] expectedResult = {};
        assertArrayEquals(expectedResult, testData);
    }

    @Test
    public void mergeSortNullArrayTest() {
        int[] testData = null;
        ArraySortUtil.mergeSort(testData);
        int [] expectedResult = null;
        assertArrayEquals(expectedResult, testData);
    }

}
