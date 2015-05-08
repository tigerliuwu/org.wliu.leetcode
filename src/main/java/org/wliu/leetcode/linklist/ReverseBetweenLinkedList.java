package org.wliu.leetcode.linklist;

import org.wliu.leetcode.common.ListNode;

public class ReverseBetweenLinkedList {
	
	public ListNode reverseBetweenLinkedList(ListNode l, int m, int n) {
		
		if (m==n) {
			return l;
		}
		
		ListNode ln = l;
		
		int counter = 0;
		
		ListNode start = new ListNode(-1);
		ListNode tail = null;
		ListNode stone = null;
		ListNode tempNode = null;
		
		while (ln != null) {
			counter++;
			
			if (counter == m-1) {
				stone = ln;
			}
			while (counter>=m && counter<=n) {
				if (counter == m) {
					tail = ln;
				}
				tempNode = start.next; // next one
				
				start.next = ln;
				ln = ln.next;
				start.next.next = tempNode;
				counter++;
			}
			
			if (counter> n ) {
				if (stone != null) {
					stone.next = start.next;
				} else {
					l = start.next;
				}
				start.next = null;
				tail.next = ln;
				break;
			}
			
			ln = ln.next;
			
		}
		
		
		return l;
	}

}
