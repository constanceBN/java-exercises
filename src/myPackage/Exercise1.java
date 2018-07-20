package myPackage;

/*Exercise 1 (write a Java program to print 'Hello' on screen and then print your name and surname on a separate line.)
Expected Output:
Hello 
YourName YourSurname
*/

public class Exercise1 {

	public static String h = "Hello " + "\n";
	public static String info = "Constance Bordes"; 
	
	public static void affichage(String i) { 
		System.out.println(h + i);
	}
	
	public static void main(String[] args) {
		affichage(info);
	}
}