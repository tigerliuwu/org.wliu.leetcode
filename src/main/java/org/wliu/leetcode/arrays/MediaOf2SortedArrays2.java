package org.wliu.leetcode.arrays;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.<br>
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be <strong>O(log (m+n))</strong>.
 * <p>
 * Example 1: <br>
 * 
 * <pre>
 * nums1 = [1, 3] nums2 = [2]
 * </pre>
 * 
 * The median is 2.0 Example 2:
 * 
 * <pre>
 * nums1 = [1, 2] nums2 = [3, 4]
 * </pre>
 * 
 * The median is (2 + 3)/2 = 2.5 Subscribe to see which companies asked this
 * question
 * 
 * @author liuwu
 *
 */
public class MediaOf2SortedArrays2 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int total = nums1.length + nums2.length;

		if (total % 2 == 1) {
			return findKValueFrom2SortedArrays2(nums1, 0, nums1.length, nums2, 0, nums2.length, (total + 1) / 2);
		} else {
			return (double) (findKValueFrom2SortedArrays2(nums1, 0, nums1.length, nums2, 0, nums2.length, total / 2)
					+ findKValueFrom2SortedArrays2(nums1, 0, nums1.length, nums2, 0, nums2.length, (total / 2) + 1))
					/ 2;
		}

	}

	/**
	 * 只计算奇数情况
	 * 
	 * @param arr1
	 * @param start1
	 * @param m
	 * @param arr2
	 * @param start2
	 * @param n
	 * @param k
	 * @return
	 */
	private int findKValueFrom2SortedArrays(int[] arr1, int start1, int m, int[] arr2, int start2, int n, int k) {

		if (m > n) {
			return findKValueFrom2SortedArrays(arr2, start2, n, arr1, start1, m, k);
		}

		if (m == 0) {
			return arr2[start2 + k - 1];
		}

		if (k == 1) {
			return Math.min(arr1[start1], arr2[start2]);
		}

		int tmp = Math.min(m, k / 2);
		int index1 = start1 + tmp - 1;
		int index2 = start2 + (k - tmp - 1);

		if (arr1[index1] < arr2[index2]) {
			return findKValueFrom2SortedArrays(arr1, index1 + 1, m - tmp, arr2, start2, n, k - tmp);
		} else if (arr1[index1] > arr2[index2]) {
			return findKValueFrom2SortedArrays(arr1, start1, m, arr2, index2 + 1, n - (k - tmp), tmp);
		} else {
			return arr1[index1];
		}

	}

	/**
	 * <strong><b>假定：</b></strong><br>
	 * 我们有两个数组：<b>nums1</b>, <b>nums2</b>,寻找第k小的值。 <br>
	 * <strong><b>思路：</b></strong><br>
	 * <p>
	 * step1:<br>
	 * 求取num1和num2中k/2元素的值，有以下三种情况：<br>
	 * case 1:
	 * 
	 * <pre>
	 * num1[k / 2 - 1] == num2[k / 2 - 1]
	 * </pre>
	 * 
	 * 返回该值<br>
	 * case 2:
	 * 
	 * <pre>
	 * num1[k / 2 - 1] < num2[k / 2 - 1]
	 * </pre>
	 * 
	 * 抛弃num1[0:k/2-1]；同时考虑到num2[0:k/2-1]有k/2个元素，也可以抛弃num2[k/2:];此刻只需要求得剩下元素在第k/
	 * 2小的元素即可。<br>
	 * case 3:
	 * 
	 * <pre>
	 * num1[k / 2 - 1] > num2[k / 2 - 1]
	 * </pre>
	 * 
	 * 抛弃num2[0:k/2-1]；同时考虑到num1[0:k/2-1]有k/2个元素，也可以抛弃num1[k/2:];此刻只需要求得剩下元素在第k/
	 * 2小的元素即可。
	 * 
	 * @param arr1
	 * @param start1
	 * @param m
	 * @param arr2
	 * @param start2
	 * @param n
	 * @param k
	 * @return
	 */
	private int findKValueFrom2SortedArrays2(int[] arr1, int start1, int m, int[] arr2, int start2, int n, int k) {

		if (m > n) {
			return findKValueFrom2SortedArrays(arr2, start2, n, arr1, start1, m, k);
		}

		if (m == 0) {
			return arr2[start2 + k - 1];
		}

		if (k <= 1) {
			return Math.min(arr1[start1], arr2[start2]);
		}

		int tmp = Math.min(m, k / 2);
		int index1 = start1 + tmp - 1;
		int index2 = start2 + (k - tmp - 1);

		if (arr1[index1] < arr2[index2]) {
			return findKValueFrom2SortedArrays(arr1, index1 + 1, m - tmp, arr2, start2, k - tmp, k - tmp);
		} else if (arr1[index1] > arr2[index2]) {
			return findKValueFrom2SortedArrays(arr1, start1, tmp, arr2, index2 + 1, n - (k - tmp), tmp);
		} else {
			return arr1[index1];
		}

	}
}
