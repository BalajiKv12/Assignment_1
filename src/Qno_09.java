//9.Write a Java program to convert an octal number to a hexadecimal number.

//importing Scanner function from util library
import java.util.Scanner;  

public class Qno_09 {
    public static void main(String args[])
    {
         //initializing scanner functio
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        // getting value of a in octal form using radix of 8
        int a = sc.nextInt(8); 
        int r;
        String s="",f="",b;
         //saving the value of a in octal form
        b=Integer.toOctalString(a);

        while(a>0)
        {
            //coverting the deciaml to hexa-deciaml  by modulo-diving by 16
            r=a%16; 
            //switchcase for remiders which are more than 8 and storing it in string s
            switch (r) 
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
        //revering the string s
        for(int i = s.length()-1;i>=0;i--) 
        {
            c=s.charAt(i); 
            // storing the reversed string in string f
            f=f+c; 
        }
        // printing the eqivalant hexa-decimal value
        System.out.println("The hexa decimal value of "+b +" is : "+f);
    }
}
