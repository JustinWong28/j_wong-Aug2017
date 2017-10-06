/* justin wong
 * October 4 2017
 * pair programming assignment
 */
import java.util.*;
public class processNumbers {

	public static void main(String[] args) {
		// accepts as user input a string of numbers
		// this code assumes they are ints
		// prints the smallest and largest of all the numbers supplied by user
		// Print the sum of all the even numbers the user typed,
		// along with the largest even number typed
		
			System.out.print("How many numbers?");
			Scanner console = new Scanner(System.in);
			int totalNum = console.nextInt();
			System.out.print("Enter the string of numbers");

		    String numbers = console.nextLine().toString();
			
			int greatestNum= -999999;
			int sum = 0;
			int smallestNum = console.nextInt();
			if(smallestNum %2 == 0) {
				sum += smallestNum;
			}
			int greatestEvenNum = -999999;
			int next = smallestNum;
			for (int i = 1; i < totalNum; i++) {
				
				if(next %2 == 0) {
					sum += next;
					if(next > greatestEvenNum) {
						greatestEvenNum = next;
					}
				}
				if (next > greatestNum) {
					greatestNum = next;
				} else if (next < smallestNum) {
					smallestNum = next;
				}
				next = console.nextInt(); 
			}
			System.out.println("The smallest number supplied is: " + smallestNum);
			System.out.println("The largest number supplied is: " + greatestNum);
			
			System.out.println("The sum of all the even numbers is: " + sum); 
			System.out.println("The greatest even number is: " + greatestEvenNum);
			
			
		}

	}
