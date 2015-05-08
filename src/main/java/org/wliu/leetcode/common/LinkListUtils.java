package org.wliu.leetcode.common;

public class LinkListUtils {
	
	public static boolean isReverseLinkedListEqualsTo(ListNode nodes, int expected) {
		ListNode node = nodes;
		if (node == null) {
			if (expected ==0) {
				return true;
			} else {
				return false;
			}
			 
		}
		int val = 0;
		int loop = 1;
		while(node !=null) {
			val += loop * node.val;
			node = node.next;
			loop = 10 * loop;
		}
		
		if (val == expected) {
			return true;
		}
		
		return false;
	}

	public static boolean isLinkedListEqualsTo(ListNode nodes, int expected) {
		ListNode node = nodes;
		if (node == null) {
			if (expected ==0) {
				return true;
			} else {
				return false;
			}
			 
		}
		int val = 0;
		while(node !=null) {
			val = 10 * val + node.val;
			node = node.next;
		}
		
		if (val == expected) {
			return true;
		}
		
		return false;
	}
}
