/**
 * 
 */
package tuto2;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Until what? ");
		int i = Integer.parseInt(scan.nextLine());
	
		int sum=0;
		while (sum<=i){
			sum += i;
			sum++;
			System.out.println(sum);
		}
	
			
			
		
		
	}

}
