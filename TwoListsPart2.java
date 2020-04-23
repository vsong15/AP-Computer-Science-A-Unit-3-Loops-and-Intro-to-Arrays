import java.util.*;
import java.io.*;
public class TwoListsPart2 {
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
      int div3Even = numsDiv3 (evenNumbers, even);
      System.out.println("Numbers divisible by 3 in the even array: "+div3Even);
     
      int div3Odd = numsDiv3 (oddNumbers, odd);
      System.out.println("Numbers divisible by 3 in the odd array: "+div3Odd);
      
      if (sumOver300(evenNumbers)>300)
         System.out.println("There sum of the odd array IS over 300!");
      else 
         System.out.println("There sum of the odd array is NOT over 300!");
         
      if (sumOver300(oddNumbers)>300)
         System.out.println("There sum of the odd array IS over 300!");
      else 
         System.out.println("There sum of the odd array is NOT over 300!");     
   }
   public static int numsDiv3(int[]arr, int logic){
      int answer = 0;
      for(int i =0; i < logic; i++)
         if(arr[i]%3 == 0)
            answer++;
      return answer;
   }
   public static int sumOver300(int[]arr){
      int count = 0;
      for(int x: arr)
         count+=x;
      return count;
   }
}