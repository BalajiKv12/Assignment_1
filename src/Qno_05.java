//5.Write a Java program to swap two variables.

public class Qno_05 {
    public static void main(String args[])
    {
         //initializing two variables of a and b
        int a = 12,b = 6; 
        //initializing temporary variable for swapping
        int temp; 

        //storing value of a in temporary variable
        temp=a; 
        a=b;
        b=temp;

        //printing swapped values of a and b
        System.out.println("a = "+a+"; b = "+b); 
    
    }
}
