//3.Write a Java program that takes a number as input and prints its multiplication table up to 10.

//importing Scanner function from util library
import java.util.Scanner; 

public class Qno_03 {
    public static void main(String args[])
    {
        //initializing scanner function
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the value of a : ");
        // getting value of a from user
        int a = sc.nextInt(); 

        for(int i=1;i<=10;i++)
        {
            //printing the multiplication table of a using for loop
            System.out.println(a+" X "+i+" = "+(a*i)); 
        }

    }
    
}
