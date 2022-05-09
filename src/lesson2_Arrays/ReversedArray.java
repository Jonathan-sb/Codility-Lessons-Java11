package lesson2_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReversedArray {

	public static void main(String[] args) {
		
		int a[] = {8,10,3,2};
//		System.out.println("Array: ");
//		for(int item:a)
//			System.out.print(item+" ");
		
		// Forma 1 : manual, intercambiando valores de la mitad del arreglo hacia la otra mitad
//		a = reverse(a);
//		System.out.println("\nReversed Array: ");
//		for(int item:a)
//			System.out.print(item+" ");
		
		
		//Forma 2: usando Collections.reverse()
		Integer newA[]=new Integer[a.length];
		for(int i=0;i<a.length;i++) {
			newA[i] = a[i];
		}
		System.out.println("Array: ");
		for(int item:newA)
			System.out.print(item+" ");
		
		newA = CollectionsReverse(newA);
		System.out.println("\nReversed Array: ");
		for(int item:newA)
			System.out.print(item+" ");
	}
	
	public static int[] reverse(int a[]) {
		int n = a.length;
		int k=0,temp;
		for(int i=0;i<n/2;i++) {
			k = n-i-1;
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
		}
		return a;
	}
	
	public static Integer[] CollectionsReverse(Integer newA[]) {
		Collections.reverse(Arrays.asList(newA));
		return newA;
	}

}
