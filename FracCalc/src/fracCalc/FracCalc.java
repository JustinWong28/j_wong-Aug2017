package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	boolean done = false;
    			while(!done) {
    				String Frac = userInput.nextLine();
    				String answer = produceAnswer(Frac);
    				System.out.println(answer);
    				if (Frac.equals("quit")) {
    					done = true;
    				}
    			}
        // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) {
    	String[] produceAnswer =  input.split(" ");
    	String operand1 = produceAnswer[0];
    	String operand2 = produceAnswer[2];
    	splitOperand(operand1);
    	return splitOperand(operand2);
    	// TODO: Implement this function to produce the solution to the input
       
    	public static String splitOperand (String operand) {
        String whole = "";
        String numerator = "";
        String denominator = "";
        if (operand.indexOf("_") >= 0) {
        	
        }
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
