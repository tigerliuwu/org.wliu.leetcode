package org.wliu.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] solution(int nums[], int target) {

		Map<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int another = target - nums[i];
			if (hash.containsKey(another)) {
				return new int[] { hash.get(another), i };
			}
			hash.put(nums[i], i);
		}

		throw new RuntimeException("should not come to here.");
	}

}
