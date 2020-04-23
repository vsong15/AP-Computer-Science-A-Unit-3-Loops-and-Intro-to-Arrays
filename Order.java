import java.util.*;
public class Order {
   public static void main (String[]args) {
      Scanner kb = new Scanner (System.in);
      System.out.println("Please enter three numbers:");
      double x = kb.nextDouble();
      double y = kb.nextDouble();
      double z = kb.nextDouble();
      System.out.println("The inputs in sorted order are: ");
      double a = Math.min(x,Math.min(y,z));
      double c = Math.max(x,Math.max(y,z));
      double b = (x+y+z)-(a+c);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);  
   }
}