/**(
 * 
 */
package tuto2;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Up to what number? ");
		 int num = Integer.parseInt(scan.nextLine());
		 int count = 0;
		
		while (count < num){
			
			count++;
			System.out.println(count);
			
			
		}
		
		
	}

}
