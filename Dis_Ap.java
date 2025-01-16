package For_loop;

import java.util.Scanner;

public class Dis_Ap {
	public static void main(String[] args) {
		//  5 9 13 17 21
		System.out.println("Enter your number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
// 
//		for(int i=5; i<=4*n-1; i=i+4) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
		
		// 2nd Method
		// 5 9 13 17 21 25
//		int a = 5, d = 4;
//		for(int i=1; i<=n; i++) {
//			System.out.println(a+" ");
//			a = a+d;
		
		int a=5, d = 4;
		for(int i=1; i<=n;i++) {
			System.out.print(a + " ");
			a=a+d;
		}
		System.out.println();
			 
		 
	}

}
