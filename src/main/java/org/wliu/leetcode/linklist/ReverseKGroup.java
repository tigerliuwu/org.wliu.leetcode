package org.wliu.leetcode.linklist;

import org.wliu.leetcode.common.ListNode;

public class ReverseKGroup {
	/**
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode reverseKGroupOrder(ListNode head, int k) {
		
		if (head == null || head.next == null || k < 2) {
			return head;
		}
		
		ListNode dummyNode = new ListNode(-1);
		dummyNode.next = head;
		ListNode prevNode = head;
		ListNode curNode = head;
		// find the correct k group
		for (int i = 0; i < k; i++) {
			if (curNode != null) {
				prevNode =curNode;
				curNode = curNode.next;
			} else {
				return head;
			}
			
		}
		// find the next correct group
		ListNode nextGroup = reverseKGroupOrder(curNode,k);
		prevNode.next = nextGroup;
		prevNode = head;
		curNode = head.next;
		while (curNode != null && curNode != nextGroup) {
			prevNode.next = curNode.next;
			curNode.next = dummyNode.next;
			dummyNode.next = curNode;
			
			curNode = prevNode.next;
			
		}	
		
		return dummyNode.next;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		ListNode node = new ReverseKGroup().reverseKGroupOrder(head, 2);
		
		while (node !=null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
