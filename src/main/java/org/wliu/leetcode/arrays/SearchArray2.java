package org.wliu.leetcode.arrays;

public class SearchArray2 {
	
	public static int search(int[] arr, int start, int length, int val) {
		
		if (arr == null || arr.length == 0) {
			return -1;
		}
		
		if (length <= 0) {
			return -1;
		}
		
//		if (arr[start]==val) { // the first element
//			return start;
//		}
//		if(arr[start+length-1]==val) { // the last element
//			return start+length-1;
//		}
		
		int mid = length / 2;
		
		if (arr[start + mid] == val) {
			return start + mid;
		}
		
		if (((arr[start+mid] < arr[start]) &&(arr[start] <= val || arr[start+mid] > val)) ||
				(arr[start+mid] > arr[start] && arr[start+mid] > val && arr[start] <= val)
				) {
			return search(arr, start, mid, val);
		} else {
			return search(arr, start + mid + 1, length - (mid+1), val);
		}
		
	}
	
	public static int search2(int[] arr, int val) {
		if (arr == null || arr.length ==0) {
			return -1;
		}
		
		int start = 0; 
		int end = arr.length;
		
		int mid = 0;
		
		while (start < end) {
			mid = (start + end) / 2;
			if (mid>=arr.length) {
				return -1;
			}
			if (arr[mid] == val) {
				return mid;
			}
			// arr[mid] >= arr[start] eg. 3,4,5,6,7,0,1,2 (7 >=3)
			if (arr[mid] > arr[start]) { 
				if (arr[start] <= val && arr[mid] > val) { // left part
					end = mid;
				} else {
					start = mid + 1;
				}
			} else if (arr[mid] == arr[start]) {
				if (arr[end-1] > arr[start]) { // ASC
					start = mid + 1;
				} else {
					end = mid;
				}
			} else { // arr[mid] < arr[start] eg. 7,8,0,1,2,3,4,5,6 ( 2 < 7)
				if (arr[mid] < val && arr[end-1] >= val) {// right part
					start = mid + 1;
				} else {
					end = mid;
				}
			}
		}
		
		return -1;
		
	}

}
