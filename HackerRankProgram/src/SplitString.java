/**
 * 
 */

/**
 * @author praveenkumar.s
 *
 */
public class SplitString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str ="Welcome$to%jave^programming";
		String[] result = str.split("[$%^]");
		
		for(String a:result)
		System.out.println(a);
	}
}
