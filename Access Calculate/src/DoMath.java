/* Justin Wong
 * September 5, 2017
 * This is runner class fir my calculate library methods
 */
 
 public class DoMath {

	public static void main(String[] args) {
		Calculate.square(5);
System.out.println(Calculate.square(5));
System.out.println(Calculate.cubed(3));
System.out.println(Calculate.average(20,40));
System.out.println(Calculate.average2(20,40,30));
System.out.println(Calculate.toDegrees(20));
System.out.println(Calculate.toRadians(3.14159));
System.out.println(Calculate.Discriminant(1, 2, 3));
System.out.println(Calculate.toImproperFrac(3, 1, 2));
System.out.println(Calculate.toMixedNum(7 , 2));
	}
}
