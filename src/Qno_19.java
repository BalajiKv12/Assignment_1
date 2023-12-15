//19. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.

//importing Scanner function from util library
import java.util.Scanner; 

public class Qno_19 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        //getting integer value of a from user
        int a = sc.nextInt();  

        if(a%2==0)
        //prints 1 if the number is even 
            System.out.println("1"); 
        else    
        //prints 0 if the number is odd
            System.out.println("0"); 
    }
}