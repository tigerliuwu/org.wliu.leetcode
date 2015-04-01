package org.wliu.leetcode.test.cases.arrays;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.arrays.SearchArray;

public class SearchArrayTest {
	
	private int[] data0;
	private int[] data1;
	private int[] datao;
	private int[] datae;

	@Before
	public void setUp() throws Exception {
		data0 = new int[]{};
		data1 = new int[]{0};
		datao = new int[] {2,0,1};
		datae = new int[] {3,4,5,6,7,0,1,2};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearch() {
		assertTrue(SearchArray.search(data0, 0, 0, -1)==-1);
		assertTrue(SearchArray.search(data1, 0, 1, 0)==0);
		assertTrue(SearchArray.search(data1, 0, 1, 1)==-1);
		assertTrue(SearchArray.search(datao, 0, 3, 10)==-1);
		assertTrue(SearchArray.search(datao, 0, 3, 1)==2);
		assertTrue(SearchArray.search(datao, 0, 3, 0)==1);
		assertTrue(SearchArray.search(datao, 0, 3, 2)==0);
		
		assertEquals(-1,SearchArray.search(datae, 0, 8, 10));
		assertEquals(6,SearchArray.search(datae, 0, 8, 1));
		assertEquals(5,SearchArray.search(datae, 0, 8, 0));
		assertEquals(7,SearchArray.search(datae, 0, 8, 2));
		assertEquals(1,SearchArray.search(datae, 0, 8, 4));
	}

}
