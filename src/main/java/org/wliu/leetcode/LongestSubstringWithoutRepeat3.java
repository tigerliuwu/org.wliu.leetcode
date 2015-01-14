package org.wliu.leetcode;


/**
 * <link>http://www.programcreek.com/2013/02/leetcode-longest-substring-without-repeating-characters-java/</link>
 * Longest Substring Without Repeating Characters (Java)
 * @author liuwu
 *
 */
public class LongestSubstringWithoutRepeat3 {
	final String EMPTY_STR="";
    public int lengthOfLongestSubstring(String s) {
    	if (s==null) {
    		return 0;
    	}
    	
    	int len = s.length(); // length of the source String
    	int begin = 0; // the begin cursor
    	int end = 0;
    	int cur_max =0, max = 0;
    	int curIndex = 0;
    	char[] target = s.toCharArray();
    	while(end < len) {

    		while (end < len) {
    			curIndex = begin;	    		
	    		while(curIndex < end && target[curIndex] != target[end]) {
	    			curIndex++;
	    		}
	    		if (curIndex < end) {
	    			cur_max = end - begin;
	    			if (cur_max > max) {
	    				max = cur_max;
	    			}
	    			break;
	    		}
	    		end ++;
    		}
    		if (end < len) {
    			begin = curIndex + 1;
    			end = end + 1;
    		}
    	}    	
    	
    	cur_max = end - begin;
    	if (cur_max > max) {
    		max = cur_max;
    	}
    	
        return max;
    }
    
    /**
     * make good use of HashMap to simply the implementation
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
    	if (s==null) {
    		return 0;
    	}
    	
    	char[] target = s.toCharArray();
    	int max = 0;
    	int tempMax = 0;
    	java.util.Map<Character, Integer> map = new java.util.HashMap<Character, Integer>();
    	java.util.Set<Character> set = new java.util.HashSet<Character>();
    	for (int i = 0; i < target.length; i++) {
    		if (map.containsKey(target[i])) {
    			tempMax = map.size();
    			if (tempMax > max) {
    				max = tempMax;
    			}
    			int value = map.get(target[i]);
    			for (java.util.Map.Entry<Character, Integer> entry : map.entrySet()) {
    				if (entry.getValue().intValue() < value) {
    					set.add(entry.getKey());
    				}
    			}
    			if (!set.isEmpty()) {
	    			for (Character key : set) {
	    				map.remove(key);
	    			}
	    			set.clear();
    			}
    			
    			map.put(target[i], i);
    		} else {
    			map.put(target[i], i);
    		}
    	}
    	if (!map.isEmpty()) {
    		tempMax = map.size();
    		if (tempMax > max) {
    			max = tempMax;
    		}
    	}
    	
    	return max;
    }

    public int lengthOfLongestSubstring3(String s) {
    	if (s==null) {
    		return 0;
    	}
    	
    	char[] target = s.toCharArray();
    	int max = 0;
    	java.util.Map<Character, Integer> map = new java.util.HashMap<Character, Integer>();
    	for (int i = 0; i < target.length; i++) {
    		if (map.containsKey(target[i])) {
    			if (map.size() > max) {
    				max = map.size();
    			}
    			i = map.get(target[i]);
    			map.clear();
    		} else {
    			map.put(target[i], i);
    		}
    	}
    	if (map.size() > max) {
    		max = map.size();
    	}
    	
    	return max;
    }
}
