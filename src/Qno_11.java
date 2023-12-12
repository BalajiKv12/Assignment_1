//11. Write a Java program to count letters, spaces, numbers and other characters in an input string.

import java.util.Scanner;   //importing Scanner function from util library

public class Qno_11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function
        System.out.println("Enter the string : ");
        String str = sc.nextLine(); // getting string from user 
        int a=0,b=0,c=0,d=0; // initializing counter variables
      
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)) // checks string has character or not
                a=a+1;
            else if(str.charAt(i)>=48 && str.charAt(i)<=57) // checks string has numbers or not
                b=b+1;
            else if(str.charAt(i)==32) //checks string has spaces or not
                c=c+1;
            else 
                d=d+1; // counts other characters
        }
        System.out.println("The number of characters is : "+a); 
        System.out.println("The number of numbers : "+b);
        System.out.println("The number of spaces : "+c);
        System.out.println("The number of other characters : "+d);

    }
}