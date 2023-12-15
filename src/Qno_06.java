// 6. from q5 with user input and without using third variable

import java.util.Scanner;

public class Qno_06 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b : ");
        //getting integer values of a and b from user
        int a = sc.nextInt();  
        int b = sc.nextInt();

        // swapping without temporary variable
        a=a+b; 
        b=a-b;
        a=a-b;

        //printing swapped values of a and b
        System.out.println("a = "+a+"; b = "+b); 
    
    }
}