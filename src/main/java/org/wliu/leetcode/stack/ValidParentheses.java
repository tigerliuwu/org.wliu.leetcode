package org.wliu.leetcode.stack;

public class ValidParentheses {
	
	public boolean isValidParentheses(String s) {
		
		boolean isValid = true;
		
		java.util.Stack<Character> stacks = new java.util.Stack<Character>();
		int size = s.length();
		for (int i = 0; i < size; i++) {
			char tempChar= s.charAt(i);
			if (tempChar=='(' || tempChar=='[') {
				stacks.push(tempChar);
			} else if (tempChar==')') {
				if (stacks.size() == 0) {
					isValid = false;
					break;
				}
				if (stacks.pop() != '(') {
					isValid = false;
					break;
				}
			} else if (tempChar == ']') {
				if (stacks.size() == 0) {
					isValid = false;
					break;
				}
				if (stacks.pop() != '[') {
					isValid = false;
					break;
				}
			}
			if ((size - i + 1) < stacks.size() ) {
			    isValid = false;
			    break;
			}
		}
		if (isValid && stacks.size() > 0) {
			isValid = false;
		}
		
		return isValid;
	}

}
