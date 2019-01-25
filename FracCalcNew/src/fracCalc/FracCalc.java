package fracCalc;
import java.util.*;
public class FracCalc {

	  public static void main(String[] args){
	    	
	    	Scanner userInput = new Scanner(System.in);
	    	
	    	String end = "quit";
	    	System.out.println("Enter an equation with spaces between numbers and the operator...");
	    	String problem = userInput.nextLine();
	    	
	    	while(!end.equals(problem)) {
	    		System.out.println(produceAnswer(problem));
	    		System.out.println("type \"quit\" to exit or type the next equation to continue...");
	    		problem = userInput.nextLine();
	    	}
	    	userInput.close();
	 
	        // This method takes a string and parses it into integers to produce the answer of your equation
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
