import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author praveenkumar.s
 *
 */
public class MinMax {

	static void miniMaxSum(int[] arr) {
		long min = 0, max = 0;
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			min += arr[i];
		}
		max = min + arr[arr.length - 1] - arr[0];

		System.out.println(min + " " + max);
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
