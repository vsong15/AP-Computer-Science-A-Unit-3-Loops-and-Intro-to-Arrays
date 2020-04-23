import java.util.*;
public class Lab3_3 {
   public static void main (String[]args) {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the number of iterations:");
      int iterations = kb.nextInt();
      double approximation = 0;
      for (int i = 1; i <= iterations; i++) {
         double numToAdd = (1.0 / ((i * 2) - 1));
         if (i%2 > 0) 
            approximation = approximation + numToAdd; 
         else
            approximation = approximation - numToAdd;
         System.out.println("The approximation of pi is " + approximation*4);
      }
   }
}

