package fracCalc;

import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		boolean done = false;
		while(!done) {
			String expression = userInput.nextLine();
			String answer = produceAnswer(expression);
			System.out.println(answer);
			if(expression.equals("quit")) {
				done = true;
			}
		}
	}

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
	//      e.g. input ==> "1/2 + 3/4"
	//        
	// The function should return the result of the fraction after it has been calculated
	//      e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) { 

		String[] operand =  input.split(" "); 
		Fraction answer = null;
		Fraction operand1 = new Fraction(operand[0]);
		Fraction operand2;
		
		
		for (int i = 2; i < operand.length; i+=2) {
			operand2 = new Fraction(operand[i]);
			String operator = operand[i-1];
			if(operand1.getDenominator() == 0 || operand2.getDenominator() == 0) {
				return "Cannot divide by zero.";
		
			}else if(operator.equals("+")) {
				answer = operand1.add(operand2);
			}else if(operator.equals("-")) {
				answer =  operand1.subtract(operand2);
			}else if(operator.equals("*")) {
				answer = operand1.multiply(operand2);
			}else if(operator.equals("/")) {
				answer = operand1.divide(operand2);
			}
			answer.reduceAnswer();
		}
		
			return answer.toString();
	}
}
	