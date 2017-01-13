package org.wliu.leetcode.arrays;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MediaOf2SortedArrays2Test {

	@Test
	public void testFindMedianSortedArrays() {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };

		MediaOf2SortedArrays2 ins = new MediaOf2SortedArrays2();
		assertTrue(ins.findMedianSortedArrays(nums1, nums2) == 2.5);

		nums1 = new int[] { 1, 4 };
		nums2 = new int[] { 2, 3 };
		assertTrue(ins.findMedianSortedArrays(nums1, nums2) == 2.5);

		nums1 = new int[] {};
		nums2 = new int[] { 1 };
		assertTrue(ins.findMedianSortedArrays(nums1, nums2) == 1);

		nums1 = new int[] {};
		nums2 = new int[] { 1, 2 };
		assertTrue(ins.findMedianSortedArrays(nums1, nums2) == 1.5);

		nums1 = new int[] { 4 };
		nums2 = new int[] { 1, 2, 9, 10 };
		assertTrue(ins.findMedianSortedArrays(nums1, nums2) == 4);
	}

}
