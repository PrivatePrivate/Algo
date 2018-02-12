package my.algo.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraySortUtilTest {
	
	
	//********************* BUBBLE SORT *************************************
	@Test
	public void bubbleSortTest1() {
		int[] testData = {1, 2, 3};
		int [] result = ArraySortUtil.bubbleSort(testData);
		int [] expectedResult = {1, 2, 3};
		assertEquals(expectedResult, result);
		//test
	}

	@Test
	public void bubbleSortTest12() {
		int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
		int [] result = ArraySortUtil.bubbleSort(testData);
		int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void bubbleSortTest3() {
		int[] testData = {3, 3, 2, 2, 1, 1};
		int [] result = ArraySortUtil.bubbleSort(testData);
		int [] expectedResult = {1, 1, 2, 2, 3, 3};
		assertEquals(expectedResult, result);
	}
	
	//************************ SELECTION SORT **************************************
	
	@Test
	public void selectionSortTest1() {
		int[] testData = {1, 2, 3};
		int [] result = ArraySortUtil.selectionSort(testData);
		int [] expectedResult = {1, 2, 3};
		assertEquals(expectedResult, result);
	}

	@Test
	public void selectionSortTest12() {
		int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
		int [] result = ArraySortUtil.selectionSort(testData);
		int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void selectionSortTest3() {
		int[] testData = {3, 3, 2, 2, 1, 1};
		int [] result = ArraySortUtil.selectionSort(testData);
		int [] expectedResult = {1, 1, 2, 2, 3, 3};
		assertEquals(expectedResult, result);
	}
	
	//*********************** INSERTION SORT *******************************************
	
	@Test
	public void insertionSortTest1() {
		int[] testData = {1, 2, 3};
		int [] result = ArraySortUtil.insertionSort(testData);
		int [] expectedResult = {1, 2, 3};
		assertEquals(expectedResult, result);
	}

	@Test
	public void insertionSortTest12() {
		int[] testData = {543, 89, 0 , -3, 65, 78, 0, 1};
		int [] result = ArraySortUtil.insertionSort(testData);
		int [] expectedResult = {-3, 0, 0, 1, 65, 78, 89, 543};
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void insertionSortTest3() {
		int[] testData = {3, 3, 2, 2, 1, 1};
		int [] result = ArraySortUtil.insertionSort(testData);
		int [] expectedResult = {1, 1, 2, 2, 3, 3};
		assertEquals(expectedResult, result);
	}
	
	//*************************************************


}
