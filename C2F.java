import java.util.Scanner;

// Harsha Dindigal (hd4ka
public class C2F {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the temperature in Celsius? ");
		double x = keyboard.nextInt();
		double y = ((9*x)/5) + 32;
		System.out.print("It is " + y + " degrees Fahrenheit");
	}

}
