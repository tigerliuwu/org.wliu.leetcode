package org.wliu.leetcode.stack;

import java.util.Stack;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		
		int max = 0;
		
		int counter = 0;
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length() - max; i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.size() < 1) {
					if (counter > max) {
						max = counter;
					}
					counter = 0;
				} else {
					stack.pop();
					counter+=2 ;
				}
			}
		}
		if (counter > max) {
			max = counter;
		}
		
		return max;
	}

}
