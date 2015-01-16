package org.wliu.leetcode;
/**
 * http://www.programcreek.com/2012/12/leetcode-median-of-two-sorted-arrays-java/
 * Only support 2 arrays with the same order ASE
 * @author liuwu
 *
 */
public class MedianOfTwoSortedArrays4 {
    public double findMedianSortedArrays(int A[], int B[]) {
    	
    	int m = A.length, n = B.length;
    	
    	if ((m + n) % 2 == 0) { // even
    		return (findMedium(A, B, (m+n)/2 - 1, 0, m-1, 0, n-1) + findMedium(A, B, (m+n)/2, 0, m-1, 0, n-1)) * 0.5;
    	} else { // odd
    		return findMedium(A, B, (m+n)/2, 0, m-1, 0, n-1);
    	}
    }
    
    private int findMedium(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd) {
    	
    	int alen = aEnd - aStart + 1;
    	int blen = bEnd - bStart + 1;
    	
    	if (alen==0) {
    		return B[bStart + k];
    	}
    	if (blen == 0) {
    		return A[aStart + k];
    	}
    	if (k == 0) {
    		return A[aStart] < B[bStart] ? A[aStart]:B[bStart]; // need to think about why
    	}
    	
    	int aMid = alen * k/(alen + blen); // the middle length of A
    	int bMid = k - aMid - 1; // the middle length of B
    	aMid = aStart + aMid; // the index of middle of A
    	bMid = bStart + bMid; // the index of middle of B
    	
    	if (A[aMid] == B[bMid]) {
    		return A[aMid];
    	} else if (A[aMid] > B[bMid]) {
    		k = k - (bMid - bStart + 1);
    		bStart = bMid + 1;
    		aEnd = aMid;
    	} else { // A[aMid] < B[bMid]
    		k = k - (aMid - aStart + 1);
    		aStart = aMid + 1;
    		bEnd = bMid;
    	}
    	
    	return findMedium(A, B, k, aStart, aEnd, bStart, bEnd);
    }
}
