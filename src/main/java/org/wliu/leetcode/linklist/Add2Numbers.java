package org.wliu.leetcode.linklist;

import org.wliu.leetcode.common.ListNode;

/**
 * <p>You are given two linked lists representing two non-negative numbers. e digits are stored in reverse
order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.</p>
<p>Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8</p>
 * @author liuwu
 *
 */
public class Add2Numbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ln1 = l1;
		ListNode ln2 = l2;

		ListNode node = new ListNode(-1);
		ListNode header = node;
		int leftVal = 0;
		
		while (ln1 !=null || ln2 !=null) {
			if (ln1 != null) {
				leftVal = leftVal + ln1.val;
				ln1 = ln1.next;
			} 
			if (ln2 != null) {
				leftVal =leftVal + ln2.val;
				ln2 = ln2.next;
			}
			node.next = new ListNode(-1);
			node = node.next;
			if (leftVal >= 10) {
				node.val = leftVal % 10;
				leftVal = leftVal / 10;
			} else {
				node.val = leftVal;
				leftVal = 0;
			}
			
		}
		
		if (leftVal > 0) {
			node.next = new ListNode(leftVal);
		}
		
		node = header.next;
		header.next = null;
		return node;
	}

}
