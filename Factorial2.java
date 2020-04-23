import java.util.*;
public class Factorial2 {
   public static void main (String[]args){
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter a number: ");
      long x = kb.nextLong();
      long n = 1;
      for (int i=1; i<=x; i++) {
         n *= i; 
      }
      System.out.println(x+"! is "+n);
   }
}