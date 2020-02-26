
package javapractice;

import java.util.Scanner;

public class NewClass23456 {
//            USING CONDITIONAL OPERATOR

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            int a,b,c;
            a = input.nextInt();
            b = input.nextInt();
        
          c = (a>b) ? a : b;
            System.out.println("Large: "+c);
          }
}
