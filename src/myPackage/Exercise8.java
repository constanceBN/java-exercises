package myPackage;

/* Exercise 8 (write a Java program to calculate the remainder of division of two numbers and print the results).
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 mod 24 = 5
*/

public class Exercise8 {
	
	public static int modulo(int fstNb, int sdNb) {
		int mod = fstNb % sdNb;
		return mod;
		}		

	public static void main(String[] args) {
		int varMod;
		
		varMod = modulo(125, 24);
		System.out.println("125 " + "%" + " 24" + " = " + varMod);
		}
}