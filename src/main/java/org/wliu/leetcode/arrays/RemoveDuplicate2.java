package org.wliu.leetcode.arrays;

public class RemoveDuplicate2 {
	/**
	 * remove the duplicate number from the sorted array
	 * time complexity:O(n)	space complexity:O(1)
	 * make sure the array after execution, it should be still sorted.
	 * @param int[] : a sorted array
	 * @param int n: allowed duplicate times
	 * @return int
	 */
	public static int removeDuplicateFromArray(int sortArr[], int n) {
		if (sortArr == null || sortArr.length ==0) {
			return 0;
		}
		if (n < 1) {
			return sortArr.length;
		}
		
		int index = 0;
		int c_occur = 1;
		for (int i = 1; i < sortArr.length; i++) {
			if (sortArr[i]!=sortArr[index]) { // different
				index++;
				sortArr[index] = sortArr[i];
				c_occur = 1;
			} else { // same
				c_occur++;
				if (c_occur <= n) {
					index++;
					sortArr[index] = sortArr[i];
				}
			}
		}
		
		return index + 1;
	}
	
	public static int removeDuplicateFromArray2(int sortArr[]) {
		
		return removeDuplicateFromArray(sortArr, 1);
	}

}
