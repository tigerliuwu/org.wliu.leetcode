package org.wliu.leetcode.test.cases;

import org.junit.Assert;

import org.junit.Test;
import org.wliu.leetcode.ReverseOrderInString;

public class ReverseOrderInStringTest {

	@Test
	public void testRevertOrder() {
		Assert.assertEquals("blue is skype the", ReverseOrderInString.revertOrder("the skype is blue", " "));
		Assert.assertEquals("", ReverseOrderInString.revertOrder("", " "));
		Assert.assertEquals(null, ReverseOrderInString.revertOrder(null, " "));
		Assert.assertEquals("the skype is blue", ReverseOrderInString.revertOrder("the skype is blue", null));
	}
	@Test
	public void testRevertOrder2() {
		Assert.assertEquals("blue is skype the", ReverseOrderInString.revertOrder2("the skype is blue", " "));
		Assert.assertEquals("", ReverseOrderInString.revertOrder2("", " "));
		Assert.assertEquals(null, ReverseOrderInString.revertOrder2(null, " "));
		Assert.assertEquals("the skype is blue", ReverseOrderInString.revertOrder2("the skype is blue", null));
	}
}
