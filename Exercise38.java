
package tutorial2;
//
///**
// * @author SIsmail
// *
// */
//import java.util.*;
//public class Exercise38 {
//
//	/**
//	 * @param args
//	 */
//	
//	
//	public static void main(String[] args) {
//		int count=0;
//		Scanner scan =  new Scanner (System.in);
//		System.out.println("How many?");
//		count = Integer.parseInt(scan.nextLine());
//	}
//	
//	public static void count(){
//		
//			
//		}
//		System.out.println("In the beginning there were the swamp, the hoe and Java");
//	}
//
//}

//import java.util.Arrays; 
//public class Exercise38 {
// public static void main(String[] args) {
//	 int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
//	 
//     for (int i = 0; i < my_array.length-1; i++)
//     {
//         for (int j = i+1; j < my_array.length; j++)
//         {
//             if ((my_array[i] == my_array[j]) && (i != j))
//             {
//                 System.out.println("Duplicate Element : "+my_array[j]);
//             }
//         }
//     }
// }    
//}


import java.util.Arrays; 
public class Exercise38 {
public static void main(String[] args) {
//	String[] name = {"ab", "cd" , "ab"};
//	
//	for(int i=0; i<name.length-1; i++){
//		
//		for (int j=i+1; j<name.length; j++){
//			
//			if ((name[i].equals(name[j]))&& (i!=j)){
//		
//		
//				System.out.println("duplicate " + name[j]);
//			}
//}
//}
	
//	

//	static void equality_checking_two_arrays(int[] my_array1, int[] my_array2)
//    {
//        boolean equalOrNot = true;
//         
//        if(my_array1.length == my_array2.length)
//        {
//            for (int i = 0; i < my_array1.length; i++)
//            {
//                if(my_array1[i] != my_array2[i])
//                {
//                    equalOrNot = false;
//                }
//            }
//        }
//        else
//        {
//            equalOrNot = false;
//        }
//         
//        if (equalOrNot)
//        {
//            System.out.println("Two arrays are equal.");
//        }
//        else
//        {
//            System.out.println("Two arrays are not equal.");
//        }
//        }
//    
//    public static void main(String[] args)
//    {
//        int[] array1 = {2, 5, 7, 9, 11};
//        int[] array2 = {2, 5, 7, 8, 11};
//        int[] array3 = {2, 5, 7, 9, 11};
//        
//        equality_checking_two_arrays(array1, array2);
//        equality_checking_two_arrays(array1, array3);
//       }
//
//}

	int[][] data = new int[12][12];
	
	

    data = timesTable(12,12);


    for (int row = 0; row < data.length ; row++)
    {
        for (int column = 0; column < data[row].length; column++)
        {
            System.out.printf( "%6d" ,data[row][column]);
        }
        System.out.println();

    }
}



public static int[][] timesTable(int r, int c)
{
    int [][] yes = new int[r][c];
    for (int row = 0; row < yes.length ; row++)
    {
        for (int column = 0; column < yes[row].length; column++)
        {
            yes[row][column] = (row+1)*(column+1);
        }

    }
    return yes;
}

}