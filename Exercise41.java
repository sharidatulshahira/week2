/**
 * 
 */
package tutorial2;

/**
 * @author SIsmail
 *
 */
import java.util.*;

public class Exercise41 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int r;
		int g = random.nextInt(100);

		// int count=0;
		while (true) {
			System.out.println("Guess a number: ");
			r = scan.nextInt();
			// for (int i=0; i<count; i++){
			if (r == g) {
				System.out.println("Congratulations, it's correct ");
				break;

			}

			else if (r < g) {
				System.out.println("The number should be greater ");
			}

			else if (r > g) {
				System.out.println("The number should be lesser ");
			}


			// i++;

		}
		return;

	}
}
