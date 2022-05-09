package lesson3_TimeComplexity;

public class TimeSpaceComlexity {

	public static void main(String[] args) {
		int res = slow_solution(3);
		System.out.println(res);
		
		System.out.println(faster_solution(3));
		
		System.out.println(model_solution(3));
	}
	
	// time complexity: O(n2) , quadractic
	public static int slow_solution(int n) {
		int result = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				result+=1;
			}
		}
		return result;
	}
	
	// time complexity: O(n) , linear
	public static int faster_solution(int n) {
		int result = 0;
		for(int i=0;i<n;i++) {
			result+= i+1;
		}
		return result;
	}
	
	//  space complexity O(1)
	public static int model_solution(int n) {
		return n*(n+1)/2;
	}

}
