package lesson2_Arrays;

public class NegativeAirTemperatures {

	public static void main(String[] args) {
		int temps[]=fillTemps();
		for(int i=0;i<temps.length;i++) {
			System.out.print(temps[i]+" ");
		}
		System.out.println();
		System.out.println(negative(temps));

	}
	
	public static int[] fillTemps() {
		int temps[]=new int[25];
		for(int i=0;i<temps.length;i++) {
			temps[i]=(int)(Math.random()*(20-(-15)))+(-15);
		}
		return temps;
	}
	
	public static int negative(int temps[]) {
		int length=temps.length;
		int days=0;
		
		// dos formas de recorrer el arreglo
		//1. iterando sobre sus elementos
		for(int t:temps) {
			if(t<0)
				days+=1;
		}
		//2. iterando sobre los index
		/*for(int i=0;i<length;i++) {
			if(temps[i]<0)
				days+=1;
		}*/
		return days;
	}

}
