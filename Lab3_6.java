import java.util.*;
public class Lab3_6 {
   public static void main (String[]args) {
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter a starting salary, percentage increase (decimal), and number of years in the schedule:");
      double startingSalary = kb.nextDouble();
      double percentageIncrease = kb.nextDouble();
      double numOfYears = kb.nextDouble();
      for (int i = 0;i < numOfYears; i++) {
         int year = 1;
         int whatYear = year+i; 
         if (whatYear < 26){
            double newSalary = startingSalary*Math.pow((1+percentageIncrease),whatYear);  
            System.out.println("In "+whatYear+" year(s) your salary will be $"+newSalary);
         }
         else{
            double newSalary = startingSalary*Math.pow((1+percentageIncrease), 25);
            System.out.println("In "+whatYear+" year(s) your salary will be $"+newSalary);
         }
      }
   }
}