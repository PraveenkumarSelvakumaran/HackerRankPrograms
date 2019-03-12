import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Praveenkumar.S
 *
 */
public class TimeConversion {
	static String timeConversion(String s) {
		
		String test = s.replaceAll("[AM,PM]","");
        String[] time = test.split(":");
        int temp = Integer.valueOf(time[0])+12;
        
        if(temp == 24){
            time[0] = "00";
        }else{
        	time[0] = Integer.toString(temp);
        }
        return time[0]+":"+time[1]+":"+time[2];
        
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		//bw.write(result);
		//bw.newLine();

		//bw.close();
	}
}
