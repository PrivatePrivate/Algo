package my.algo.sort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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
	
	//*************************************************


}
