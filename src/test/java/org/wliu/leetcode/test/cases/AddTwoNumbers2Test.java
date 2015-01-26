package org.wliu.leetcode.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.wliu.leetcode.AddTwoNumbers2;
import org.wliu.leetcode.ListNode;

public class AddTwoNumbers2Test {

	@Test
	public void testAddTwoNumbers() {
		test1();
		test2();
		test3();
		test4();
	}
	/**
	 * {81, 12} = {93}
	 */
	private void test1() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(1);
		
		ListNode expected = new ListNode(3);
		expected.next = new ListNode(9);
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers(l1, l2)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers2(l1, l2)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers3(l1, l2)));
	}
	/**
	 * {9, 98} = {107}
	 */
	private void test2() {
		ListNode l1 = new ListNode(9);
		
		ListNode l2 = new ListNode(8);
		l2.next = new ListNode(9);
		
		ListNode expected = new ListNode(7);
		expected.next = new ListNode(0);
		expected.next.next = new ListNode(1);
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers(l1, l2)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers2(l1, l2)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers3(l1, l2)));
	}
	
	/**
	 * {98, 9} = {107}
	 */
	private void test3() {
		ListNode l1 = new ListNode(9);
		
		ListNode l2 = new ListNode(8);
		l2.next = new ListNode(9);
		
		ListNode expected = new ListNode(7);
		expected.next = new ListNode(0);
		expected.next.next = new ListNode(1);
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers(l2, l1)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers2(l2, l1)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers3(l2, l1)));
	}
	
	/**
	 * {98, } = {98}
	 */
	private void test4() {
		
		ListNode l2 = new ListNode(8);
		l2.next = new ListNode(9);
		
		ListNode expected = new ListNode(8);
		expected.next = new ListNode(9);
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers(l2, null)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers2(l2, null)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers3(l2, null)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers(null, l2)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers2(null, l2)));
		assertEquals(true, isSame(expected, new AddTwoNumbers2().addTwoNumbers3(null, l2)));
	}
	
	private boolean isSame(ListNode expected, ListNode actual) {
		
		boolean isResultSame = false;
		
		ListNode l1 = expected, l2 = actual;
		
		while(l1 != null && l2 != null) {
			if (l1.val != l2.val) {
				break;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		
		if (l1 == l2 && l1 == null) {
			isResultSame = true;
		}
		
		return isResultSame;
	}

}
