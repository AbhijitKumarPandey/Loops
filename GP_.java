package For_loop;

import java.util.Scanner;

public class GP_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int a=1,r=5;
		
		for(int i=1; i<=n; i++) {
			System.out.print(a+" ");
			a=a*r;
		}
		System.out.println();
	}

}
