package org.wliu.leetcode.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {

	@Test

	public void testSolution() {
		int[] s1 = { 1, 2, 3, 4 };
		int target = 6;

		TwoSum ins = new TwoSum();
		assertArrayEquals(ins.solution(s1, target), new int[] { 1, 3 });

		s1 = new int[] { 0, 4, 2, 0 };
		target = 0;
		assertArrayEquals(ins.solution(s1, target), new int[] { 0, 3 });

	}

}
