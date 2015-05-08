package org.wliu.leetcode.linklist;

import org.wliu.leetcode.common.ListNode;

public class PartitionList {
	
	public ListNode partition(ListNode head, int x) {
		ListNode lessLink_h = new ListNode(0);
		ListNode currLNode = lessLink_h;
		
		ListNode greatLink_h = new ListNode(0);
		ListNode currRNode = greatLink_h;
		
		ListNode tempNode = head;
		while (tempNode != null) {
			if (tempNode.val < x) {
			// when less than x, append to the left link.
				currLNode.next = tempNode;
				currLNode = tempNode;
			} else { // when not less than x, append to the right link
				currRNode.next = tempNode;
				currRNode = tempNode;
			}			
			tempNode = tempNode.next;
		}
		currRNode.next = null;
		currLNode.next = greatLink_h.next;
		
		// clear
		greatLink_h.next = null;
		
		return lessLink_h.next;
	}

}
