package org.wliu.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * Examples:
 * 
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 * Given "bbbbb", the answer is "b", with the length of 1.
 * 
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
 * answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * Subscribe to see which companies asked this question
 * 
 * @author liuwu
 *
 */
public class LongestSubstringWithoutRepeatingChars {

	public boolean contains(char[] arr, int start, int end, char target) {
		for (int i = start; i < end; i++) {
			if (arr[i] == target) {
				return true;
			}
		}
		return false;
	}

	public int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}

		char[] arr = s.toCharArray();
		int len = 1;
		int tmpL = 0;

		for (int i = 0; i < arr.length; i++) {
			int j = i + tmpL;
			for (; j < arr.length; j++) {
				if (contains(arr, i, j, arr[j])) {
					if (j - i > len) {
						len = j - i;
					}
					tmpL = j - i - 1;
					break;
				}
			}

			if (j == arr.length) {
				if (arr.length - i > len) {
					len = arr.length - i;
				}

			}

		}

		return len;

	}

	public int lengthOfLongestSubstring2(String s) {
		int max = 0;
		Set<Character> charCols = new HashSet<Character>();
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (charCols.contains(s.charAt(i))) {
				max = Math.max(charCols.size(), max);
				charCols.clear();
				j++;
				i = j;
			}
			charCols.add(s.charAt(i));
		}
		return max;
	}
}
