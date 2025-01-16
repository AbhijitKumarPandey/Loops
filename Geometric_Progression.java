package For_loop;

import java.util.Scanner;

public class Geometric_Progression {
	public static void main(String[] args) {
		// Display This GP - 1,2,4,8,16,32,...UPTO N-terms 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 1, r = 2;
		for(int i=1; i<=n; i++) {
			System.out.print(a + " "); 
			a=a*r;
			
		}
		System.out.println();
	}

}
