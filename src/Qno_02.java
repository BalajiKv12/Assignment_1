//2. from q1 take input from user.

//importing Scanner function from util library
import java.util.Scanner;   

public class Qno_02 {
    public static void main(String args[])
    {
        //initializing scanner function
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the values of a and b : ");
        //getting integer values of a and b from user
        int a = sc.nextInt();  
        int b = sc.nextInt();

        if(b>0)
        {
             // Adding a and b
            System.out.println("Sum of a and b = "+(a+b));
             // Subracting a and b
            System.out.println("Difference of a and b = "+Math.abs((a-b)));
            // Multiplying a and b
            System.out.println("Multiply a and b = "+(a*b)); 
            // Dividing a and b
            System.out.println("Divide a and b = "+(a/b)); 
        }
        else
            System.out.println("Enter b value more than zero.");
    }
    
}
