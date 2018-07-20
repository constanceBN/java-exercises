package myPackage;
	
/* Exercise 4 (write a Java program to print the result of the following operations).
Test Data:
A: -5 + 8 * 6
B: (55 + 9) % 9 
C: 20 + -3 * 5 / 8 
D: 5 + 15 / 3 * 2 - 8 % 3
Expected Output:
43 
1 
19 
13
*/

public class Exercise4 {
	
	public static int operationA(int a, int b, int c) { 
		int opeA = a + b * c;
		return opeA;
		}
			
	public static int operationB(int a, int b, int c) {
		int opeB = (a + b) % c;
		return opeB;
		}
			
	public static int operationC(int a, int b, int c, int d) {
		int opeC = a + b * c / d;
		return opeC;
		}
			
	public static int operationD(int a, int b, int c, int d, int e, int f) {
		int opeD = a + b / c * d - e % f;
		return opeD;
		}

	public static void main(String[] args) {
		int varOpeA;
		int varOpeB;
		int varOpeC;
		int varOpeD;
		
		varOpeA = operationA(-5, 8, 6);
		System.out.println(varOpeA);	
		
		varOpeB = operationB(55, 9, 9);
		System.out.println(varOpeB);	
		
		varOpeC = operationC(20, -3, 5, 8);
		System.out.println(varOpeC);	
		
		varOpeD = operationD(5, 15, 3, 2, 8, 3);
		System.out.println(varOpeD);	
		}
}