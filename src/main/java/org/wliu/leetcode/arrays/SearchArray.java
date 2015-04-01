package org.wliu.leetcode.arrays;

public class SearchArray {
	
	public static int search(int[] arr, int start, int length, int val) {
		
		if (arr == null || arr.length == 0) {
			return -1;
		}
		
		if (length <= 0) {
			return -1;
		}
		
		if (arr[start]==val) { // the first element
			return start;
		}
		if(arr[start+length-1]==val) { // the last element
			return start+length-1;
		}
		
		int mid = length / 2;
		
		if (arr[start + mid] == val) {
			return start + mid;
		}
		
		if (((arr[start+mid] < arr[start]) &&(arr[start] < val || arr[start+mid] > val)) ||
				(arr[start+mid] > arr[start] && arr[start+mid] > val)
				) {
			return search(arr, start, mid, val);
		} else {
			return search(arr, start + mid + 1, length - (mid+1), val);
		}
		
	}

}
