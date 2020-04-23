import java.util.*;
public class Lab3_2 {
   public static void main (String[]args){
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter the lenth of a call in minutes.");
      int tl = kb.nextInt();
      if (tl > 2){
         double bm = tl-2;
         double ec = bm*0.5;
         double nt = ec + tl;
         System.out.println("The cost of the call is $"+nt+"0");
      }
      else
         System.out.println("The cost of the call is $1.15");
   }       
}