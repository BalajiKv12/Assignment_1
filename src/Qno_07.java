//7.Write a Java program to add two binary numbers and divide them. 

import java.util.Scanner;  //importing Scanner function from util library

public class Qno_07 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function
        System.out.println("Enter the values of a and b : ");
        int a = sc.nextInt(2); // getting values of a and b in binary form using radix of 2 
        int b = sc.nextInt(2);
    
        int c = a+b; //adding two binary values 
        int f= a/b; // dividing two binary values
        String d = Integer.toBinaryString(c); // converting final value in binary form
        String g = Integer.toBinaryString(f); // converting final value in binary form

        System.out.println("deciamal of a+b = "+c); //printing the value of c in decimal form
        System.out.println("binary value a+b = "+d); //printing the value of c in decimal form

        System.out.println("deciamal of a/b = "+f); //printing the value of c in decimal form
        System.out.println("binary value a/b = "+g); //printing the value of c in decimal form
    }
      
}
