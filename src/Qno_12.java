//12.Write a Java program to print the ASCII value of a given character.

import java.util.Scanner;   //importing Scanner function from util library

public class Qno_12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function
        System.out.println("Enter the string : ");
        int c = sc.next().charAt(0); // getting character as integer from user 
        System.out.println("ASCII value of "+(char)c+" is : "+c); //printing ASCII value of character c
    }
}