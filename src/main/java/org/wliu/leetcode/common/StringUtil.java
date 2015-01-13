package org.wliu.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
	public static String EMPTY="";
	public static String[] EMPTY_STR_ARRAY= new String[0];
	
	public static String[] splitWithoutRegex(String strSrc, String split) {
		if (strSrc==null) {
			return null;
		}
		
		if (EMPTY.equals(strSrc)) {
			return EMPTY_STR_ARRAY;
		}
		
		if (split==null || EMPTY.equals(split)) {
			return new String[]{strSrc};
		}
		
		int begin = 0;
		int end = strSrc.length();
		
		List<String> resultList = new ArrayList<String>();
		int beg = 0;
		while(begin <= end) {
			beg = strSrc.indexOf(split, begin);
			if (beg >= 0) {
				resultList.add(strSrc.substring(begin, beg));
				begin = beg+split.length();
			} else {
				resultList.add(strSrc.substring(begin));
				break;
			}
		}
		
		return resultList.toArray(new String[resultList.size()]);
	}
}
