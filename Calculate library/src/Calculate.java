/* Justin Wong
 September 5,2017
 This is library that will contain various mathematical methods.
 */
public class Calculate {
	/*
	 * This method takes an integer and returns it square.
	 */
	public static int square(int operand) {
		return (operand * operand);
		/*
		 * this method takes an integer and returns its cube
		 */
	}

	public static int cubed(int operand) {
		return (operand * operand * operand);
	}

	/*
	 * this method takes two doubles and returns one double public static double
	 */
	public static double average(double operand1, double operand2) {
		return ((operand1 + operand2) / 2);
	}

	/*
	 * this method does the same as average but returns with three doubles
	 */
	public static double average2 (double operand1 , double operand2 , double operand3) {
		double average= (( operand1 + operand2 + operand3)/3);
		return average;
	}

	/*
	 *  This methood accepts a double and his returns a double
	 */
	public static double toDegrees (double degrees) {
		return degrees*(3.14159/180);
	}
	/* this method converts an anglle measure givenin degrees into radians
	 */

	public static double toRadians (double radians) {
		return radians*(180/3.1459);
	}

	/* This method accepts three doubles and returns a double
	 */
	public static double Discriminant (double a , double b , double c) {
		return ((b*b)-(4*a*c));
	}
	/* this method converts mixed number into an improper fraction
	 */
	public static String toImproperFrac (int a , int b, int c) {
		return (a*c+b +"/" + c);
	}
	/* this method converts an improper fraction into a mixed number
	 */
	public static String toMixedNum (int a , int b) {
		return (a/b) + " " + (a%b + "/" +b);
	}
	/* this method acepts a four integers and a string and then returns a string
	 */
	public static String foil ( int a , int  b , int c , int d) {
		return ((a*c) + "x^2" + "+" + ((c-a) + "x") + "+" + (b*d));
	}
	/* this method accepts two integers and returns a boolean
	 */ 
	public static boolean isDivisibleBy (int a , int b) {
		if (a%b==0) {
			return true;
		}else {
			return false;
		}
	}
	public static double absValue (double a) {
		if (a>0) {
			return a;
		}
		else if (a<0) {
			return -a;
		}
		return a;
	} 
	public static double max (double a, double b) {
		if (a>b) {
			return a;
		}
		else if (a<b) {
			return b;
		}
		return a;
	}
public static double max (double a, double b, double c) {
	if (a>b && a>c) {
		return a;
	}
	else if (a<b && b>c) {
		return b;
	}
	else if (c>b && c>a) {
		return c;
	}
	else if (a==b && a==c)
		return a;
	return a; 
} 
public static int min (int a, int b) {
	if (a<b) {
		return a;
	}
	else if (a>b) {
		return b;
	}
	return a;
}
public static double round2 (double a) {
	if (a*1000 % 10 <5) {
		return (a * 1000 -a * 1000 % 10) / 1000;
	}else {
		return (10-a * 1000 % 10 + a * 1000)/ 1000;
	}
}
}
