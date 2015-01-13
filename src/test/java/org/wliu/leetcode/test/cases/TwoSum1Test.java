package org.wliu.leetcode.test.cases;

import org.junit.Assert;
import org.junit.Test;
import org.wliu.leetcode.TwoSum1;

public class TwoSum1Test {

	@Test
	public void testTwoSum() {
		Assert.assertArrayEquals(new int[]{2, 5}, new TwoSum1().twoSum(new int[]{2, 8, 11, 7, 15}, 23));
		Assert.assertArrayEquals(new int[]{1,4}, new TwoSum1().twoSum(new int[]{2, 8, 11, 7, 15}, 9));
		Assert.assertArrayEquals(new int[]{1,2}, new TwoSum1().twoSum(new int[]{2, 7, 11, 15}, 9));
		Assert.assertArrayEquals(null, new TwoSum1().twoSum(new int[]{2, 8, 11, 15}, 9));
		Assert.assertArrayEquals(new int[]{1,2}, new TwoSum1().twoSum(new int[]{2, 7}, 9));
		Assert.assertArrayEquals(null, new TwoSum1().twoSum(new int[]{2}, 9));
		Assert.assertArrayEquals(null, new TwoSum1().twoSum(new int[0], 9));
		Assert.assertArrayEquals(null, new TwoSum1().twoSum(null, 9));
	}
	@Test
	public void testTwoSum2() {
		Assert.assertArrayEquals(new int[]{2, 5}, new TwoSum1().twoSum2(new int[]{2, 8, 11, 7, 15}, 23));
		Assert.assertArrayEquals(new int[]{1,4}, new TwoSum1().twoSum2(new int[]{2, 8, 11, 7, 15}, 9));
		Assert.assertArrayEquals(new int[]{1,2}, new TwoSum1().twoSum2(new int[]{2, 7, 11, 15}, 9));
		Assert.assertArrayEquals(null, new TwoSum1().twoSum2(new int[]{2, 8, 11, 15}, 9));
		Assert.assertArrayEquals(new int[]{1,2}, new TwoSum1().twoSum2(new int[]{2, 7}, 9));
		Assert.assertArrayEquals(null, new TwoSum1().twoSum2(new int[]{2}, 9));
		Assert.assertArrayEquals(null, new TwoSum1().twoSum2(new int[0], 9));
		Assert.assertArrayEquals(null, new TwoSum1().twoSum2(null, 9));
	}
}
