package org.wliu.leetcode.test.cases.arrays;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.arrays.LongestConsecutive;

public class LongestConsecutiveTest {
	
	private static  int[] DATA0;
	private static int[] DATA1;
	private static int[] DATA2;
	private static int[] DATA3;
	private static int[] DATA4;
	private static int[] DATA5;
	private static int[] DATA6;
	
	@Before
	public void setUp() throws Exception {
		DATA0 = new int[] {}; // 0;
		DATA1 = new int[] {1}; // 1;
		DATA2 = new int[] {2,1}; // 2
		DATA3 = new int[] {3, 1, 10}; // 1
		DATA4 = new int[] {3, 1, 2, 10}; // 3
		DATA5 = new int[] {1, 2, 4, 11, 10}; // 2
		DATA6 = new int[] {11, 2, 1, 10, 12, 13}; // 4
	}

	@After
	public void tearDown() throws Exception {
		assertTrue(0==LongestConsecutive.getLongestConsecutiveLength(DATA0));
		assertTrue(1==LongestConsecutive.getLongestConsecutiveLength(DATA1));
		assertTrue(2==LongestConsecutive.getLongestConsecutiveLength(DATA2));
		assertTrue(1==LongestConsecutive.getLongestConsecutiveLength(DATA3));
		assertTrue(3==LongestConsecutive.getLongestConsecutiveLength(DATA4));
		assertTrue(2==LongestConsecutive.getLongestConsecutiveLength(DATA5));
		assertTrue(4==LongestConsecutive.getLongestConsecutiveLength(DATA6));
	}

	@Test
	public void testGetLongestConsecutiveLength() {
//		assertEquals()
	}

}
