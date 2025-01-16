package For_loop;

import java.util.Scanner;

public class Display_this_Ap {
     public static void main(String[] args) {
    	 // Display the AP 1,3,4,5,7,9...UPTO 'N'
    	 
    	 /* formula = an = a+(n-1)d
    	              an = 1+(n-1)2
    	              an = 2n-1
    	   */
    	 
    	 System.out.println("Enter your number");
    	 Scanner sc = new Scanner(System.in);
    	 int n = sc.nextInt();
    	
//    	 for(int i= 1; i<=2*n-1; i=i+2) {
//    		 System.out.print(i + " ");
//    	 }
//    	 System.out.println();
    	 
    	 // 2nd Method
    	 
    	// 1 3  5 7 9 
    	 int a=1, d = 2;
    	 for(int i=1; i<=n; i++) {
    		 System.out.println(a+" ");
    		 a= a+d;
    		 
    	 }
}
}
