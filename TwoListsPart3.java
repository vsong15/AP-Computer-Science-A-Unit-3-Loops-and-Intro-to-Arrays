import java.util.*;
import java.io.*;
public class TwoListsPart3 {
   public static void main (String[]args)throws Exception{
      Scanner inFile = new Scanner(new File ("lotsofnumbers.dat"));
      int [] evenNumbers = new int[10];
      int [] oddNumbers = new int[10];
      int even = 0;
      int odd = 0;
      while(inFile.hasNext()){
         int temp = inFile.nextInt();
         if (temp%2 == 0){
            evenNumbers[even] = temp;
            even++;
         }
         else{
            oddNumbers[odd] = temp;
            odd++;
         }     
      }
      int newArrEven = newArr(evenNumbers, evenNumbers.length);
      int newArrOdd = newArr(oddNumbers, oddNumbers.length);
      System.out.print("The even array consists of ");
      for (int i = 0; i < newArrEven; i++)
         System.out.print(evenNumbers[i]+" ");
      System.out.print("\nThe odd array consists of ");
      for (int i = 0; i < newArrOdd; i++)
         System.out.print(oddNumbers[i]+" ");
   }
   public static int newArr (int[]arr, int length){
      int i = 0;
      while (i < length){
         if (arr[i] == 0)
            break;
         i++;
      }
      return i;
   }
}