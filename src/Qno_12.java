//12.Write a Java program to print the ASCII value of a given character.

//importing Scanner function from util library
import java.util.Scanner;   

public class Qno_12 {
    public static void main(String args[])
    {
        //initializing scanner function
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the string : ");
        // getting character as integer from user 
        int c = sc.next().charAt(0); 
        //printing ASCII value of character c
        System.out.println("ASCII value of "+(char)c+" is : "+c); 
    }
}