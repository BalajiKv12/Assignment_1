//17.Write a program on reverse star pattern.

public class Qno_17 {
    public static void main(String args[])
    { 
        for(int i=4;i>=1;i--)  
        {
            for(int h=4;h>i;h--) //This for loop prints blank space on left side until it is greater than i
            {  
                System.out.print(" ");
            }
            for(int k=i;k>1;k--) //This for loop prints left side of the triangle
            {
                System.out.print("*");
            }
            for(int j=4;j>=1;j--)//This for loop prints right side of the triangle
            {
                if(i+j>4)  
                    System.out.print("*");// if i+j is greater than 4 it prints *
                else
                    System.out.print(" ");// if i+j is smaller than 4 it prints blank space
            }
            
            System.out.println("");
        }
    }
}
