//20. micro project

//importing Scanner function from util library
import java.util.Scanner; 

public class Qno_20 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------MENU---------");
        System.out.println("1. VEG");
        System.out.println("2. NON-VEG");
        System.out.println("3. BEVERAGES");
        System.out.println("4. CLOSE THE MENU ");

        System.out.println("----------------------");
        //gets user user option
        int n = sc.nextInt();  

        // while loop for repeating menu to user
        while (n>0 && n<=4) {  
        //switchcase for different options
        switch (n) {  
            // case 1 for VEG      
            case 1:      
                System.out.println("---------VEG---------");
                System.out.println("1. PANNER BIRYANI");
                System.out.println("2. BUTTER NAAN, PANNER BUTTER MASALA");
                System.out.println("3. ONION DOSA");
                System.out.println("4. GOBACK ");
                System.out.println("----------------------");
                int k = sc.nextInt();
                //switchcase for getting quantity for different menu
                switch (k) {    
                    case 1:     
                        System.out.print("QUANTITY - ");
                        int q = sc.nextInt();
                        System.out.println("\nYOUR ORDER PANNER BIRYANI x "+q+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5; 
                        break;
                    case 2:
                        System.out.print("QUANTITY - ");
                        int w = sc.nextInt();
                        System.out.println("\nYOUR ORDER BUTTER NAAN, PANNER BUTTER MASALA x "+w+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5;
                        break;
                    case 3:
                        System.out.print("QUANTITY - ");
                        int e = sc.nextInt();
                        System.out.println("\nYOUR ORDER ONION DOSA x "+e+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5;
                        break;

                    default:
                        System.out.println("---------MENU---------");
                        System.out.println("1. VEG");
                        System.out.println("2. NON-VEG");
                        System.out.println("3. BEVERAGES");
                        System.out.println("4. CLOSE THE MENU ");
                        System.out.println("----------------------");
                        //gets user user option
                        n = sc.nextInt(); 
                        break;
                }
                break;
            //case 2 for NON-VEG
            case 2: 
                System.out.println("---------NON-VEG---------");
                System.out.println("1. CHICKEN BIRYANI");
                System.out.println("2. BUTTER NAAN, BUTTER CHICKEN");
                System.out.println("3. MUTTON FRY");
                System.out.println("4. GOBACK ");
                System.out.println("----------------------");
                int l = sc.nextInt();
                //switchcase for getting quantity for different menu
                switch (l) { 
                    case 1:
                        System.out.print("QUANTITY - ");
                        int q = sc.nextInt();
                        System.out.println("\nYOUR ORDER CHICKEN BIRYANI x "+q+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5;
                        break;
                    case 2:
                        System.out.print("QUANTITY - ");
                        int w = sc.nextInt();
                        System.out.println("\nYOUR ORDER BUTTER NAAN, BUTTER CHICKEN x "+w+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5;
                        break;
                    case 3:
                        System.out.print("QUANTITY - ");
                        int e = sc.nextInt();
                        System.out.println("\nYOUR ORDER MUTTON FRY x "+e+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5;
                        break;

                    default:
                        System.out.println("---------MENU---------");
                        System.out.println("1. VEG");
                        System.out.println("2. NON-VEG");
                        System.out.println("3. BEVERAGES");
                        System.out.println("4. CLOSE THE MENU ");
                        System.out.println("----------------------");
                        //gets user user option
                        n = sc.nextInt(); 
                        break;
                }
                break;
            //case for BEVERAGES
            case 3: 
                System.out.println("---------BEVERAGES---------");
                System.out.println("1. COCACOLA");
                System.out.println("2. LIME JUICE");
                System.out.println("3. CHOCOLATE MILKSHAKE");
                System.out.println("4. GOBACK ");
                System.out.println("----------------------");
                int m = sc.nextInt();
                //switchcase for getting quantity for different menu
                switch (m) { 
                    case 1:
                        System.out.print("QUANTITY - ");
                        int q = sc.nextInt();
                        System.out.println("\nYOUR ORDER COCACOLA x "+q+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5;
                        break;
                    case 2:
                        System.out.print("QUANTITY - ");
                        int w = sc.nextInt();
                        System.out.println("\nYOUR ORDER LIME JUICE x "+w+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5;
                        break;
                    case 3:
                        System.out.print("QUANTITY - ");
                        int e = sc.nextInt();
                        System.out.println("\nYOUR ORDER CHOCOLATE MILKSHAKE x "+e+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        // closing loop
                        n=5;
                        break;

                    default:
                        System.out.println("---------MENU---------");
                        System.out.println("1. VEG");
                        System.out.println("2. NON-VEG");
                        System.out.println("3. BEVERAGES");
                        System.out.println("4. CLOSE THE MENU ");
                        System.out.println("----------------------");
                        //gets user user option
                        n = sc.nextInt(); 
                        break;
                }
                break;

            default:
                System.out.println("---------THANK YOU---------");
                // closing loop
                n++;
                break;
        }
    }    
}
}