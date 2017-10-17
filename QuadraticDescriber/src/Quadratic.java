/*Justin Wong
 * Describes component of graph
 */


public class Quadratic {
	public static String quadrDescriber(double coeff1, double coeff2, double coeff3) {

		String equation = "y = " + (double) (coeff1) + " x^2 + " + (double) (coeff2) + " x + " + (double) (coeff3);
		String description = "\nDescription of the graph of: \n" + equation + "\n";

		String direction = "Open: ";
		if (coeff1 > 0) {
			direction = direction + "Up";
		} else if (coeff1 < 0) {
			direction = direction + "Down";
		} else {
			throw new IllegalArgumentException("This is not a quadratic equation.");
		}

		double numAOS = round2(-coeff2 / (2 * coeff1));
		String aos = "Axis of Symmetry: " + numAOS;

		double xVertex = round2(-coeff2 / (2 * coeff1));
		double yVertex = coeff1 * square(xVertex) + coeff2 * xVertex + coeff3;
		String vertex = "Vertex: (" + xVertex + ", " + yVertex + ")";

		String roots = quadForm(coeff1, coeff2, coeff3);
		String xIntercept = "x-intercept(s): " + roots;
		String yIntercept = "y-intercept: " + coeff3;

		String total = description + "\n" + direction + "\n" + aos + "\n" + vertex + "\n" + xIntercept + "\n"
				+ yIntercept + "\n";
		return total;
	}

	public static double absValue(double num) {
		if (num > 0) {
			return num;
		} else if (num == 0) {
			return 0;
		} else {
			return -1 * num;
		}
	}

	public static double round2(double num) {
		double remainder = num * 1000 % 10;
		if (num < 0) {
			num *= -1;
			if (remainder < 5) {
				num = (num * 1000 - num * 1000 % 10) / 1000;
			} else {
				num = (10 - num * 1000 % 10 + num * 1000) / 1000;
			}
			num *= -1;
			return num;
		} else {
			if (remainder < 5) {
				return (num * 1000 - num * 1000 % 10) / 1000;
			} else {
				return (10 - num * 1000 % 10 + num * 1000) / 1000;
			}
		}
	}

	public static double sqrt(double num) {
		double guessNumber = 0;
		double result;
		if (num == 0) {
			result = 0;
		} else if (num > 0) {
			result = num / 2;
			while (absValue(guessNumber - result) >= 0.005) {
				guessNumber = result;
				result = (guessNumber + (num / guessNumber)) / 2;
			}
		} else {
			throw new IllegalArgumentException("no square root of negative number");
		}
		return round2(result);
	}

	public static String quadForm(double coeff1, double coeff2, double coeff3) {
		String result;
		if (discriminant(coeff1, coeff2, coeff3) < 0) {
			result = "None";
		} else if (discriminant(coeff1, coeff2, coeff3) == 0) {
			double answer = round2(-coeff2 / 2 * coeff1);
			result = answer + "";
		} else {
			double answer1 = (-coeff2 - sqrt(square(coeff2) - 4 * coeff1 * coeff3)) / (2 * coeff1);
			double answer2 = (-coeff2 + sqrt(square(coeff2) - 4 * coeff1 * coeff3)) / (2 * coeff1);
			if (answer1 < answer2) {
				result = round2(answer1) + " and " + round2(answer2);
			} else {
				result = round2(answer2) + " and " + round2(answer1);
			}
		}
		return result;
	}

	public static double square(double coeff2) {
		return round2(coeff2 * coeff2);
	}

	public static double discriminant(double coeff1, double coeff2, double coeff3) {
		return (coeff2 * coeff2) - 4 * coeff1 * coeff3;
	}

}