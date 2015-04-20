package org.wliu.leetcode.arrays;

public class MediaOf2SortedArrays {
	
	public static double findMediaOf2SortedArrays(int A[], int B[]) {
	
		
		if ((A.length + B.length) % 2 == 1) { // odd 奇数
			return findKOf2SortedArrays(A, 0, A.length, B, 0, B.length, (A.length + B.length)/2 + 1);
		} else { // even 偶数
			return (findKOf2SortedArrays(A, 0, A.length, B, 0, B.length, (A.length + B.length)/2) + findKOf2SortedArrays(A, 0, A.length, B, 0, B.length, (A.length + B.length)/2 + 1)) * 0.5;
		}
		
	}
	
	public static int findKOf2SortedArrays(int A[], int aStart, int m, int B[], int bStart, int n, int k) {
		if (m > n) {
			return findKOf2SortedArrays(B, bStart, n, A, aStart, m, k);
		}
		
		if (m==0) {
			return B[bStart + k -1];
		}
		
		if (k==1) {
			return Math.min(A[aStart], B[bStart]);
		}
		
		int tempK = Math.min(k/2, m);
		int indexA = aStart + tempK -1;
		int indexB = bStart + (k - tempK) - 1;
		
		if (A[indexA] == B[indexB]) {
			return A[indexA];
		} else if (A[indexA] < B[indexB]) {
			return findKOf2SortedArrays(A, indexA + 1, m - tempK, B, bStart, n, k-tempK);
		} else {
			return findKOf2SortedArrays(A, aStart, m, B, indexB + 1, n - (k - tempK), tempK);
		}
		
	}

}
