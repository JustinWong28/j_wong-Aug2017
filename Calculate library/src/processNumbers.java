import java.util.*;
public class processNumbers {

	public static void main(String[] args) {
		System.out.println("How many numbers are there?");
		Scanner userinput = new Scanner(System.in);
		int totalNumber = userinput.nextInt();
		int next;
		
		System.out.println("What are the numbers?");
		next = userinput.nextInt();
		
		int max = next;
		int min = next;
		int sumEven = next;
		int largestEven = next;
		
		for(int i = 1; i < totalNumber; i++) {
			next = userinput.nextInt();
			if(next > max) {
				max = next;
			}
			if(next < min) {
				min = next;
			}
			if(next % 2 == 0) {
				sumEven += next;
			}
			if(next > largestEven && next % 2 == 0) {
				largestEven = next;
			}
			
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("The sum of all the even numbers is " + sumEven);
		System.out.println("Largest Even Number: " + largestEven);
		
		
		
		
		
	}

}

	


