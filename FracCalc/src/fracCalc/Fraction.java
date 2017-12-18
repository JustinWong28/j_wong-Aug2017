package fracCalc;

import java.util.Scanner;

public class Fraction {
	private int whole;
	private int numerator;
	private int denominator;

			
	public Fraction(String frac) {
		int underscore = frac.indexOf("_");
		int slash = frac.indexOf("/");
		
		if (frac.indexOf("_") >= 0) {
			
			whole = Integer.parseInt(frac.substring(0 , underscore));
			numerator = Integer.parseInt(frac.substring(underscore + 1, slash));
			denominator = Integer.parseInt(frac.substring(slash + 1, frac.length()));
		}else if ((frac.indexOf("_") < 0) && (frac.indexOf("/") >= 0)) {
			
			whole = 0;
			numerator = Integer.parseInt(frac.substring(underscore + 1, slash));
			denominator = Integer.parseInt(frac.substring(slash + 1, frac.length()));
		}else if ((frac.indexOf("_") < 0) && (frac.indexOf("/") < 0)) {
			
			whole = Integer.parseInt(frac);
			numerator = 0;
			denominator = 1;
		}
		toImproper();
	}
	
	public Fraction(int numerator, int denominator, int whole) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.whole = whole;
		toImproper();
	}
	public Fraction() {
		this(0 , 1 , 0);
	}
	public Fraction(int numerator, int denominator) {
		this(numerator, denominator, 0);
	}


	
	public Fraction add(Fraction operand2) {
		Fraction answer = new Fraction();
		answer.setNumerator(this.numerator * operand2.getDenominator() + operand2.getNumerator() * this.denominator);
		answer.setDenominator(this.denominator * operand2.getDenominator());
		return answer;
	}
	public Fraction subtract(Fraction operand2) {
		Fraction answer = new Fraction();
		answer.setNumerator(this.numerator * operand2.getDenominator() - operand2.getNumerator() * this.denominator);
		answer.setDenominator(this.denominator * operand2.getDenominator());
		return answer;
	}
	public Fraction multiply(Fraction operand2) {
		Fraction answer = new Fraction();
		answer.setNumerator(this.numerator * operand2.getNumerator());
		answer.setDenominator(this.denominator * operand2.getDenominator());
		return answer;
	}
	public Fraction divide(Fraction operand2) {
		Fraction answer = new Fraction();
		Fraction reciprocal = new Fraction();
		if (operand2.getNumerator() < 0) {
			reciprocal.setDenominator(operand2.getNumerator() * -1);
			reciprocal.setNumerator(operand2.getDenominator() * -1);
		}else {
		reciprocal.setDenominator(operand2.getNumerator());
		reciprocal.setNumerator(operand2.getDenominator());
		}
		answer.setNumerator(this.numerator * reciprocal.getNumerator());
		answer.setDenominator(this.denominator * reciprocal.getDenominator());
		return answer;
	}
	
	public void toImproper() {
		if( whole < 0) {
			numerator *= -1;
		}
		numerator = whole * denominator + numerator;
		whole = 0;
	}
	
	public void reduceAnswer() {
		whole =  numerator / denominator + whole;
		numerator = numerator % denominator;
		int gcf = gcf(numerator, denominator);
		if(whole != 0) {
			numerator = Math.abs(numerator); 
		}
		numerator = numerator / gcf;
		denominator = denominator / gcf;
	}
	
	public int gcf(int num1, int num2) {
		num1 = Math.abs(num1);
		num2 = Math.abs(num2);
		for(int i = num1; i > 1; i--) {
			if(num1 % i == 0 && num2 % i ==0) {
				return i;
			}
		}
		return 1;
	}
	public String toString( ) {
		if (denominator == 0) {
			return "ERROR: cannot divide by zero";
		}else if (whole == 0 && numerator == 0) { 
			return "0";
		}else if  (numerator == 0) {
			return "" + whole;
		}else if ( whole == 0) {
			return numerator +"/"+ denominator;
		}
		return whole +"_"+ numerator +"/"+ denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getWhole( ) {
		return whole;
	}
	
	public int getDenominator( ) {
		return denominator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void setWhole(int whole) {
		this.whole = whole;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
}


