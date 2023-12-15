//14. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

public class Qno_14 {
    public static void main(String args[])
    {
        //for loop between 1 to 100
        for(int i=1;i<=100;i++)         
        {
            //checks if the number is both divisible by 3 and 5
            if(i%3==0 && i%5==0)        
                System.out.print(i+",");
            //checks if the number is divisible by 3
            else if(i%3==0)             
                System.out.print(i+",");
            //checks if the number is divisible by 5
            else if(i%5==0)             
                System.out.print(i+",");
        }
    }
}
