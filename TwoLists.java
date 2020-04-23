import java.util.*;
import java.io.*;
public class TwoLists {
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
      System.out.print("The even array consists of ");
      for (int i=0;i < even; i++){
         System.out.print(evenNumbers[i]+" ");
      }
      System.out.print("\nThe odd array consists of ");
      for (int i=0;i < odd; i++){
         System.out.print(oddNumbers[i]+" ");
      }
   }
}