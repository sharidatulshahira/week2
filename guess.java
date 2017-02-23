/**
 * 
 */
package tutorial2;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class guess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a number: ");
		int num = Integer.parseInt(scan.nextLine());
		
		while (true){
			if (num==70){
			System.out.println("Congratulations");
			break;
			
		}
		
			else if (num<70){
			System.out.println("The number is lesser");
		}
		
			else if(num>70){
			System.out.println("The number is greater");
		}
	
			System.out.println("Guess a number: ");
			num = scan.nextInt();
			
	}
		return;
}}
