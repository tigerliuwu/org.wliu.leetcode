package org.wliu.leetcode.stack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LongestPalindromicStringTest {

	@Test
	public void testLongestPalindrome() {
		LongestPalindromicString ins = new LongestPalindromicString();

		String s = "a";
		assertTrue(ins.longestPalindrome(s).equals("a"));

		s = "aa";
		assertTrue(ins.longestPalindrome(s).equals("aa"));

		s = "aaa";
		assertTrue(ins.longestPalindrome(s).equals("aaa"));

		s = "ab";
		assertTrue(ins.longestPalindrome(s).equals("a"));

		s = "aba";
		assertTrue(ins.longestPalindrome(s).equals("aba"));

		s = "abac";
		assertTrue(ins.longestPalindrome(s).equals("aba"));

		s = "dabac";
		assertTrue(ins.longestPalindrome(s).equals("aba"));

		s = "caabc";
		assertTrue(ins.longestPalindrome(s).equals("aa"));
	}

}
