package fracCalc;

import java.util.*;

public class FracCalc {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			String Frac = userInput.nextLine();
			String answer = produceAnswer(Frac);
			System.out.println(answer);
			if (Frac.equals("quit")) {
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
		String[] produceAnswer =  input.split(" ");
		String operand1 = produceAnswer[0];
		String operand2 = produceAnswer[2];
		//splitOperand(operand2);
		//splitOperand(operand1);
		//String answer = "whole:" +splitOperand(operand2)[0] + " numerator:" +splitOperand(operand2)[1]  +" denominator:" +splitOperand(operand2)[2];
		return answer;
	}
	public static int[] ToImproperFrac(String operand) {
		

	// TODO: Implement this function to produce the solution to the input
			String whole = "";
			String numerator = "";
			String denominator = "";
			
			if (operand.indexOf("_") >= 0) {
				int underscore = operand.indexOf("_");
				int slash = operand.indexOf("/");
				whole = operand.substring(0 , underscore);
				numerator = operand.substring(underscore+1, slash);
				denominator = operand.substring(slash+1, operand.length());
			}else if ((operand.indexOf("_") < 0) && (operand.indexOf("/") >= 0)) {
				int slash = operand.indexOf("/");
				whole = "0";
				numerator = operand.substring(0 , slash);
				denominator = operand.substring(slash+1, operand.length());
			}else if ((operand.indexOf("_") < 0) && (operand.indexOf("/") < 0)) {
				whole = operand;
				numerator = "0";
				denominator = "1";
			}
				int wholeNum = Integer.parseInt(whole);
				int Numerador = Integer.parseInt(numerator);
				int Denominador = Integer.parseInt(denominator);
				int NewNumerator = ((wholeNum * Denominador) + Numerador) / Denominador;
				int[] results = {NewNumerator, Denominador};
				return results;
	}	
	public static int[] AddSubtractOperand (int[] operand1, int[] operand2, String[] operator) {
		int CommonDenominator = ;
		
	}

}
