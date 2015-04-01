package org.wliu.leetcode.example;

public class SplitArray {
	
	public static int find(int[] arr, int val) {
		return find(arr, 0, arr.length, val);
	}
	
	private static int find(int[] arr, int start, int length, int val) {
		
		if (length <= 0) {
			return -1;
		}
		
		int mid = length / 2;
		if (arr[start+mid] == val) {
			return start + mid;
		}
		if (arr[start+mid] < val) {
			return find(arr, start + mid + 1, length -(mid+1), val);
		} else {
			return find(arr, start, mid, val);
		}
		
	}

}
