/**
 * 
 */
package tuto2;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		int num;
		
		while (true){
			num = Integer.parseInt(scan.nextLine());
			if (num==0){
			break;
		}
		
			sum = num + sum;
			System.out.println("Sum now: " + sum);
			
		}
		System.out.println("\n" + "Sum in the end: " + sum);
		
		}

	}


