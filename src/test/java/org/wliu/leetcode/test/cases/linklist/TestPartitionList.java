package org.wliu.leetcode.test.cases.linklist;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.common.LinkListUtils;
import org.wliu.leetcode.common.ListNode;
import org.wliu.leetcode.linklist.PartitionList;

public class TestPartitionList {

	ListNode  node = null;
	PartitionList ins = null;
	@Before
	public void setUp() throws Exception {
//		node = new ListNode(4);
		ins = new PartitionList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPartition() {
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.partition(node,1), 0));
		
		// 1
		node = new ListNode(1);
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.partition(node,1), 1));
		
		node= new ListNode(3);
		node.next = new ListNode(1);
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.partition(node,2), 13));
		
		node =new ListNode(1); // 1,3,2
		node.next = new ListNode(3);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(2); // 1,3,2,2
		assertTrue(LinkListUtils.isLinkedListEqualsTo(ins.partition(node,1), 1322));
	}

}
