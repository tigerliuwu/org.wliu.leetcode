package org.wliu.leetcode.test.cases.arrays;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.arrays.MediaOf2SortedArrays;

public class MediaOf2SortedArraysTest {
	private static int[] L_DATA0;
	private static int[] R_DATA0;

	private static int[] L_DATA1;
	private static int[] R_DATA1;
	
	private static int[] L_DATA2;
	private static int[] R_DATA2;
	
	private static int[] L_DATA3;
	private static int[] R_DATA3;
	@Before
	public void setUp() throws Exception {
		L_DATA0 = new int[]{};
		L_DATA0 = new int[] {1,2};
		
		L_DATA1 = new int[] {1};
		R_DATA1 = new int[] {1,2,3,4,5,6};
		
		//odd
		L_DATA2 = new int[] {1,2,3,4,5,6};
		R_DATA2 = new int[] {1,2,3,4,5,6,7};
		
		//odd
		L_DATA3 = new int[] {1,2,3,4,5,6};
		R_DATA3 = new int[] {7,8,9,10,11,12};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindMediaOf2SortedArrays() {
		assertEquals(1, MediaOf2SortedArrays.findMediaOf2SortedArrays(L_DATA0, L_DATA1), 0.001);
		assertEquals(1.5, MediaOf2SortedArrays.findMediaOf2SortedArrays(L_DATA0, L_DATA0), 0.001);
		assertEquals(3, MediaOf2SortedArrays.findMediaOf2SortedArrays(L_DATA1, R_DATA1), 0.001);
		assertEquals(4, MediaOf2SortedArrays.findMediaOf2SortedArrays(L_DATA2, R_DATA2), 0.001);
		assertEquals(6.5, MediaOf2SortedArrays.findMediaOf2SortedArrays(L_DATA3, R_DATA3), 0.001);
	}

}
