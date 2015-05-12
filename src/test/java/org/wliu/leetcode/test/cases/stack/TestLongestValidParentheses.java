package org.wliu.leetcode.test.cases.stack;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.stack.LongestValidParentheses;

public class TestLongestValidParentheses extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testLongestValidParentheses() {
		LongestValidParentheses longestV = new LongestValidParentheses();
		assertTrue(longestV.longestValidParentheses("")==0);
		assertTrue(longestV.longestValidParentheses("(")==0);
		assertTrue(longestV.longestValidParentheses(")")==0);
		assertTrue(longestV.longestValidParentheses("((")==0);
		assertTrue(longestV.longestValidParentheses("())")==2);
		assertTrue(longestV.longestValidParentheses("()")==2);
		assertTrue(longestV.longestValidParentheses(")()")==2);
		assertTrue(longestV.longestValidParentheses("))()")==2);
		assertTrue(longestV.longestValidParentheses(")()()")==4);
		assertTrue(longestV.longestValidParentheses("((()())")==6);
	}

}
