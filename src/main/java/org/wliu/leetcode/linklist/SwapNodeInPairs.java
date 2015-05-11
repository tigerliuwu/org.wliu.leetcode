package org.wliu.leetcode.linklist;

import org.wliu.leetcode.common.ListNode;

public class SwapNodeInPairs {
	
	public ListNode swapPairs(ListNode head) {
		
		if (head == null || head.next==null) {
			return head;
		}
		
		ListNode dummyNode = new ListNode(-1);
		dummyNode.next = head;
		ListNode tempNode = null;
		for (ListNode prev=dummyNode, curNode = prev.next, nextNode = curNode.next;
				nextNode !=null;
				prev = curNode, curNode= curNode.next, nextNode = (curNode==null?null:curNode.next)) {
			tempNode = nextNode.next;
			nextNode.next = curNode;
			curNode.next = tempNode;
			prev.next = nextNode;
		}
		
		return dummyNode.next;
	}

}
