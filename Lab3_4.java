import java.util.*;
public class Lab3_4 {
   public static void main (String[]args) {
      Scanner kb = new Scanner (System.in);
      while (true) {
         System.out.println("Enter an integer for the power.");
         double power = kb.nextDouble();
         if (power < 0 )
            System.exit(0);
         double answer = Math.pow(2.0,power);
         System.out.println("2 to the "+power+" power is "+answer);
      }
   }
}