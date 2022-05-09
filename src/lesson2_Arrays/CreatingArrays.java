package lesson2_Arrays;

import java.util.Arrays;
import java.util.List;

public class CreatingArrays {

	public static void main(String[] args) {
		
		List<String> shopping = Arrays.asList("bread","butter","cheese");
		String strs[]= {"bread","butter","cheese"};

		int ints[] = new int[10];
		for(int i=0;i<ints.length;i++) {
			System.out.println(ints[i]);
		}
		
	}
	

}
