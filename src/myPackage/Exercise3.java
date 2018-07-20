package myPackage;
	
/* Exercise 3 (write a Java program to divide two numbers and print the sum on the screen).
Test Data: 
50 / 3
Expected Output:
16.6666667
*/

public class Exercise3 {
	
	public static double divide(double nb1, double nb2) {
		double div = nb1 / nb2;
		return div;
		}

    public static void main(String[] args) {
    	double nb1 = 50.0;
		double nb2 = 3.0;
		
		double resultDiv = divide(nb1, nb2);
		System.out.println(resultDiv);	
		}
}