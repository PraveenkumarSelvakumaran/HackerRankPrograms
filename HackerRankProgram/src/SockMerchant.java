import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Praveenkumar.S
 *
 */
public class SockMerchant {

	/**
	 * @param args
	 */

	static int sockMerchant(int n, int[] ar) {
		int result = 0;
		Arrays.sort(ar);
		for (int i = 0; i < n - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				result++;
				i++;
			}
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	//	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\testout.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
		System.out.println(result);

		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();

	}

}
