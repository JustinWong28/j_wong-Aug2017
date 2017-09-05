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
	double average (double operand1, double operand2 ) { 
		return (( operand1+ operand2) / 2); 
	}

	/*
	 * this method does the same as average but returns with three doubles
	 */
	public static double average2 (double operand1, double operand2,double operand3) {
		return ((operand1+ operand2+ operand3)/3);
	}
