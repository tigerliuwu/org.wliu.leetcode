package org.wliu.leetcode.arrays;

public class RemoveDuplicate {
	/**
	 * remove the duplicate number from the sorted array
	 * time complexity:O(n)	space complexity:O(1)
	 * make sure the array after execution, it should be still sorted.
	 * @param int[] : a sorted array
	 * @return int
	 */
	public static int removeDuplicateFromArray(int sortArr[]) {
		if (sortArr == null || sortArr.length ==0) {
			return 0;
		}
		int length = sortArr.length;
		for(int i = 0,j = 0, k=0; i<length; i++) {
			for (j = i+1; j < length; j++) {
				if (sortArr[i] != sortArr[j]) { // different
					break; 
				}
			}
			// move the data from j-length to start from i+1.
			for(k=i+1;k<j&&j<length;j++,k++) {
				sortArr[k] = sortArr[j];
			}
			
			length = length -(j-k);			
		}
		
		return length;
	}
	
	public static int removeDuplicateFromArray2(int sortArr[]) {
		if (sortArr == null || sortArr.length ==0) {
			return 0;
		}
		
		int index = 0;
		for (int i = 1; i< sortArr.length; i++) {
			if (sortArr[index] != sortArr[i]) {
				sortArr[++index] = sortArr[i];
			}
		}
		
		return index + 1;
		
	}

}
