package org.wliu.leetcode.test.cases.arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.arrays.SearchArray;
import org.wliu.leetcode.arrays.SearchArray2;

public class SearchArray2Test {
	
	private int[] data0;
	private int[] data1;
	private int[] datao;
	private int[] datao2;
	private int[] datae;
	private int[] datae2;

	@Before
	public void setUp() throws Exception {
		data0 = new int[]{};
		data1 = new int[]{0};
		datao = new int[] {2,0,1};
		datao2 = new int[] {1,2,0,1,1,1,1};
		datae = new int[] {3,4,5,6,7,0,1,2};
		datae2 = new int[] {3,3,4,5,0,0,1,1,1,2,2,2};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearch() {
		assertTrue(SearchArray2.search(data0, 0, 0, -1)==-1);
		assertTrue(SearchArray2.search(data1, 0, 1, 0)==0);
		assertTrue(SearchArray2.search(data1, 0, 1, 1)==-1);
		assertTrue(SearchArray2.search(datao, 0, 3, 10)==-1);
		assertTrue(SearchArray2.search(datao, 0, 3, 1)==2);
		assertTrue(SearchArray2.search(datao, 0, 3, 0)==1);
		assertTrue(SearchArray2.search(datao, 0, 3, 2)==0);
		
		assertEquals(-1,SearchArray2.search(datae, 0, 8, 10));
		assertEquals(6,SearchArray2.search(datae, 0, 8, 1));
		assertEquals(5,SearchArray2.search(datae, 0, 8, 0));
		assertEquals(7,SearchArray.search(datae, 0, 8, 2));
		assertEquals(1,SearchArray2.search(datae, 0, 8, 4));
	}
	
	@Test
	public void testsearch2() {
		assertTrue(SearchArray2.search2(data0, -1)==-1);
		assertTrue(SearchArray2.search2(data1, 0)==0);
		assertTrue(SearchArray2.search2(data1, 1)==-1);
		assertTrue(SearchArray2.search2(datao, 10)==-1);
		assertTrue(SearchArray2.search2(datao, 1)==2);
		assertTrue(SearchArray2.search2(datao, 0)==1);
		assertTrue(SearchArray2.search2(datao, 2)==0);
		
		assertEquals(-1,SearchArray2.search2(datae, 10));
		assertEquals(6,SearchArray2.search2(datae, 1));
		assertEquals(5,SearchArray2.search2(datae, 0));
		assertEquals(7,SearchArray2.search2(datae, 2));
		assertEquals(1,SearchArray2.search2(datae, 4));
		
		// test duplicate for datao2
		assertEquals(3,SearchArray2.search2(datao2, 1));
		assertEquals(1,SearchArray2.search2(datao2, 2));
		assertEquals(2,SearchArray2.search2(datao2, 0));
		assertEquals(-1,SearchArray2.search2(datao2, 10));
		assertEquals(-1,SearchArray2.search2(datao2, -10));
		
		// test duplicate for datae2 {3,3,4,5,0,0,1,1,1,2,2,2};
		assertEquals(-1,SearchArray2.search2(datae2, -1));
		assertEquals(-1,SearchArray2.search2(datae2, 111));
		assertEquals(6,SearchArray2.search2(datae2, 1));
		assertEquals(3,SearchArray2.search2(datae2, 5));
		assertEquals(1,SearchArray2.search2(datae2, 3));
		assertEquals(2,SearchArray2.search2(datae2, 4));
		assertEquals(5,SearchArray2.search2(datae2, 0));
		assertEquals(9,SearchArray2.search2(datae2, 2));
	}

}
