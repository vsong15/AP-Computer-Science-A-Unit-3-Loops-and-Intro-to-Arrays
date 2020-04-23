import java.util.Scanner;

public class Factorial3

{    public static void main(String[] arg)

     {    Scanner input = new Scanner(System.in);

          System.out.print("Enter a # greater than 0: ");

          int num = input.nextInt();

          long product = 1;

          int count = 1;

          while(count <= num)

          {   product = product * count;

               System.out.println(count + ":" + product);

               count++;

          }

          System.out.println("The factorial of " + num + " is " + product);

     }

}

//The problem is that it gets multiplied by a negative number.
//When the product is changed from int to long it can hold more numbers since it has more storage.
//The largest correct factorial is of 59 because after it reaches 60 it becomes negative and at 66 becomes 0.
