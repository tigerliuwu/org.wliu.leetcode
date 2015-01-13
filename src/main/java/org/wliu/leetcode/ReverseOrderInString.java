package org.wliu.leetcode;

import org.wliu.leetcode.common.StringUtil;

/**
 * http://www.programcreek.com/2014/02/leetcode-reverse-words-in-a-string-java/
 * @author liuwu
 *
 */
public class ReverseOrderInString {
	
	public static String EMPTY_STRING = "";
	
	public static String revertOrder(String strSrc, String split) {
		if (strSrc == null || EMPTY_STRING.equals(strSrc)) {
			return strSrc;
		}
		
		if (split == null || EMPTY_STRING.equals(split)) {
			return strSrc;
		}
		
		String[] splitResult = strSrc.split(split);
		StringBuilder resultBuilder = new StringBuilder();
		for (int i=splitResult.length-1; i>=0 ; i--) {
			if (!EMPTY_STRING.equals(splitResult[i])) {
				resultBuilder.append(splitResult[i]);
				if (i != 0 ){
					resultBuilder.append(split);
				}
			}
		}
				
		return resultBuilder.toString();
	}
	
	public static String revertOrder2(String strSrc, String split) {
		if (strSrc == null || EMPTY_STRING.equals(strSrc)) {
			return strSrc;
		}
		
		if (split == null || EMPTY_STRING.equals(split)) {
			return strSrc;
		}
		
		String[] splitResult = StringUtil.splitWithoutRegex(strSrc, split);
		StringBuilder resultBuilder = new StringBuilder();
		for (int i=splitResult.length-1; i>=0 ; i--) {
			if (!EMPTY_STRING.equals(splitResult[i])) {
				resultBuilder.append(splitResult[i]);
				if (i != 0 ){
					resultBuilder.append(split);
				}
			}
		}
				
		return resultBuilder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(ReverseOrderInString.revertOrder("the sky is blue", " "));
	}

}
