//3.Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner; //importing Scanner function from util library

public class Qno_03 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt(); // getting value of a from user

        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" X "+i+" = "+(a*i)); //printing the multiplication table of a using for loop
        }

    }
    
}
