//8.Write a Java program to convert a binary number to an octal number.

//importing Scanner function from util library
import java.util.Scanner; 

public class Qno_08 {
    public static void main(String args[])
    {
         //initializing scanner function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        // getting value of a in binary form using radix of 2 
        int a = sc.nextInt(2);  
        int r;
        String s="",f="",b;
        //saving the value of a in binary form
        b=Integer.toBinaryString(a);
        while(a>0) 
        {
            //coverting the deciaml to octal modulo-diving by 8
            r=a%8;  
            // storing it in string s
            s=s+r; 
            a=a/8;
        }
        char c;
        //revering the string s
        for(int i = s.length()-1;i>=0;i--) 
        {
            c=s.charAt(i);
            // storing the reversed string in string f
            f=f+c; 
        }
        // printing the eqivalant octal value
        System.out.println("The octal value of "+b+" is : "+f); 
    }
}