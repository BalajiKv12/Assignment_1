//16.Write a program triangle star Pattern

public class Qno_16 {
    public static void main(String args[])
    { 
        //This for loop prints left side of the triangle
        for(int i=1;i<=4;i++)  
        {
            for(int j=1;j<=4;j++)
            {
                // if i+j is greater than 4 it prints *
                if(i+j>4)  
                    System.out.print("*");
                else
                // if i+j is smaller than 4 it prints blank space
                    System.out.print(" ");
            }
            // //This for loop prints right side of the triangle
            for(int k=1;k<i;k++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
