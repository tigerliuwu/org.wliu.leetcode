package org.wliu.leetcode.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.wliu.leetcode.LongestSubstringWithoutRepeat3;

public class LongestSubstringWithoutRepeat3Test {

	@Test
	public void testLengthOfLongestSubstring() {
		long start = System.currentTimeMillis();
		LongestSubstringWithoutRepeat3 longSubString = new LongestSubstringWithoutRepeat3();
		assertEquals(7, longSubString.lengthOfLongestSubstring("abcdefg"));
		assertEquals(4, longSubString.lengthOfLongestSubstring("abcbbabcda"));
		assertEquals(0, longSubString.lengthOfLongestSubstring(""));
		assertEquals(0, longSubString.lengthOfLongestSubstring(null));
		assertEquals(1, longSubString.lengthOfLongestSubstring("a"));
		assertEquals(4, longSubString.lengthOfLongestSubstring("aaabcddbbabcda"));
		assertEquals(7, longSubString.lengthOfLongestSubstring("aaabcddbbabcdabcdefg"));
		assertEquals(7, longSubString.lengthOfLongestSubstring("aaabcddbbabcdabcdefga"));
		System.out.println("first:"+(System.currentTimeMillis()-start));
	}
	
	@Test
	public void testLengthOfLongestSubstring2() {
		long start = System.currentTimeMillis();
		LongestSubstringWithoutRepeat3 longSubString = new LongestSubstringWithoutRepeat3();
		assertEquals(7, longSubString.lengthOfLongestSubstring2("abcdefg"));
		assertEquals(4, longSubString.lengthOfLongestSubstring2("abcbbabcda"));
		assertEquals(0, longSubString.lengthOfLongestSubstring2(""));
		assertEquals(0, longSubString.lengthOfLongestSubstring2(null));
		assertEquals(1, longSubString.lengthOfLongestSubstring2("a"));
		assertEquals(4, longSubString.lengthOfLongestSubstring2("aaabcddbbabcda"));
		assertEquals(7, longSubString.lengthOfLongestSubstring2("aaabcddbbabcdabcdefg"));
		assertEquals(7, longSubString.lengthOfLongestSubstring2("aaabcddbbabcdabcdefga"));
		System.out.println("second:"+(System.currentTimeMillis()-start));
	}

	@Test
	public void testLengthOfLongestSubstring3() {
		long start = System.currentTimeMillis();
		LongestSubstringWithoutRepeat3 longSubString = new LongestSubstringWithoutRepeat3();
		assertEquals(7, longSubString.lengthOfLongestSubstring3("abcdefg"));
		assertEquals(4, longSubString.lengthOfLongestSubstring3("abcbbabcda"));
		assertEquals(0, longSubString.lengthOfLongestSubstring3(""));
		assertEquals(0, longSubString.lengthOfLongestSubstring3(null));
		assertEquals(1, longSubString.lengthOfLongestSubstring3("a"));
		assertEquals(4, longSubString.lengthOfLongestSubstring3("aaabcddbbabcda"));
		assertEquals(7, longSubString.lengthOfLongestSubstring3("aaabcddbbabcdabcdefg"));
		assertEquals(7, longSubString.lengthOfLongestSubstring3("aaabcddbbabcdabcdefga"));
		System.out.println("third:"+(System.currentTimeMillis()-start));
	}
}
