package tnsif.introductiontojava;

public class ArithmeticOperations {
	//Arthmetic Operations in Java
	public static void main(String[] args) {
		
		int age = 23;
		double salary = 125000.00;
		char grade = 'O';
		
		//Implicit or internal conversion - Data widening
		double newSalary = age; 
		
		// Explicit or External - Data Narrowing
		int roundSalary = (int)salary; 
		
		
		int increment = 10000;
		
		int total = roundSalary + increment;
		
		System.out.println(grade);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(roundSalary);
		System.out.println(total);

	}

}
