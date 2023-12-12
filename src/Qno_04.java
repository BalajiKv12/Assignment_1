//4.Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner; //importing Scanner function from util library

public class Qno_04 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //initializing scanner function
        System.out.println("Enter the values of length and breadth of a rectangle : ");
        int l = sc.nextInt(); // getting value of length and breadth from user
        int b = sc.nextInt();

        System.out.println("Area of rectangle is : "+(l*b)); //printing area of rectangle
        System.out.println("Perimeter of rectangle is : "+(2*(l+b)));  //printing perimeter of rectangle
    }
}