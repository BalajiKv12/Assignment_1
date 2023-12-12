//9.Write a Java program to convert an octal number to a hexadecimal number.

import java.util.Scanner;  //importing Scanner function from util library

public class Qno_09 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt(8); // getting value of a in octal form using radix of 8
        int r;
        String s="",f="",b;
        b=Integer.toOctalString(a); //saving the value of a in octal form

        while(a>0)
        {
            r=a%16; //coverting the deciaml to hexa-deciaml  by modulo-diving by 16 
            
            switch (r) //switchcase for remiders which are more than 8 and storing it in string s
            {  
                case 10:
                    s=s+'A';
                    break;
                case 11:
                    s=s+'B';
                    break;
                case 12:
                    s=s+'C';
                    break;
                case 13:
                    s=s+'D';
                    break;
                case 14:
                    s=s+'E';
                    break;
                case 15:
                    s=s+'F';
                    break;
                default:
                    s=s+r;
                    break;
            }
            a=a/16;
        }
        char c;
        for(int i = s.length()-1;i>=0;i--) //revering the string s
        {
            c=s.charAt(i); 
            f=f+c; // storing the reversed string in string f
        }
        System.out.println("The hexa decimal value of "+b +" is : "+f); // printing the eqivalant hexa-decimal value
    }
}
