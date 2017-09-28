/* Justin Wong
 September 5,2017
 This is library that will contain various mathematical methods.
 */
public class Calculate {

	/*
	 * This method takes an integer and returns its square.
	 * 
	 */
	public static int square(int operand) {
		int squared = operand * operand;
		return squared;
	}

	/*
	 * This method takes and integer and returns its cube
	 * 
	 */
	public static int cube(int operand) {
		int cubed = operand * operand * operand;
		return cubed;
	}

	/*
	 * This method accepts two doubles and returns the average as a double
	 * 
	 */
	public static double average(double operand1, double operand2) {
		double mean = (operand1 + operand2) / 2;
		return mean;
	}

	/*
	 * This method does the same as average but with three doubles
	 * 
	 */
	public static double average(double operand1, double operand2, double operand3) {
		double mean = (operand1 + operand2 + operand3) / 3;
		return mean;
	}

	/*
	 * This method accepts a double and returns a double Converts an angle in
	 * radians into a measure in degrees.
	 */
	public static double toDegrees(double radians) {
		double degrees = radians * 180 / 3.14159;
		return degrees;
	}

	/*
	 * This method converts an angle measure from degrees to radians. Accepts a
	 * double and returns a double
	 */
	public static double toRadians(double degrees) {
		double radians = degrees * 3.14159 / 180;
		return radians;
	}

	/*
	 * This method will provide coefficients of a quadratic equation in standard
	 * form (a,b,c) and returns the value of the discriminant
	 */
	public static double discriminant(double a, double b, double c) {
		double discriminant = b * b - 4 * a * c;
		return discriminant;
	}

	/*
	 * This method will convert mixed numbers into an improper fraction from three
	 * integers to a string
	 */
	public static String toImproperFrac(int a, int b, int c) {
		return a * c + b + "/" + c;
	}

	/*
	 * Converts improper fraction into a mixed number two integers to a string
	 */
	public static String toMixedNumber(int a, int b) {
		return a / b + " " + a % b + "/" + b;

	}

	/*
	 * Converts (ax + b)(cx + d) into a quadratic equation of ax^2 + bx +c The
	 * method accepts four integers and returns a string
	 */
	public static String foil(int a, int b, int c, int d) {
		return a * c + "x^2" + "+" + (a * d + b * c) + "x" + b * d;
	}

	/*
	 * determines whether or not one integer is evenly divisible by another accepts
	 * two integers and returns a boolean
	 */
	public static boolean isDivisibleBy(int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException();
		}
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * This method will return the absolute value of the number passed. accepts a
	 * double and returns a double
	 */
	public static double absValue(double a) {
		if (a > 0) {
			return a;
		} else if (a == 0) {
			return 0.;
		} else {
			return -a;
		}
	}

	/*
	 * This method returns the larger of the values passed accepts 2 double and
	 * returns a double
	 */
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		} 
	}

	/*
	 * Overload max accepts three doubles and returns a double
	 */
	public static double max(double a, double b, double c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else if (c > a && c > b) {
			return c;
		} else {
			return a;
		}
	}

	/*
	 * Minimum finds minimum of two ints
	 */
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		} else if (b < a) {
			return b;
		} else {
			return a;
		}
	}

	/*
	 * This method will round a double to two decimal places returns a double
	 */
	public static double round2(double a) {
		double b = (a * 1000) % 10;
		if (b <= 4) {
			return (a * 1000 - b) / 1000;
		} else {
			return (a * 1000 - b + 10) / 1000;
		}

	}

	/*
	 * This method raises a to the positive integer value accepts a double and an
	 * integer, returns a double assume exponent is positive
	 */
	public static double exponent(double a, int b) {
		if (b==0) {
			return 1;
		}
		if (b<0) {
			throw new IllegalArgumentException();
		}
		double result = a;
		for (int x = 2; x <= b; x++) {
			result *= a;
		}
		return result;
	}

	/*
	 * This method returns the factorial of the value passed ! accepts and integer
	 * and returns an integer
	 */
	public static int factorial(int a) {
		if (a<0)
			throw new IllegalArgumentException();
		int answer = a;
		for (int n = a; n >= 2; n--) {
			answer *= n - 1;
		}
		return answer;
	}

	/*
	 * This method determines whether or not an integer is prime accepts an integer
	 * and returns a boolean
	 */
	public static boolean isPrime(int number) {
		/*
		 * Need a variable to count number of variables name it factors count starts at
		 * 1 because has at least itself
		 */
		int factorCount = 1;
		for (int i = 2; i < number; i++) {
			boolean test = isDivisibleBy(number, i);
			if (test == true) {
				factorCount++;
			}
		}
		if (factorCount > 1) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * This method will find the greatest common factor accepts two ints, returns
	 * gcf in an int form
	 */
	public static int gcf(int greaterN, int lesserN) {
		int A = greaterN;
		int B = lesserN;
		int result;
		while (B != 0) {
			result = A % B;
			A = B;
			B = result;
		}
		return A;
	}

	/*
	 * This method returns an approximation of the square root accepts a double
	 * returns a double
	 */
	public static double sqrt(double n) {
		// how will I get the square root? loop?
		// square root of N is about= �(N/A + A)
		// N is number to square root and then A is educated guess
		// repeatedly replace educated guess
		// return root
		if (n<0) {
			throw new IllegalArgumentException();
		}
		double root = 0;
		double A = n / 2;
		while (root != (n / A + A) / 2) {
			root = (n / A + A) / 2;
			A = root;
		}
		double answer = round2(root);
		return answer;
	}
}

