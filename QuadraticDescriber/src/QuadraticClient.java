
/*Justin Wong
 * part 5
 * Runner class for quadrdescriber
 */
import java.util.*;

public class QuadraticClient {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Welcome to Quadratic Describer /nPlease put your values for coeffecients a, b , c:");

		Boolean done = false;
		while (!done) {

			System.out.println("a: ");
			double coeffA = userInput.nextDouble();
			System.out.println("b: ");
			double coeffB = userInput.nextDouble();
			System.out.println("c: ");
			double coeffC = userInput.nextDouble();

			System.out.println(Quadratic.quadrDescriber(coeffA, coeffB, coeffC));

			System.out.println("Do you want to quit? Type \"quit\" to end");
			String exit = userInput.next();
			if (exit.equals("quit")) {
				done = true;
			}
		}
	}
}
