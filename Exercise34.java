/**
 * 
 */
package tutorial2;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num = Integer.parseInt(scan.nextLine());
		
		int i, fact=1;
		for (i=1; i<=num; i++){
			fact = fact*i;
		
			
		}
		System.out.println(fact);
	}

}
