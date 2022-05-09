package lesson2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OddOcurrencesInArray_E2 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] a = {9, 3, 9, 3, 7,4,4,5,6,5,6};
		System.out.println("Res: "+s.solution(a));
	}

	static class Solution {
		public int solution(int[] A) {
			Arrays.sort(A);
			for(int i:A) {
				System.out.print(i+" ");
			}
			for(int i=0;i<A.length;i++) {
				if(i<A.length-1 && A[i]!=A[i+1]) {
					return A[i];
				}
				i++;
			}
			return A[A.length-1];
		}
		
//		int len = A.length;
//		int intAlone = 0;
//		List<Integer> savedPos=new ArrayList<>();
//		for(int i=0;i<len;i++) {
//			if(!savedPos.contains(i)) {
//				for(int j=0;j<len;j++) {
//					
//					boolean c1 = !savedPos.contains(j);
//					boolean c2 = j!=i;
//					boolean flag = !savedPos.contains(j) && j!=i;
//					if(flag) {
//						if(A[i]==A[j]) {
//							savedPos.add(i);
//							savedPos.add(j);
//							break;
//						}
//					}else {
//						if(j==len-1) {
//							intAlone = A[i];
//						}
//					}
//				}
//			}
//		}
//		//savedPos.forEach(s->{System.out.println(s);});
//		return intAlone;
	}

}
