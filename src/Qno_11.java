//11. Write a Java program to count letters, spaces, numbers and other characters in an input string.

//importing Scanner function from util library
import java.util.Scanner;   

public class Qno_11 {
    public static void main(String args[])
    {
        //initializing scanner function
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the string : ");
        // getting string from user 
        String str = sc.nextLine(); 
        // initializing counter variables
        int a=0,b=0,c=0,d=0; 
      
        for(int i=0;i<str.length();i++)
        {
            // checks string has character or not
            if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)) 
                a=a+1;
            // checks string has numbers or not
            else if(str.charAt(i)>=48 && str.charAt(i)<=57) 
                b=b+1;
            //checks string has spaces or not
            else if(str.charAt(i)==32) 
                c=c+1;
            // counts other characters
            else 
                d=d+1; 
        }
        System.out.println("The number of characters is : "+a); 
        System.out.println("The number of numbers : "+b);
        System.out.println("The number of spaces : "+c);
        System.out.println("The number of other characters : "+d);

    }
}