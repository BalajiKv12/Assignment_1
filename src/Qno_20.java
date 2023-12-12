//20. micro project

import java.util.Scanner; //importing Scanner function from util library

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
        int n = sc.nextInt(); //gets user user option 

        switch (n) {        //switchcase for different options
            case 1:     // case 1 for VEG 
                System.out.println("---------VEG---------");
                System.out.println("1. PANNER BIRYANI");
                System.out.println("2. BUTTER NAAN, PANNER BUTTER MASALA");
                System.out.println("3. ONION DOSA");
                System.out.println("4. CLOSE THE MENU ");
                System.out.println("----------------------");
                int k = sc.nextInt();
                switch (k) {    //switchcase for getting quantity for different menu
                    case 1:     
                        System.out.print("QUANTITY - ");
                        int q = sc.nextInt();
                        System.out.println("\nYOUR ORDER PANNER BIRYANI - "+q+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;
                    case 2:
                        System.out.print("QUANTITY - ");
                        int w = sc.nextInt();
                        System.out.println("\nYOUR ORDER BUTTER NAAN, PANNER BUTTER MASALA - "+w+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;
                    case 3:
                        System.out.print("QUANTITY - ");
                        int e = sc.nextInt();
                        System.out.println("\nYOUR ORDER ONION DOSA - "+e+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;

                    default:
                        System.out.println("---------THANK YOU---------");
                        break;
                }
                break;
             
            case 2: //switchcase for different options
                System.out.println("---------NON-VEG---------");
                System.out.println("1. CHICKEN BIRYANI");
                System.out.println("2. BUTTER NAAN, BUTTER CHICKEN");
                System.out.println("3. MUTTON FRY");
                System.out.println("4. CLOSE THE MENU ");
                System.out.println("----------------------");
                int l = sc.nextInt();
                switch (l) { //switchcase for getting quantity for different menu
                    case 1:
                        System.out.print("QUANTITY - ");
                        int q = sc.nextInt();
                        System.out.println("\nYOUR ORDER CHICKEN BIRYANI - "+q+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;
                    case 2:
                        System.out.print("QUANTITY - ");
                        int w = sc.nextInt();
                        System.out.println("\nYOUR ORDER BUTTER NAAN, BUTTER CHICKEN - "+w+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;
                    case 3:
                        System.out.print("QUANTITY - ");
                        int e = sc.nextInt();
                        System.out.println("\nYOUR ORDER MUTTON FRY - "+e+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;

                    default:
                        System.out.println("---------THANK YOU---------");
                        break;
                }
                break;

            case 3: //switchcase for different options
                System.out.println("---------BEVERAGES---------");
                System.out.println("1. COCACOLA");
                System.out.println("2. LIME JUICE");
                System.out.println("3. CHOCOLATE MILKSHAKE");
                System.out.println("4. CLOSE THE MENU ");
                System.out.println("----------------------");
                int m = sc.nextInt();
                switch (m) { //switchcase for getting quantity for different menu
                    case 1:
                        System.out.print("QUANTITY - ");
                        int q = sc.nextInt();
                        System.out.println("\nYOUR ORDER COCACOLA - "+q+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;
                    case 2:
                        System.out.print("QUANTITY - ");
                        int w = sc.nextInt();
                        System.out.println("\nYOUR ORDER LIME JUICE - "+w+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;
                    case 3:
                        System.out.print("QUANTITY - ");
                        int e = sc.nextInt();
                        System.out.println("\nYOUR ORDER CHOCOLATE MILKSHAKE - "+e+" HAS TAKEN SUCCESSFULLY");
                        System.out.println("---------THANK YOU---------");
                        break;

                    default:
                        System.out.println("---------THANK YOU---------");
                        break;
                }
                break;

            default:
                System.out.println("---------THANK YOU---------");
                break;
        }
    }    
}