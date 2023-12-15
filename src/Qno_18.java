/*18. Write a Java program that accepts two integer values from the user and returns the largest value. 
 However, if the two values are the same, return 0 and find the smallest value 
 if the two values have the same remainder when divided by 6.
*/

//importing Scanner function from util library
import java.util.Scanner;

public class Qno_18 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b : ");
        //getting integer values of a and b from user
        int a = sc.nextInt();  
        int b = sc.nextInt();

        if(a>b)
        //prints a if a is greater than b
            System.out.println("a is greater : "+a); 
        else if(b>a)
        //prints b if b is greater than a
            System.out.println("b is greater : "+b); 

        if(a==b)
        //prints zero if a equals to b
            System.out.println("0");
        else
        {
            while(a>0 && b>0)
            {  
                if(a%6 == b%6)
                {
                    if(a<b)
                    //prints a if a is smaller than b
                        System.out.println("a is smaller : "+a); 
                    else if(b<a)
                    //prints b if b is smaller than a
                        System.out.println("b is smaller : "+b); 
                }
                a=a/6;
                b=b/6; 
            }
        } 
    }
}