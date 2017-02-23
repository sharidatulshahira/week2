/**
 * 
 */
package tutorial2;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num =0;
		int sum = 0;
		int count = num;
		float avg = 0;
		int even=num;
		int odd=num;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type numbers: ");
	
		
		while (true){
			
			num = scan.nextInt();
			if (num>0){
				sum = num + sum; //36.2
				count++;//36.3
				avg = sum / count;//36.4			
				
				if(num%2==0){//36.5
					even++;
				}
				
				else if (num%2==1){
					odd++;
				}
				
				
			}
		
			else if (num <0){
				System.out.println("Thank you and see you later!");//36.2
			break;
			}
			
				
		
		//num = scan.nextInt();
		
			}
		
		
		
		
			
		System.out.println("sum: " + sum);
		System.out.println("How many numbers: " + count);
		System.out.println("avg: " + avg);
		System.out.println("Even number: " + even);
		System.out.println("Odd number: " + odd);
}
}



