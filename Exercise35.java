/**
 * 
 */
package tutorial2;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num = Integer.parseInt(scan.nextLine());
		
		double result = (double) Math.pow(num, 3);
		System.out.println("The result is " + result);

	}

}
