//5.Write a Java program to swap two variables.

public class Qno_05 {
    public static void main(String args[])
    {
        int a = 12,b = 6;  //initializing two variables of a and b
        int temp; //initializing temporary variable for swapping

        temp=a; //storing value of a in temporary variable
        a=b;
        b=temp;

        System.out.println("a = "+a+"; b = "+b); //printing swapped values of a and b
    
    }
}
