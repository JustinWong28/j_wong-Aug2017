package fracCalc;

import java.util.Scanner;

public class Fraction {
	private int whole;
	private int numerator;
	private int denominator;

			
	public void parseFraction(String operand) {
		whole = 0;
		numerator = 0;
		denominator = 1;
		int underscore = operand.indexOf("_");
		int slash = operand.indexOf("/");
		if (operand.indexOf("_") >= 0) {
			
			whole = Integer.parseInt(operand.substring(0 , underscore));
			numerator = Integer.parseInt(operand.substring(underscore + 1, slash));
			denominator = Integer.parseInt(operand.substring(slash + 1, operand.length()));
		}else if ((operand.indexOf("_") < 0) && (operand.indexOf("/") >= 0)) {
			
			whole = 0;
			numerator = Integer.parseInt(operand.substring(underscore + 1, slash));
			denominator = Integer.parseInt(operand.substring(slash + 1, operand.length()));
		}else if ((operand.indexOf("_") < 0) && (operand.indexOf("/") < 0)) {
			
			whole = Integer.parseInt(operand);
			numerator = 0;
			denominator = 1;
		}
	}
	public static void toMixedNum() {

	}
	public void addSubtract() {
		
	}

	public void multiplyDivide() {
		
	}
	public void simplfy() {
	
		}
	public String toString( ) {
		return "whole:" +whole +" numerator:" +numerator +" denominator:" +denominator;
	}
	public int getNum() {
		return numerator;
	}
	public int getWhole( ) {
		return whole;
	}
	public int getDenom( ) {
		return denominator;
	}
}
