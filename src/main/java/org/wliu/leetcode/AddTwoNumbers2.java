package org.wliu.leetcode;

import org.wliu.leetcode.test.common.ListNode;



/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 * @author liuwu
 *
 */

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        if (l1==null && l2==null) {
        	return null;
        }
        
        ListNode result_h= null, result_l = null, temp_l = null;
        ListNode head1 = l1;
        ListNode head2 = l2;
        int calNextVal = 0;
        while (head1 != null && head2 !=null) {
        	if (head1.val + head2.val + calNextVal >=10) {
        		temp_l = new ListNode(head1.val + head2.val + calNextVal -10);
        		calNextVal = 1;
        	} else {
        		temp_l = new ListNode(head1.val + head2.val + calNextVal);
        		calNextVal = 0;
        	}
        	
        	
        	if (result_h == null) {
        		result_h = result_l = temp_l;
        	} else {
        		result_l.next = temp_l;
        		result_l = temp_l;
        	}
        	
        	head1 = head1.next;
        	head2 = head2.next;
        }
        
        while (head1 != null) {
        	
        	if (head1.val + calNextVal >=10) {
        		temp_l = new ListNode(head1.val + calNextVal -10);
        		calNextVal = 1;
        	} else {
        		temp_l = new ListNode(head1.val + calNextVal);
        		calNextVal = 0;
        	}
        	if (result_h == null) {
        		result_h = result_l = temp_l;
        	} else {
        		result_l.next = temp_l;
        		result_l = temp_l;
        	}
        	head1 = head1.next;
        }
        
        while (head2 != null) {
        	if (head2.val + calNextVal >=10) {
        		temp_l = new ListNode(head2.val + calNextVal -10);
        		calNextVal = 1;
        	} else {
        		temp_l = new ListNode(head2.val + calNextVal);
        		calNextVal = 0;
        	}
        	if (result_h == null) {
        		result_h = result_l = temp_l;
        	} else {
        		result_l.next = temp_l;
        		result_l = temp_l;
        	}
        	head2 = head2.next;
        }
        
        if (head1==null && head2 ==null && calNextVal !=0) {
        	temp_l = new ListNode(calNextVal);
        	if (result_h == null) {
        		result_h = result_l = temp_l;
        	} else {
        		result_l.next = temp_l;
        		result_l = temp_l;
        	}
        }
    	return result_h;
     
    }
    
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        
        if (l1==null && l2==null) {
        	return null;
        }
        
        ListNode result_h= null, result_l = null, temp_l = null;
        ListNode head1 = l1;
        ListNode head2 = l2;
        int calNextVal = 0;
        int sum = 0;
        while (head1 != null || head2 !=null) {
        	sum = calNextVal;
        	if (head1 != null) {
        		sum += head1.val;
        	}
        	if (head2 != null) {
        		sum += head2.val;
        	}
        	if (sum >= 10) {
        		temp_l = new ListNode(sum -10);
        		calNextVal = 1;
        	} else {
        		temp_l = new ListNode(sum);
        		calNextVal = 0;
        	}
        	
        	if (result_h == null) {
        		result_h = result_l = temp_l;
        	} else {
        		result_l.next = temp_l;
        		result_l = temp_l;
        	}
        	
        	head1 = head1==null? null:head1.next;
        	head2 = head2==null? null:head2.next;
        }
        
        if (head1==null && head2 ==null && calNextVal !=0) {
        	temp_l = new ListNode(calNextVal);
        	if (result_h == null) {
        		result_h = result_l = temp_l;
        	} else {
        		result_l.next = temp_l;
        		result_l = temp_l;
        	}
        }
    	return result_h;
     
    }
    
    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        
        if (l1==null && l2==null) {
        	return null;
        }
        
        ListNode header = new ListNode(-1);
        ListNode prev = header;
        int calVal = 0;
        int sum = 0;
        for (ListNode left=l1, right = l2; left !=null || right != null; ) {
        	sum = calVal;
        	if (left != null) {
        		sum += left.val;
        	}
        	if (right != null) {
        		sum += right.val;
        	}
        	if (sum >= 10) {
        		prev.next = new ListNode(sum%10);
        		calVal = 1;
        	} else {
        		prev.next = new ListNode(sum);
        		calVal = 0;
        	}
        	
        	prev = prev.next;
        	
        	left=left==null?null:left.next;
        	right=right == null?null:right.next;
        }
        
        if (calVal > 0) {
        	prev.next = new ListNode(calVal);
        }
        
        prev = header.next;
        header.next = null;
        
        return prev;
    }

}
