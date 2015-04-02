package org.wliu.leetcode.test.cases.arrays;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.arrays.SearchMinimum;

public class SearchMinimumTest extends SearchMinimum {

	private int[] data1;
	private int[] datao;
	private int[] datae;

	@Before
	public void setUp() throws Exception {
		data1 = new int[]{0};
		datao = new int[] {6,7,0,1,2,3,4};
		datae = new int[] {3,4,5,6,7,-1,1,2};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearchMinimum() throws Exception{
		assertEquals(0,SearchMinimum.searchMinimum(data1));
		assertEquals(0,SearchMinimum.searchMinimum(datao));
		assertEquals(-1,SearchMinimum.searchMinimum(datae));
	}

}
