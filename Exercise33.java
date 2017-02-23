/**
 * 
 */
package tuto2;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("First: ");
		int num1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Last: ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		while (num1<num2){
			int sum=0;
			sum=num1+num2;
			System.out.println("The sum " + sum);
			
			break;
		}

	}

}
