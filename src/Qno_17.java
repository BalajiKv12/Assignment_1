//17.Write a program on reverse star pattern.

public class Qno_17 {
    public static void main(String args[])
    { 
        for(int i=4;i>=1;i--)  
        {
            //This for loop prints blank space on left side until it is greater than i
            for(int h=4;h>i;h--) 
            {  
                System.out.print(" ");
            }
            //This for loop prints left side of the triangle
            for(int k=i;k>1;k--) 
            {
                System.out.print("*");
            }
            //This for loop prints right side of the triangle
            for(int j=4;j>=1;j--)
            {
                if(i+j>4)  
                // if i+j is greater than 4 it prints *
                    System.out.print("*");
                else
                // if i+j is smaller than 4 it prints blank space
                    System.out.print(" ");
            }
            
            System.out.println("");
        }
    }
}
