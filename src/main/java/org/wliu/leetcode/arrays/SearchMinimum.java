package org.wliu.leetcode.arrays;

public class SearchMinimum {
	
	public static int searchMinimum(int[] arr) throws Exception{
		if(arr == null || arr.length == 0) {
			throw new Exception("the Array is invalid");
		}
		
		if (arr.length == 1) {
			return arr[0];
		}
		
		int start = 0;
		int end = arr.length;
		
		int mid = 0;
		
		while(start < end) {
			mid = (start + end) / 2;
//			if (end - start <=1) {
//				return arr[start];
//			}
			if (arr[mid] <= arr[mid-1>=0?mid-1:mid] && arr[mid] <= arr[mid+1<=arr.length?mid+1:mid]) {
				return arr[mid];
			}
			
			if (arr[mid] >= arr[start]) {
				start = mid + 1;
			} else {
				end = mid;
			}
			
		}
		
		throw new Exception("the Array is invalid");
		
	}

}
