package org.wliu.leetcode.arrays;

public class SearchMinimum {
	
	public static int searchMinimum(int[] num) throws Exception{
		
		if (num.length == 1) {
			return num[0];
		}
		
		int start = 0;
		int end = num.length;
		
		int mid = 0;
		
		while(start < end) {
			mid = (start + end) / 2;
			if (num[mid] <= num[mid-1>=0?mid-1:mid] && num[mid] <= num[mid+1<=num.length-1?mid+1:mid]) {
				return num[mid];
			}
			
			if (num[mid] >= num[start]) {
				if (num[end-1] >= num[start]) {
					end = mid;
				} else {
					start = mid + 1;
				}
			} else {
					end = mid;
			}
			
		}
		
		return Integer.MIN_VALUE;
		
	}

	
	public static int searchMinimum2(int[] num) throws Exception{
		
		if (num.length == 1) {
			return num[0];
		}
		
		int start = 0;
		int end = num.length;
		
		int mid = 0;
		
		int result = 0;
		
		while(start < end) {
			mid = (start + end) / 2;
			if (mid-start< 1) {
				result = num[start];
			}
			
			if (num[mid] > num[start]) {
				if (num[end-1] > num[start]) {
					end = mid;
				} else {
					start = mid + 1;
				}
			} else if (num[mid] < num[start]) {
				end = mid+1;
				start++;
			} else { 
				start++;
			}
			
		}
		
		return result;
		
	}
	
}
