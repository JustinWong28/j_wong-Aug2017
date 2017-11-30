package fracCalc;

import java.util.*;

public class FracCalc {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean done = false;
		while(!done) {
			String formula = userInput.nextLine();
			String answer = produceAnswer(formula);
			System.out.println(answer);
			if(formula.equals("quit")) {
				done = true;
			}
		}
	}

	// TODO: Read the input from the user and call produceAnswer with an equation



	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION. This function will be used to
	// test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated. For your program, this
	// will be the user input.
	// e.g. input ==> "1/2 + 3/4"
	//
	// The function should return the result of the fraction after it has been
	// calculated
	// e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
		String[] operand =  input.split(" ");
		String operand1 = toImproperFrac(operand[0]);
		String operand2 = toImproperFrac(operand[2]);
		String operator = operand[1];
		String answer = "";
		int slash1 = operand1.indexOf("/");
		int slash2 = operand2.indexOf("/");
		int numer1 = Integer.parseInt(operand1.substring(0, slash1).trim());
		int numer2 = Integer.parseInt(operand2.substring(0, slash2).trim());
		int denom1 = Integer.parseInt(operand1.substring(slash1 + 1, operand1.length()).trim());
		int denom2 = Integer.parseInt(operand2.substring(slash2 + 1, operand2.length()).trim());
		
		if(operator.equals("+")) {
			answer = addSubtract(numer1, numer2, denom1, denom2, operator);
		}else if (operator.equals("-")) {
			answer = addSubtract(numer1, numer2, denom1, denom2, operator);
		}else if (operator.equals("*")) {
			answer = multiplyDivide(numer1, numer2, denom1, denom2, operator);
		}else if (operator.equals("/")) {
			answer = multiplyDivide(numer1, numer2 , denom1, denom2, operator);
		}
		
		int slash = answer.indexOf("/");
		int numer = Integer.parseInt(answer.substring(0, 1));
		int denom = Integer.parseInt(answer.substring(slash + 1, answer.length()));
		return answer;
	}
	
	
	public static String addSubtract (int numer1, int numer2, int denom1, int denom2, String operator) {
		String answer;
		int numerator = 0;
		
		if (operator.equals("+")) {
			if (numer1 == 0 || numer2 == 0) {
				answer = "0";
			}
			numerator = (numer1 * denom2 + numer2 * denom1);
			
		}else if (operator.equals("-")) {
			numerator = (numer1 * denom2 - numer2 * denom1);
		}
		int denominator = denom1 * denom2;
		answer = numerator + "/" + denominator;
		return answer;
	}

	public static String multiplyDivide ( int numer1, int numer2, int denom1, int denom2, String operator) {
		String answer;
		int numerator = 0;
		int denominator = 0;
		if(operator.equals("*")) {
			numerator = (numer1 * numer2);
			denominator = (denom1 * denom2);
		}else if (operator.equals("/")) {
			numerator = (numer1 * denom2);
			denominator = (denom1 * numer2);
		}
		answer = numerator + "/" + denominator;
		return answer;
	}
public static String toImproperFrac(String operand) {
		
		// TODO: Implement this function to produce the solution to the input
		String whole = "";
		String numerator = "";
		String denominator = "";
		int underscore = operand.indexOf("_");
		int slash = operand.indexOf("/");
		
		if (operand.indexOf("_") >= 0) {
			
			whole = operand.substring(0 , underscore);
			numerator = operand.substring(underscore + 1, slash);
			denominator = operand.substring(slash + 1, operand.length());
		}else if ((operand.indexOf("_") < 0) && (operand.indexOf("/") >= 0)) {
			
			whole = "0";
			numerator = operand.substring(0 , slash);
			denominator = operand.substring(slash + 1, operand.length());
		}else if ((operand.indexOf("_") < 0) && (operand.indexOf("/") < 0)) {
			
			whole = operand;
			numerator = "0";
			denominator = "1";
		}
		int wholeNum = Integer.parseInt(whole.trim());
		int numer = Integer.parseInt(numerator.trim());
		int denom = Integer.parseInt(denominator.trim());
		int top;
		if(operand.substring(0,1).equals("-") && wholeNum != 0) {
			top = wholeNum * denom - numer;
		}else if (operand.substring(0,1).equals("-") && wholeNum == 0){
			top = numer;
		}else {
			top = wholeNum * denom + numer;
		} 
		String improper;
		improper = top + "/" + denom;
		return improper;
	}	
	
}
