package org.wliu.leetcode.linklist;

import org.wliu.leetcode.common.ListNode;

public class RemoveDupFromSortList {
	
	public ListNode deleteDuplicates(ListNode head) {
		
		ListNode prev = head;
		if (head==null || head.next==null) return head;
		ListNode currNode = head.next;
		boolean isExist = false;
		while (currNode != null) {
			if (prev.val == currNode.val) { // same
				currNode = currNode.next;
				isExist = true;
			} else {
				if (isExist) {
					prev.next = currNode;
					isExist = false;
				}
				prev = currNode;
				currNode = currNode.next;
			}
		}
		if (isExist) {
		    prev.next = null;
		}
		return head;
	}

}
