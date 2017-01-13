package org.wliu.leetcode.arrays;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharsTest {

	@Test
	public void testLengthOfLongestSubstring() {
		LongestSubstringWithoutRepeatingChars ins = new LongestSubstringWithoutRepeatingChars();
		String s1 = "bbbbb";
		assertTrue(ins.lengthOfLongestSubstring2(s1) == 1);

		String s2 = "pwwkew";
		assertTrue(ins.lengthOfLongestSubstring2(s2) == 3);

		String s = "abcabcbb";
		assertTrue(ins.lengthOfLongestSubstring2(s) == 3);

	}

}
