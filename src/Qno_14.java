//14. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

public class Qno_14 {
    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)         //for loop between 1 to 100
        {
            if(i%3==0 && i%5==0)        //checks if the number is both divisible by 3 and 5
                System.out.print(i+",");
            else if(i%3==0)             //checks if the number is divisible by 3
                System.out.print(i+",");
            else if(i%5==0)             //checks if the number is divisible by 5
                System.out.print(i+",");
        }
    }
}
