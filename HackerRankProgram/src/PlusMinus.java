import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author praveenkumar.s
 *
 */
public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int positive = 0, negative = 0, equal = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				positive++;
			else if (arr[i] < 0)
				negative++;
			else
				equal++;
		}

		double res1 = (double) positive / (double) arr.length;
		double res2 = (double) negative / (double) arr.length;
		double res3 = (double) equal / (double) arr.length;

		DecimalFormat df = new DecimalFormat("#.######");
		df.setMaximumFractionDigits(6);

		System.out.println(df.format(res1));
		System.out.println(df.format(res2));
		System.out.println(df.format(res3));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
