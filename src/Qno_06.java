// 6. from q5 with user input and without using third variable

import java.util.Scanner;

public class Qno_06 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b : ");
        int a = sc.nextInt();  //getting integer values of a and b from user
        int b = sc.nextInt();

        a=a+b; // swapping without temporary variable
        b=a-b;
        a=a-b;

        System.out.println("a = "+a+"; b = "+b); //printing swapped values of a and b
    
    }
}