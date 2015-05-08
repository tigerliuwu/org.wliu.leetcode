package org.wliu.leetcode.test.cases.linklist;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.common.LinkListUtils;
import org.wliu.leetcode.common.ListNode;
import org.wliu.leetcode.linklist.Add2Numbers;

public class TestAddTwoNumbers {
	
	private ListNode ln1 = null;
	private ListNode ln2 = null;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}
	

	@Test
	public void testAddTwoNumbers() {
		Add2Numbers addInstance = new Add2Numbers();
		ListNode node;
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(LinkListUtils.isReverseLinkedListEqualsTo(node, 0));
		
		ln1 = new ListNode(9); // ln1 =9 ln2=null
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(LinkListUtils.isReverseLinkedListEqualsTo(node, 9));
		
		ln1.next = new ListNode(5); // ln1 =9,5 ln2=null
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(LinkListUtils.isReverseLinkedListEqualsTo(node, 59));
		
		
		ln2 = new ListNode(5); // ln1 =9,5 ln2=5
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(LinkListUtils.isReverseLinkedListEqualsTo(node, 59+5));
		
		ln2.next = new ListNode(8); // ln1 =9,5 ln2=5,8
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(LinkListUtils.isReverseLinkedListEqualsTo(node, 59+85));
	}

}
