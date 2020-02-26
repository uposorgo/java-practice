
package javapractice;

import java.util.Scanner;


public class OparatorArithmatic {
    public static void main(String[] args) {
        
        int a,b,sum,sub,mul,div,mod;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Give the value of a & b: ");
        a = input.nextInt();
        b = input.nextInt();
        
        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        mod = a % b;
        
        System.out.printf("a+b=%d \na-b=%d \na*b=%d \na/b=%d \n",sum,sub,mul,div);
        System.out.println("a%b="+mod);
    }
    
}
