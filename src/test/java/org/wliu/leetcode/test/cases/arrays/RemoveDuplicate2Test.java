package org.wliu.leetcode.test.cases.arrays;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.arrays.RemoveDuplicate2;

public class RemoveDuplicate2Test {
	private int[] sortArr0;
	private int[] sortArr1;
	private int[] sortArr2;
	private int[] sortArr3;
	private int[] sortArr4;
	private int[] sortArr5;
	private int[] sortArr6;
	private int[] sortArr7;
	private int[] sortArr8;
	
	@Before
	public void setUp() throws Exception {
		this.sortArr0 = new int[0];
		this.sortArr1 = new int[]{1};
		this.sortArr2 = new int[]{1,1};
		this.sortArr3 = new int[]{1,1,2};
		this.sortArr4 = new int[]{1,1,2,3};
		this.sortArr5 = new int[]{1,1,2,3,4};
		this.sortArr6 = new int[]{1,1,2,3,4,4};
		this.sortArr7 = new int[]{1,1,3,3,3,4};
		this.sortArr8 = new int[]{4,3,3,3,1,1};
	}

	@Test
	public void testRemoveDuplicate2FromArray() {
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr0,2)==0);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr1,2)==1);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr2,2)==2);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr3,2)==3);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr4,2)==4);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr5,2)==5);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr6,2)==6);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr7,2)==5);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray(sortArr8,2)==5);
	}
	@Test
	public void testRemoveDuplicate2FromArray2() {
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr0)==0);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr1)==1);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr2)==1);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr3)==2);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr4)==3);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr5)==4);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr6)==4);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr7)==3);
		assertTrue(RemoveDuplicate2.removeDuplicateFromArray2(sortArr8)==3);
	}
	@After
	public void setDown() throws Exception {
		sortArr0 = null;
		sortArr1 = null;
		sortArr2 = null;
		sortArr3 = null;
		sortArr4 = null;
		sortArr5 = null;
		sortArr6 = null;
	}

}
