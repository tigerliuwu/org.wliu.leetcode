package org.wliu.leetcode.test.cases.linklist;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.common.LinkNode;
import org.wliu.leetcode.linklist.Add2Numbers;

public class TestAddTwoNumbers {
	
	private LinkNode ln1 = null;
	private LinkNode ln2 = null;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}
	
	private boolean compAddTrue(LinkNode nodes, int expected) {
		LinkNode node = nodes;
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
			val += loop * node.value;
			node = node.next;
			loop = 10 * loop;
		}
		
		if (val == expected) {
			return true;
		}
		
		return false;
	}

	@Test
	public void testAddTwoNumbers() {
		Add2Numbers addInstance = new Add2Numbers();
		LinkNode node;
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(compAddTrue(node, 0));
		
		ln1 = new LinkNode(9, null); // ln1 =9 ln2=null
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(compAddTrue(node, 9));
		
		ln1.next = new LinkNode(5, null); // ln1 =9,5 ln2=null
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(compAddTrue(node, 59));
		
		
		ln2 = new LinkNode(5, null); // ln1 =9,5 ln2=5
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(compAddTrue(node, 59+5));
		
		ln2.next = new LinkNode(8, null); // ln1 =9,5 ln2=5,8
		node  = addInstance.addTwoNumbers(ln1, ln2); //both null
		assertTrue(compAddTrue(node, 59+85));
	}

}
