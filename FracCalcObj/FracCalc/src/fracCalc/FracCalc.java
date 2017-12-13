package fracCalc;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	while(true) {//Accepts strings from the user until the user types "quit"
    		System.out.println("Type a fractional expression to evaluate it or type \"quit\" to terminate the program.");
    		String input = userInput.nextLine();
    		if(input.equals("quit")) {
    			break;
    		}
    		System.out.println(produceAnswer(input));
    	}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
