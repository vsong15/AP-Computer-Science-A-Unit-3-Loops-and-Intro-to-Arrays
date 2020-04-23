import java.util.*;
import java.io.*;
public class TwoListsPart4 {
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
      evenNumbers = resize(evenNumbers, even);
      oddNumbers = resize (oddNumbers, odd);
      System.out.print("The even array consists of ");
      for (int i=0;i < evenNumbers.length; i++){
         System.out.print(evenNumbers[i]+" ");
      }
      System.out.print("\nThe odd array consists of ");
      for (int i=0;i < oddNumbers.length; i++){
         System.out.print(oddNumbers[i]+" ");
      }
   }
   public static int[] resize(int []arr, int logic){ 
      int[]answer = new int[logic];
      for (int i = 0; i < answer.length; i++){
         answer [i] = arr[i];
      }
      return answer;
   }
}