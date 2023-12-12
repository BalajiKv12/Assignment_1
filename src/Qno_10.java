//10. Write a Java program to compare two numbers. (take user input).

import java.util.Scanner;   //importing Scanner function from util library

public class Qno_10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function

        System.out.println("Enter the values of a and b : ");
        int a = sc.nextInt();  //getting integer values of a and b from user
        int b = sc.nextInt();

        if(a==b) //comparing the values of a and b
            System.out.println("a and b are equal."); //printing if a equals b
        else if(a>b)
            System.out.println("a is greater than b."); // printing if a greater than b
        else
            System.out.println("b is greater than a."); // printing if b greater than a

    }
}
