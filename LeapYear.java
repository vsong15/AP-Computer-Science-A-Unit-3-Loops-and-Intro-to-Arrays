import java.util.*;
public class LeapYear {
   public static void main (String[]args){
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter the year");
      Year user = new Year(kb.nextInt());
      if (user.isLeapYear())
         System.out.println(user.getYear()+" is a leap year");
      else
         System.out.println(user.getYear()+" is NOT a leap year");
   }
}
