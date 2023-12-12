//15.Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;   //importing Scanner function from util library

public class Qno_15 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function
        System.out.println("Enter age of a,b,c : "); // getting age of a,b,c from user
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
                System.out.println("Oldest age is a : "+a); // prints a if a is greater than b and c
            else
                System.out.println("Oldest age is c : "+c); // prints c if c is greater than b and a
        }
        else if(b>c)
            System.out.println("Oldest age is b : "+b); // prints b if b is greater than c and a
        
        if(a<b)
        {
            if(a<c)
                System.out.println("Smallest age is a : "+a); // prints a if a is smaller than b and c
            else
                System.out.println("Smallest age is c : "+c); // prints c if c is smaller than b and a
        }
        else if(b<c)
            System.out.println("Smallest age is b : "+b); // prints b if b is smaller than a and c
    }
}

