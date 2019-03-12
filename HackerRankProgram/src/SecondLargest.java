/**
 * 
 */

/**
 * @author praveenkumar.s
 *
 */
public class SecondLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {10, 18, 98, 35, 85, 64, 22, 15, 96};
		int largest = 0;
		int secondlarge = 0;
		
		for( int i = 0; i < arr.length; i++) {
			
			if(arr[i] > largest) {
				secondlarge = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondlarge) {
				secondlarge = arr[i];
				
			}
		}
		System.out.println(secondlarge);
	}
}
