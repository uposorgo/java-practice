
package javapractice;

import java.util.Scanner;


public class OparatorAssignment {
    public static void main(String[] args) {
        
        int x,y;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Give the value of x & y: ");
        x = input.nextInt();
        y = input.nextInt();
        
        x += y;//3
        System.out.println("x ="+x);
        x -= y;//1
        System.out.println("x ="+x);
        x *= y;//2
        System.out.println("x ="+x);
        x /= y;//1
        System.out.println("x ="+x);
        x %= y;//0
        System.out.println("x ="+x);
    }
    
}
