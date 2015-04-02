package org.wliu.leetcode.test.cases.arrays;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.arrays.SearchMinimum;

public class SearchMinimumTest extends SearchMinimum {
	private int[] data0;
	private int[] data1;
	private int[] data2;
	private int[] data1_1;
	private int[] data2_1;
	private int[] datao;
	private int[] datao2;
	private int[] datae;
	private int[] datae2;
	private int[] data;
	private int[] data_1;
	private int[] data_2;
	@Before
	public void setUp() throws Exception {
		data0 = new int[]{0};
		data1 = new int[]{2,-1};
		data1_1 = new int[]{2,-1};
		data2 = new int[] {2,-1,1};
		data2_1 = new int[]{2,1,1};
		datao = new int[] {6,7,0,1,2,3,4};
		datao2 = new int[] {6,7,0,0,1,1,1};
		datae = new int[] {3,4,5,6,7,-1,1,2};
		datae2 = new int[] {3,3,4,5,0,0,1,1,1,2,2,2};
		
		data = new int[] {1,2,3,4};
		data_1 = new int[] {1,2,2,3,4,4};
		data_2 = new int[]{1,3,3,3};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearchMinimum() throws Exception{
		
		// no duplicate
		assertEquals(0,SearchMinimum.searchMinimum(data0));
		assertEquals(-1,SearchMinimum.searchMinimum(data1));
		assertEquals(-1,SearchMinimum.searchMinimum(data2));
		assertEquals(0,SearchMinimum.searchMinimum(datao));
		assertEquals(-1,SearchMinimum.searchMinimum(datae));
		assertEquals(1,SearchMinimum.searchMinimum(data));
		
		// duplicate & non-duplicate
		// non-duplicate
		assertEquals(0,SearchMinimum.searchMinimum2(data0));
		assertEquals(-1,SearchMinimum.searchMinimum2(data1));
		assertEquals(-1,SearchMinimum.searchMinimum2(data2));
		assertEquals(0,SearchMinimum.searchMinimum2(datao));
		assertEquals(-1,SearchMinimum.searchMinimum2(datae));
		// duplicate
		assertEquals(-1,SearchMinimum.searchMinimum2(data1_1));
		assertEquals(1,SearchMinimum.searchMinimum2(data2_1));
		assertEquals(0,SearchMinimum.searchMinimum2(datao2));
		assertEquals(0,SearchMinimum.searchMinimum2(datae2));	
		assertEquals(1,SearchMinimum.searchMinimum2(data));
		assertEquals(1,SearchMinimum.searchMinimum2(data_1));
		assertEquals(1,SearchMinimum.searchMinimum2(data_2));
	}

}
