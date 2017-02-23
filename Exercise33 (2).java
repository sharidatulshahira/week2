/**
 * 
 */
package tutorial2;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		System.out.print("First: ");
		int num1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Last: ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		
		
		if(num1<num2){
			int sum=0;
			sum=num1+num2;
			System.out.println("The sum " + sum);
		}
			
			
		else if (num2<num1){
				System.out.println();
				
			}
			
			

			
		}
		
		
	}


