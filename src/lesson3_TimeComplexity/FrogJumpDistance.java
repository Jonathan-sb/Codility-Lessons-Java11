package lesson3_TimeComplexity;

public class FrogJumpDistance {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println(s.solution(2, 11, 3 ));
		System.out.println(s.solution(5, 105, 3));
		System.out.println(s.solution(1,5,2));
		System.out.println(s.solution(10,85,30));
		
		//System.out.println(s.solution( ));

	}
	
	static class Solution{
		
		public int solution(int X,int Y,int D) {
			int dif = Y - X;
			double res = (double)dif / D;
			if(res%D!=0)
				return (int)res+1;
			return (int)res;
		}
		
	}

}
