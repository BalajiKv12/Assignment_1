/*18. Write a Java program that accepts two integer values from the user and returns the largest value. 
 However, if the two values are the same, return 0 and find the smallest value 
 if the two values have the same remainder when divided by 6.
*/

import java.util.Scanner; //importing Scanner function from util library

public class Qno_18 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b : ");
        int a = sc.nextInt();  //getting integer values of a and b from user
        int b = sc.nextInt();

        if(a>b)
            System.out.println("a is greater : "+a); //prints a if a is greater than b
        else if(b>a)
            System.out.println("b is greater : "+b); //prints b if b is greater than a

        if(a==b)
            System.out.println("0");//prints zero if a equals to b
        else
        {
            while(a>0 && b>0)
            {  
                if(a%6 == b%6)
                {
                    if(a<b)
                        System.out.println("a is smaller : "+a); //prints a if a is smaller than b
                    else if(b<a)
                        System.out.println("b is smaller : "+b); //prints b if b is smaller than a
                }
                a=a/6;
                b=b/6; 
            }
        } 
    }
}