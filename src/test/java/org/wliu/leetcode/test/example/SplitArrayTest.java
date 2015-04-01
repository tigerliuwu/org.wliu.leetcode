package org.wliu.leetcode.test.example;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wliu.leetcode.example.SplitArray;

public class SplitArrayTest {
	
	private int[] data0;
	private int[] data1;
	private int[] datas;

	@Before
	public void setUp() throws Exception {
		data0 = new int[]{};
		data1 = new int[]{1};
		datas = new int[]{0,1,2,3,5,6,8,10,15};
	}

	@After
	public void tearDown() throws Exception {
		this.datas = null;
	}

	@Test
	public void testFind() {
		assertTrue(SplitArray.find(data0, 0)==-1);
		assertTrue(SplitArray.find(data1, 0)==-1);
		assertTrue(SplitArray.find(data1, 1)==0);
		assertTrue(SplitArray.find(datas, 0)==0);
		assertTrue(SplitArray.find(datas, 15)==8);
		assertTrue(SplitArray.find(datas, 8)==6);
		assertTrue(SplitArray.find(datas, 10)==7);
		assertTrue(SplitArray.find(datas, 11)==-1);
		assertTrue(SplitArray.find(datas, -1)==-1);
	}

}
