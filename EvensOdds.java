import java.util.*;
import java.io.*;
public class EvensOdds {
   public static void main (String[]args)throws Exception{
      Scanner inFile = new Scanner(new File("numbers.dat"));
      int odd = 0;
      int even = 0;
      while(inFile.hasNext()){
         if(inFile.nextInt()%2==0)
            even++;
         else
            odd++;
      }
      System.out.println("There are "+even+" even numbers and "+odd+" odd numbers in the file.");
   }
}