package myPackage;

/* Exercise 9 (write a Java program that takes a number as input and prints its multiplication table up to 10).
Test Data:
Input a number: 8
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

public class Exercise9 {
	
	public static void loop(int nb) {
		for(int i = 1; i <11; i++) {
			System.out.println(nb + " x " + i + " = " + nb*i); 
		}
	}		

	public static void main(String[] args) {
		loop(8);
	}
}