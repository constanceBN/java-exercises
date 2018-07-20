package myPackage;

/* Exercise 5 (write a Java program that takes two numbers as input and display the product of the two numbers).
Test Data:
Input first number: 25
Input second number: 5  
Expected Output:
25 x 5 = 125
*/

public class Exercise5 {
	
	public static int product(int fstNb, int sdNb) {
		int prod = fstNb * sdNb;
		return prod;
	}


	public static void main(String[] args) {
		int varProduct;
		
		varProduct = product(25, 5);
		System.out.println("25" + " x " + "5" + " = " + varProduct);	
		}
}