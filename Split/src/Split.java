
import java.util.*;
public class Split {

	public static void main(String[] args) {

		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array

		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		System.out.println(Arrays.toString("I reallyreally like apples".split("really")));
		// Example: "I like apples!".split(" "); 
		//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
		//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]

		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?


		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		 */
		System.out.println(Arrays.toString("applespineapplesbreadlettustomatobaconmayohambreadcheese".split("bread")));

		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		 */
		System.out.println(Arrays.toString("apples pineapples bread lettus tomato bacon mayo ham bread cheese".split(" bread ")));

	}
	//task pt.1
	public static void splitSandwich (String sandwich) {
		String[] components= sandwich.split("bread");
		int bottomBread = sandwich.indexOf("bread");
		int topBread = sandwich.indexOf("bread");

		if(bottomBread < 0) {
			System.out.println("not a sandwich");
		}else if(bottomBread >=0 && topBread <0) {
			System.out.println("not a sandwich");
		}else if(components == null) {
			System.out.println("not a sandwich");
		}
		else {
			String middle;
			if(bottomBread+5 == topBread) {
				System.out.println("not a sandwich");
			}else {
				middle =sandwich.substring(bottomBread+5, topBread);
				System.out.println(middle);
			}
		}
	}
	//task pt.2
	public static void splitSandwichConSpaces (String sandwich) {
		int bottomBread = sandwich.indexOf("bread");
		int topBread = sandwich.indexOf("bread" , bottomBread+5);
		if( bottomBread > 0) {
			String middle = sandwich.substring(bottomBread+6 , topBread);
			if (middle.length() > 1) {
				String[] realSandwich = middle.split(" ");
				String newSandwich = Arrays.toString(realSandwich);
				sandwich = newSandwich;
			}else if (middle.length() < 1){
				sandwich = "not a sandwich";
			}else {
				sandwich = "not a sandwich";

			}
			System.out.println(sandwich);
		}
	}
}

