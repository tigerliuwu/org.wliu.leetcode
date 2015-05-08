package org.wliu.leetcode.linklist;

import org.wliu.leetcode.common.LinkNode;

/**
 * <p>You are given two linked lists representing two non-negative numbers. e digits are stored in reverse
order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.</p>
<p>Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8</p>
 * @author liuwu
 *
 */
public class Add2Numbers {
	
	public LinkNode addTwoNumbers(LinkNode l1, LinkNode l2) {
		LinkNode ln1 = l1;
		LinkNode ln2 = l2;

		LinkNode node = new LinkNode();
		LinkNode header = node;
		int leftVal = 0;
		
		while (ln1 !=null || ln2 !=null) {
			if (ln1 != null) {
				leftVal += ln1.value;
				ln1 = ln1.next;
			} 
			if (ln2 != null) {
				leftVal +=ln2.value;
				ln2 = ln2.next;
			}
			node.next = new LinkNode();
			node = node.next;
			if (leftVal >= 10) {
				node.value = leftVal % 10;
				leftVal = leftVal / 10;
			} else {
				node.value = leftVal;
				leftVal = 0;
			}
			
		}
		
//		if (ln2 != null) {
//			ln1 = ln2;
//		}
//		
//		while (ln1 != null) {
//			leftVal = ln1.value + leftVal;
//			node.next = new LinkNode();
//			node = node.next;
//			if (leftVal >= 10) {
//				node.value = leftVal % 10;
//				leftVal = leftVal / 10;
//			} else {
//				node.value = leftVal;
//				leftVal = 0;
//			}
//			ln1 = ln1.next;
//		}
		
		if (leftVal > 0) {
			node.next = new LinkNode(leftVal, null);
		}
		
		node = header.next;
		header.next = null;
		return node;
	}

}
