//19. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.

import java.util.Scanner; //importing Scanner function from util library

public class Qno_19 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();  //getting integer value of a from user

        if(a%2==0)
            System.out.println("1"); //prints 1 if the number is even 
        else    
            System.out.println("0"); //prints 0 if the number is odd
    }
}