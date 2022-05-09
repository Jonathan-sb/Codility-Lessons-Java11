package lesson3_TimeComplexity;

import java.util.Arrays;

public class TapeEquilibrium {

	public static void main(String[] args) {
		Solution s= new Solution();
		
		
		System.out.println(s.solution(new int[] {1, 2, 3, 4, 2}));
	}
	
	static class Solution {
		
		public int solution(int[] A) {
			
			int tempSum = 0;
			int currentValue = 0;
			int firstPartSum = 0;
			int secondPartSum = Arrays.stream(A).sum();
			
			int minimal = 0;
			int aLen = A.length;
			for(int i=0;i<aLen-1;i++) {
				currentValue = A[i];
				firstPartSum+=currentValue;
				secondPartSum-=currentValue;
				tempSum = Math.abs(firstPartSum - secondPartSum);
				if(tempSum<minimal || i==0) {
					minimal = tempSum;
				}
			}
			
			return minimal;
		}

	}
}