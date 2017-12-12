import java.util.Scanner;

public class Fraction {
	private int whole;
	private int numerator;
	private int denominator;
	private String operator;
			
	public static void toMixedNum() {

	}
	public void addSubtract() {
		
	}
	public void parseFraction() {
		String whole = "";
		String numerator = "";
		String denominator = "";
		
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
			
	}
	public void multiplyDivide() {
		
	}
	public int toInt(String str) {
		
	}
	public void simplfy() {
	
		}
	public String toString( ) {
		
	}
}
