//2. from q1 take input from user.

import java.util.Scanner;   //importing Scanner function from util library

public class Qno_02 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function

        System.out.println("Enter the values of a and b : ");
        int a = sc.nextInt();  //getting integer values of a and b from user
        int b = sc.nextInt();

        if(b>0)
        {
            System.out.println("Sum of a and b = "+(a+b)); // Adding a and b
            System.out.println("Difference of a and b = "+Math.abs((a-b))); // Subracting a and b
            System.out.println("Multiply a and b = "+(a*b)); // Multiplying a and b
            System.out.println("Divide a and b = "+(a/b)); // Dividing a and b
        }
        else
            System.out.println("Enter b value more than zero.");
    }
    
}
