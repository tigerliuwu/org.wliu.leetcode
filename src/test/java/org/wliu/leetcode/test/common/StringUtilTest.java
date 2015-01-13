package org.wliu.leetcode.test.common;

import org.junit.Assert;
import org.junit.Test;
import org.wliu.leetcode.common.StringUtil;

public class StringUtilTest {

	@Test
	public void testSplitWithoutRegex() {
		String strSrc = "hello world";
		Assert.assertArrayEquals(StringUtil.splitWithoutRegex("", null), new String[0]);
		Assert.assertArrayEquals(StringUtil.splitWithoutRegex(null, null), null);
		Assert.assertArrayEquals(StringUtil.splitWithoutRegex(strSrc, null), new String[]{"hello world"});
		Assert.assertArrayEquals(StringUtil.splitWithoutRegex(strSrc, ""), new String[]{"hello world"});
		Assert.assertArrayEquals(StringUtil.splitWithoutRegex(strSrc, " "), new String[]{"hello","world"});
		Assert.assertArrayEquals(StringUtil.splitWithoutRegex(strSrc, "h"), new String[]{"","ello world"});
		Assert.assertArrayEquals(StringUtil.splitWithoutRegex(strSrc, "d"), new String[]{"hello worl",""});
	}

}
