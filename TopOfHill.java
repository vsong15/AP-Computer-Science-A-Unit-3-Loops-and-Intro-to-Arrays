//going to file scan
import java.util.*;
import java.io.*;
public class TopOfHill{
   public static void main (String[]args)throws Exception{
      Scanner inFile = new Scanner (new File ("numbers.dat"));
      //find and print out ONLY the largest number!!!
      int big = inFile.nextInt();
      while (inFile.hasNext()){
         int temp = inFile.nextInt();
         if(temp > big)
            big = temp;        
      }
      System.out.println("The biggest number is "+big);
   }
}