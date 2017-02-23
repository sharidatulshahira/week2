/**
 * 
 */
package tuto2;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int read;
		
		System.out.print("Type the first number: ");
		read = Integer.parseInt(scan.nextLine()); 
		sum = read + sum;
		
		System.out.print("Type the second number: ");
		read = Integer.parseInt(scan.nextLine()); 
		sum = read + sum;
		
		System.out.print("Type the third number: ");
		read = Integer.parseInt(scan.nextLine()); 
		sum = read + sum;
		
		System.out.println("\n" + "Sum: " + sum);

	}

}
