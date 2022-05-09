package lesson1_Iterations;

public class Iterations {

	public static void main(String[] args) {

		/*
		 * for(int i = 0; i<100+1; i++) { System.out.println(i); }
		 */

		/*
		 * int factorial = 1; int n = 4; for(int j=1; j<n+1;j++) { factorial*=j; }
		 * System.out.println("Factorial de "+n+" : "+factorial);
		 */

		/*
		 * int rows = 5; for(int k = 1;k<rows+1;k++) { for(int l = 1;l<=k;l++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		/*
		 * int n = 6; for(int i=n;i>=0;i--) { for(int j=0;j<n-i;j++) {
		 * System.out.print("   "); } for(int j=0;j<(2*i)-1;j++) {
		 * System.out.print(" * "); } System.out.println(""); }
		 */

		/*
		 * int result = 0,n=100; while (n > 0) { n = n / 10; result += 1; }
		 * System.out.println("Res: "+result);
		 */

		/*
		 * int a = 0; int b = 1,c=0; int n = 5; while (a <= n) { System.out.println(a);
		 * c = a + b; a = b; b = c; }
		 */

		/*
		 * int n = 3; n=n*2-1; boolean flag = true; // inicia sin espacios for(int
		 * i=1;i<n+1;i++) { for(int j=1;j<n+1;j++) { if(flag) { // con espacios en index
		 * pares if(j%2==0) { System.out.print("-"); }else { System.out.print("*"); }
		 * }else { if(j%2!=0) { // con espacios en index impares System.out.print("-");
		 * }else { System.out.print("*"); } } } flag=!flag; System.out.println(); }
		 */

		/*
		 * int n = 9; int temp = n; for (int i = 1; i <= n; i++) { for (int j = 1; j <=
		 * n; j++) { if (i == j | j == temp) { System.out.print("*"); } else {
		 * System.out.print("-"); }
		 * 
		 * } temp--; System.out.println(); }
		 */

		/*
		 * int n = 10; for(int i=1;i<=n;i++) { for(int j=1;j<=n;j++) { if(i==1|i==n) {
		 * System.out.print("*"); }else { if(j==1|j==n) { System.out.print("*"); }else
		 * System.out.print(" "); } } System.out.println(); }
		 */

		/*
		 * int n = 5; int piv = n/2+1; for(int i=1;i<=n;i++) { for(int j=1;j<=n;j++) {
		 * if(j==piv|i==piv) { System.out.print("*"); }else System.out.print(" "); }
		 * System.out.println(); }
		 */
		
		/*
		 * int n = 15; int temp = n,piv=n/2+1; for (int i = 1; i <= n; i++) { for (int j
		 * = 1; j <= n; j++) { if (i == j | j == temp | i==piv | j==piv) {
		 * System.out.print("*"); } else { System.out.print("-"); }
		 * 
		 * } temp--; System.out.println(); }
		 */
	}

}
