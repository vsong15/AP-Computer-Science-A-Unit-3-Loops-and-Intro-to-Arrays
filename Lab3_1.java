import java.util.*;
public class Lab3_1 {
   public static void main (String[]args){
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter the lengths of three sides of a traingle.");
      double x = kb.nextDouble();
      double y = kb.nextDouble();
      double z = kb.nextDouble();
      double a = Math.min(Math.min(x,y),z);
      double c = Math.max(Math.max(x,y),z);
      double b = (x+y+z)-(a+c);
      if (a*a+b*b==c*c)
         System.out.println("The triangle is a right triangle.");
      else 
         System.out.println("The triangle is NOT a right triangle."); 
   }
}