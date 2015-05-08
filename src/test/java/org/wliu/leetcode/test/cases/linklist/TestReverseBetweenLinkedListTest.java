package org.wliu.leetcode.test.cases.linklist;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.common.LinkListUtils;
import org.wliu.leetcode.common.ListNode;
import org.wliu.leetcode.linklist.ReverseBetweenLinkedList;

public class TestReverseBetweenLinkedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseBetweenLinkedList() {
		ListNode  node = new ListNode(4);
		ListNode header = node;
		node.next = new ListNode(5);
		node.next.next = new ListNode(6);
		node.next.next.next = new ListNode(7);
		node = node.next.next.next;
		node.next = new ListNode(8);
		node.next.next = new ListNode(9);
		// 4,5,6,7,8,9
		
		ReverseBetweenLinkedList ins = new ReverseBetweenLinkedList();
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.reverseBetweenLinkedList(header, 2, 4), 476589));
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.reverseBetweenLinkedList(header, 2, 2), 476589));
		
		node = new ListNode(3);
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.reverseBetweenLinkedList(node, 1, 1), 3));
		
		node.next = new ListNode(5);
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.reverseBetweenLinkedList(node, 1, 1), 35));
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.reverseBetweenLinkedList(node, 1, 2), 53));
	}

}
