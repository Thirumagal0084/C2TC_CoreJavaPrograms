package tnsif.userinputs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your register no.: ");
		int reg = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your Department: ");
		String dept = sc.nextLine();
		
		System.out.println("The Register no. is: " + uid);
		
		System.out.println("The Dept is: " + dept);
		
		
	}
	


}
