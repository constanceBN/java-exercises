package myPackage;

/* Exercise 6 (write a Java program to print the sum of two numbers).
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
*/

public class Exercise6 {
	
	public static int sumNbs(int fstNb, int sdNb) {
		int sum = fstNb + sdNb;
		return sum;
	}
	
	public static void main(String[] args) {
		int varSum;
		
		varSum = sumNbs(125, 24);
		System.out.println("125" + " + " + "24" + " = " + varSum);
	}
}