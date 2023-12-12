//8.Write a Java program to convert a binary number to an octal number.

import java.util.Scanner;  //importing Scanner function from util library

public class Qno_08 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt(2); // getting value of a in binary form using radix of 2  
        int r;
        String s="",f="",b;
        b=Integer.toBinaryString(a); //saving the value of a in binary form
        while(a>0) 
        {
            r=a%8; //coverting the deciaml to octal modulo-diving by 8 
            s=s+r; // storing it in string s
            a=a/8;
        }
        char c;
        for(int i = s.length()-1;i>=0;i--) //revering the string s
        {
            c=s.charAt(i);
            f=f+c; // storing the reversed string in string f
        }
        System.out.println("The octal value of "+b+" is : "+f); // printing the eqivalant octal value
    }
}