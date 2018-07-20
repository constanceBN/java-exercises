package myPackage;

/* Exercise 7 (write a Java program to divide two numbers and print the results without the digits after the comma).
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 / 24 = 5
*/

public class Exercise7 {
	
	public static int divide(int fstNb, int sdNb) {
		int div = fstNb / sdNb;
		return div;
	}	

	public static void main(String[] args) {
		int varDiv;
		
		varDiv = divide(125, 24);
		System.out.println("125 " + "/" + " 24" + " = " + varDiv);
	}
}