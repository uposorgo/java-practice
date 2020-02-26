
package javapractice;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Number of numbers: ");
        int n = input.nextInt();
        double y = 0;
        
        for(int i = 1;i<=n;i++){
            System.out.print("Enter number " + i +": ");
            double x = input.nextInt();
            y += x;
        }
//        System.out.println("\t    +");
//        System.out.println("_____________________");
//        System.out.println("\t Total: "+y);
        System.out.println("Avarage is " + y +" / " +n +" = " +y/n );
    
    
    }
}





























































