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
public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int[] ar) {
		int temp = 0,count = 0, maxHeight = 1;
		for (int i = 0; i<ar.length; i++) {
			temp = ar[i];
			if(temp > maxHeight) {
				maxHeight = temp;
				count = 1;
			}else if(temp == maxHeight) {
				count++;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arCount; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = birthdayCakeCandles(ar);
		System.out.println(result);

		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}

}
