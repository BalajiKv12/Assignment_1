//15.Take input of age of 3 people by user and determine oldest and youngest among them.

//importing Scanner function from util library
import java.util.Scanner;   

public class Qno_15 {
    public static void main(String args[])
    {
        //initializing scanner function
        Scanner sc = new Scanner(System.in); 
        // getting age of a,b,c from user
        System.out.println("Enter age of a,b,c : "); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            // prints a if a is greater than b and c
                System.out.println("Oldest age is a : "+a); 
            else
            // prints c if c is greater than b and a
                System.out.println("Oldest age is c : "+c); 
        }
        else if(b>c)
        // prints b if b is greater than c and a
            System.out.println("Oldest age is b : "+b); 
        
        if(a<b)
        {
            if(a<c)
            // prints a if a is smaller than b and c
                System.out.println("Smallest age is a : "+a); 
            else
            // prints c if c is smaller than b and a
                System.out.println("Smallest age is c : "+c); 
        }
        else if(b<c)
        // prints b if b is smaller than a and c
            System.out.println("Smallest age is b : "+b); 
    }
}

