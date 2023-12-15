//10. Write a Java program to compare two numbers. (take user input).

//importing Scanner function from util library
import java.util.Scanner;   

public class Qno_10 {
    public static void main(String args[])
    {
         //initializing scanner function
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a and b : ");
        //getting integer values of a and b from user
        int a = sc.nextInt();
        int b = sc.nextInt();

        //comparing the values of a and b
        if(a==b) 
         //printing if a equals b
            System.out.println("a and b are equal.");
        else if(a>b)
         // printing if a greater than b
            System.out.println("a is greater than b.");
        else
        // printing if b greater than a
            System.out.println("b is greater than a."); 

    }
}
