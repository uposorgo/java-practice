//cels = 5/9(farn-32)
//farn = 9/5*cels+32
//////FORMULA   
package javapractice;

import java.util.Scanner;


public class TemparatureCelsiusToFarenheit {
    public static void main(String[] args) {
        double cels,farn;
        
        Scanner input = new Scanner(System.in);
        System.out.print("What is the Temp in Celsius: ");
        cels = input.nextDouble();
        farn= 1.8*cels+32;
        System.out.println("Farenheit is: "+farn);
    }
}
