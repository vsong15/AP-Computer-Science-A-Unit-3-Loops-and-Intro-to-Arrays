import java.util.*;
public class ArrayDay1 {
   public static void main (String[]args){
      Scanner kb = new Scanner (System.in);
      int[]nums = new int[10];
      String[]names = new String[10];
      for(int i = 0; i < nums.length; i++){
         System.out.println("Enter your name and a guess [1,10] separated by a space");
         names[i]=kb.next();
         nums[i]=kb.nextInt();
      }
      int rand = (int)(Math.random()*10+1);
      System.out.println("The winning number is "+rand);
      System.out.println("The winners are: ");
      for(int i = 0; i<nums.length; i++) {
         if(nums[i]==rand)
            System.out.println(names[i]);
      }
   }
}