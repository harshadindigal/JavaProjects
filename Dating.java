// Harsha Dindigal (hd4ka)
import java.util.Scanner;


public class Dating {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How old are you? ");
		int x = keyboard.nextInt();
		int y = (x/2) + 7;
		int z = (2*x) - 13;
		System.out.print("You can date people between " + y + " and " + z + " years old");

	}

}
