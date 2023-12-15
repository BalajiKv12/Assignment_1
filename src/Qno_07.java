//7.Write a Java program to add two binary numbers and divide them. 

 //importing Scanner function from util library
import java.util.Scanner; 

public class Qno_07 {
    public static void main(String args[])
    {
         //initializing scanner function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b : ");
        // getting values of a and b in binary form using radix of 2 
        int a = sc.nextInt(2); 
        int b = sc.nextInt(2);
    
        //adding two binary values 
        int c = a+b; 
        // dividing two binary values
        int f= a/b; 
        // converting final value in binary form
        String d = Integer.toBinaryString(c); 
        // converting final value in binary form
        String g = Integer.toBinaryString(f);

        //printing the value of c in decimal form
        System.out.println("deciamal of a+b = "+c); 
        //printing the value of c in decimal form
        System.out.println("binary value a+b = "+d); 
        //printing the value of c in decimal form
        System.out.println("deciamal of a/b = "+f); 
        //printing the value of c in decimal form
        System.out.println("binary value a/b = "+g); 
    }
      
}
