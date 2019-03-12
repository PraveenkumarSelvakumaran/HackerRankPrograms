import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       // Set the iteration for number of test cases
	       int t = in.nextInt();
	        
	        for(int i = 0; i < t; i++){
	            // String variables to contain the build up of letters and final result
	            String evenStr = "", oddStr = "", finalOutput = "";
	            
	            // Get characters at each position and check whether 0, even or odd and 
	            // create new string based on previous values plus current one
	            String input = in.next();
	            for(int j = 0; j < input.length(); j++){
	                if(j == 0 || j % 2 == 0){
	                    evenStr += input.charAt(j);
	                } else if (j % 2 != 0){
	                    oddStr += input.charAt(j);
	                }
	             // Concatenate even positions + space + odd positions
	                finalOutput = evenStr + " " + oddStr;
	                
	            }
	            // Print final result per test run
	            System.out.println(finalOutput);
	            
	        }
	         
	    }
}
