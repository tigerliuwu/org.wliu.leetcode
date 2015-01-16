package org.wliu.leetcode.test.cases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.MedianOfTwoSortedArrays4;

public class MedianOfTwoSortedArrays4Test {
	
	private MedianOfTwoSortedArrays4 test = null;
	private int[] ain1=null;
	private int[] ain2 = null;
	private int[] ain3 = null;
	private int[] ain4 = null;
	private int[] ain5 = null;
	private int[] ain4_1 = null;
	private int[] ain5_1 = null;
	
	private int[] din2 = null;
	private int[] din3 = null;
	private int[] din4 = null;
	private int[] din5 = null;
	private int[] din4_1 = null;
	private int[] din5_1 = null;
	
	@Before
	public void setUp() throws Exception {
		test = new MedianOfTwoSortedArrays4();
		ain1 = new int[]{1};
		ain2 = new int[]{1,2};
		ain3 = new int[]{1,2,3};
		ain4 = new int[]{1,2,3,4};
		ain5 = new int[]{5,6,7,8,9};
		ain4_1 = new int[]{1,3,7,8};
		ain5_1 = new int[]{2,4,6,9,10};
		
		din2 = new int[]{2,1};
		din3 = new int[]{3,2,1};
		din4 = new int[]{4,3,2,1};
		din5 = new int[]{9,8,7,6,5};
		din4_1 = new int[]{8, 7, 3, 1};
		din5_1 = new int[]{10,9,6,4,2};
	}

	@Test
	public void testFindMedianSortedArrays() {
		// ASC
		assertTrue(test.findMedianSortedArrays(ain1, ain1)==1);
		assertTrue(test.findMedianSortedArrays(ain2, ain2)==1.5);
		assertTrue(test.findMedianSortedArrays(ain3, ain3)==2);
		assertTrue(test.findMedianSortedArrays(ain4, ain4)==2.5);
		assertTrue(test.findMedianSortedArrays(ain1, ain2)==1);
		assertTrue(test.findMedianSortedArrays(ain1, ain3)==1.5);
		assertTrue(test.findMedianSortedArrays(ain2, ain4)==2);
		assertTrue(test.findMedianSortedArrays(ain3, ain5)==5.5);
		assertTrue(test.findMedianSortedArrays(ain4, ain5)==5);
		assertTrue(test.findMedianSortedArrays(ain4_1, ain5_1)==6);
		
		
		// DESC
//		assertTrue(test.findMedianSortedArrays(din2, din2)==1.5);
//		assertTrue(test.findMedianSortedArrays(din3, din3)==2);
//		assertTrue(test.findMedianSortedArrays(din4, din4)==2.5);
//		assertTrue(test.findMedianSortedArrays(ain1, din2)==1);
//		assertTrue(test.findMedianSortedArrays(ain1, din3)==1.5);
//		assertTrue(test.findMedianSortedArrays(din2, din4)==2);
//		assertTrue(test.findMedianSortedArrays(din3, din5)==5.5);
//		assertTrue(test.findMedianSortedArrays(din4, din5)==5);
//		assertTrue(test.findMedianSortedArrays(din4_1, din5_1)==6);
		
		// ASE + DESC
//		assertTrue(test.findMedianSortedArrays(ain1, din2)==1); // ASE, DESC
//		assertTrue(test.findMedianSortedArrays(ain2, din2)==1.5);
//		assertTrue(test.findMedianSortedArrays(ain3, din3)==2);
//		assertTrue(test.findMedianSortedArrays(ain4, din4)==2.5);
//		assertTrue(test.findMedianSortedArrays(ain1, din2)==1);
//		assertTrue(test.findMedianSortedArrays(ain1, din3)==1.5);
//		assertTrue(test.findMedianSortedArrays(ain2, din4)==2);
//		assertTrue(test.findMedianSortedArrays(ain3, din5)==5.5);
//		assertTrue(test.findMedianSortedArrays(ain4, din5)==5);
//		assertTrue(test.findMedianSortedArrays(din2, ain4)==2);
//		assertTrue(test.findMedianSortedArrays(din3, ain5)==5.5);
//		assertTrue(test.findMedianSortedArrays(din4, ain5)==5);
	}

}
