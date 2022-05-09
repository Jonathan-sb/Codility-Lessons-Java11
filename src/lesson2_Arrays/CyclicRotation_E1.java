package lesson2_Arrays;

import java.util.Iterator;

public class CyclicRotation_E1 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int a[] = {1,2,3,4};
		int k = 4;
		a = s.solution(a, k);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
	
	static class Solution{
		public int[] solution(int[] A, int K) {
			int len = A.length;
			int result[]= new int[len];
			int pos;
			if(len>1) {
				for(int i=0;i<len;i++) {
					if(i+K>=len) {
						//int pos = (i+K)-len;
						pos = findPos(i,K,len);
						result[pos] = A[i];
					}else
						result[i+K] = A[i];
				}
				return result;
			}
			return A;
		}
		public int findPos(int currentPos,int k,int lenArray) {
			int repeats = 0;
			while(repeats<k) {
				if(currentPos>=lenArray-1) {
					currentPos = 0;
				}else
					currentPos+=1;
				repeats++;
			}
			return currentPos;
		}
	}

}
