import java.util.*;
public class Lab3_5 {
   public static void main (String[]args) {
      Scanner kb = new Scanner (System.in);
      while (true) {
         System.out.println("Enter a number (decimal) for the base (2 or higher) and power (0 or higher).");
         double base = kb.nextDouble();
         double power = kb.nextDouble();
         if (base < 2 )
            System.exit(0);
         if (power < 0 )
            System.exit(0);
         double answer = Math.pow(base,power);
         System.out.println("Base "+base+" to the "+power+" power is "+answer);
      }
   }
}