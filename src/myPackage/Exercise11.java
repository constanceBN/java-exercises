package myPackage;

/* Exercise 11 (Write a Java program to compute a specified formula).
Specified Formula: 
4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)) 
Expected Output:
2.9760461760461765
*/

public class Exercise11 {
	
	public static double compute(double a, double b, double c, double d, double e, double f, double g) {
		double comp = a * (b - (b / c) + (b / d) - (b / e) + (b / f) - (b / g));
		return comp;
	}

	public static void main(String[] args) {
		double varCompute;
		
		varCompute = compute(4.0, 1.0, 3.0, 5.0, 7.0, 9.0, 11.0);
		System.out.println(varCompute);
	}
}			