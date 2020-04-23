import java.util.*;
public class newSizeArray {
   public static void main (String[]args){
      Scanner kb = new Scanner(System.in);
      System.out.println("Pick a number between 5 and 15.");
      int [] size = new int [kb.nextInt()];
      for (int i = 0; i < size.length; i++){
         if(Math.random() < .5)
            size[i] = 5;
         else
            size[i] = 11;
      }
      int result = mostEntries(size);
      if(result!=-1)
         System.out.println("The winner is "+result+"!");
      else
         System.out.println("It's a tie!");
   }
   public static int mostEntries(int[]arr){
      int x = 0;
      int y = 0;
      for(int i = 0; i < arr.length; i++){
         if(arr[i] == 5)
            x++;
         else
            y++;       
      } 
      int answer = 0;  
      if ( x > y )
         answer += 5;
      if( x < y )
         answer += 11; 
      if (x == y)
         answer += -1;    
      return answer;  
   }
}