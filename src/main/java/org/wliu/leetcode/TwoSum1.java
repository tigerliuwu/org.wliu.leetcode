package org.wliu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @category Two Sum
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 *
 *The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 *
 *You may assume that each input would have exactly one solution.
 *
 *Input: numbers={2, 7, 11, 15}, target=9
 *Output: index1=1, index2=2 
 * @author wliu
 *
 */

public class TwoSum1 {
	/**
	 * O(n*n)
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] numbers, int target) {
		if (numbers==null || numbers.length <2) {
			return null;
		}
		
		int begin = 0;
		int end =0;
		int result[] = null;
		for (begin = 0; begin < numbers.length; begin++) {
			for (end=begin+1; end < numbers.length; end++) {
				if (numbers[begin] + numbers[end]==target) {
					result = new int[2];
					result[0] = begin + 1;
					result[1] = end + 1;
					break;
				} 
			}
			if (result != null) {
				break;
			}
		}
		return result;
		
	}
	/**
	 * O(n)
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum2(int[] numbers, int target) {
		if (numbers==null || numbers.length <2) {
			return null;
		}
		
		Map<Integer, Integer> mapResult = new HashMap<Integer, Integer>();
		int[] result = null;
		for (int i = 0; i < numbers.length; i++) {
			if (mapResult.containsKey(numbers[i])) {
				result = new int[2];
				result[0]= mapResult.get(numbers[i]).intValue() + 1;
				result[1] = i + 1;
				break;
			} else {
				mapResult.put(target-numbers[i], i);
			}
		}
		
		
		
		return result;
		
	}
	

}
