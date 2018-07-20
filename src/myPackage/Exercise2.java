package myPackage;

/* Exercise 2 (write a Java program to print the sum of six numbers).
Test Data: 
74 + 36 + 5 + 10 + 15 + 10
Expected Output:
150
*/

public class Exercise2 {
	
    public static int sumNbs(int nb1, int nb2, int nb3, int nb4, int nb5, int nb6) {
    	int sum = nb1 + nb2 + nb3 + nb4 + nb5 + nb6;
    	return sum;
    	}

    public static void main(String[] args) {
    	int nb1 = 74;
	    int nb2 = 36;
	    int nb3 = 5;
        int nb4 = 10;
        int nb5 = 15;
        int nb6 = 10;
	
	    int result = sumNbs(nb1, nb2, nb3, nb4, nb5, nb6);
	    System.out.println(result);	
	    }
}