package myPackage;

/* Exercise 10 (Write a Java program to compute the specified expressions and print the output).
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output:
2.138888888888889
*/

public class Exercise10 {

	public static double compute(double a, double b, double c, double d) {
		double comp = (a * b - b * b) / (c - d);
		return comp;
	}



	public static void main(String[] args) {
		double varComp;
		
		varComp = compute(25.5, 3.5, 40.5, 4.5);
		System.out.println(varComp);
	}
}