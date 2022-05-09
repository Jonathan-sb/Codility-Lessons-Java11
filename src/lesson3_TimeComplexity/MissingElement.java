package lesson3_TimeComplexity;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.solution(new int[] {2,3,1,5}));
		System.out.println(s.solution(new int[] {1,3}));
	}

	static class Solution {
		// [2], [2,3],[1,3],[4,2,1]
		// [1,2,3,4,5]
		// [1]
		public int solution(int[] A) {
			
			int len = A.length;
			if (len > 0) {
				Arrays.sort(A);
				for (int i = 0; i < len; i++) {
					if(A[i]!=i+1) {
						return i+1;
					}
				}
				return len+1;
			}
			
			return 1;
		}

	}

}
