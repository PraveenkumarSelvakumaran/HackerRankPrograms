import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Praveenkumar.S
 *
 */
public class CompareTriplets {

	/**
	 * @param args
	 * @throws IOException
	 */

	static List<Integer> compare(List<Integer> a, List<Integer> b) {

		int r1 = 0;
		int r2 = 0;

		List<Integer> r = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			if (a.get(i) > (b.get(i))) {
				r1++;
			}
			else if (a.get(i) < (b.get(i))) {
				r2++;
			}
		}
		r.add(r1);
		r.add(r2);
		System.out.println(r);
		
		return r;
	}

	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter("D:\\testout.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] aItems = null;
		try {
			aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a.add(aItem);
		}

		String[] bItems = null;
		try {
			bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<Integer> b = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int bItem = Integer.parseInt(bItems[i]);
			b.add(bItem);
		}

		List<Integer> result = compare(a, b);

		for (int i = 0; i < result.size(); i++) {
			try {
				bufferedWriter.write(String.valueOf(result.get(i)));
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (i != result.size() - 1) {
				try {
					bufferedWriter.write(" ");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		try {
			bufferedWriter.newLine();

			bufferedReader.close();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
