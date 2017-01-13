package org.wliu.leetcode.stack;

import java.util.Stack;

public class LongestPalindromicString {
	public String longestPalindrome(String s) {
		String strExpect = "";

		if (s == null || s.length() < 2) {
			return s;
		}

		if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(1)) {
				return s;
			}
		}

		Stack<Character> stack = new Stack<Character>();
		int matchStep = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i == 0 || i == 1) {
				stack.push(s.charAt(i));
				strExpect = s.substring(0, 1);
			} else {
				// 当stack只有一个元素的时候，只比较该元素即可；否则从最后一个元素的前一个元素开始比较
				if (matchStep > 0) {
					int matchLen = Math.min(matchStep * 2 + 1, stack.size());
					if (matchLen == stack.size()) {
						// find the result
						if (strExpect.length() < matchLen) {
							strExpect = s.substring(i - matchLen, i);
						}
						matchStep = 0;
					} else if (stack.get(stack.size() - 1 - matchLen) == s.charAt(i)) { // match
						matchStep++;
					} else { // doesn't match
						if (strExpect.length() < matchLen) {
							strExpect = s.substring(i - matchLen, i);
						}
						matchStep = 0;
					}

				} else {
					int j = stack.size() - 2 >= 0 ? stack.size() - 2 : 0;
					if (stack.get(j) == s.charAt(i)) {
						matchStep = 1;
					} else {
						matchStep = 0;
					}

				}
				stack.push(s.charAt(i));
			}
		}

		if (matchStep > 0) {
			int matchLen = Math.min(matchStep * 2 + 1, stack.size());
			if (strExpect.length() < matchLen) {
				strExpect = s.substring(s.length() - matchLen, s.length());
			}
		}

		return strExpect;
	}
}
