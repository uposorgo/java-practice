 
package javapractice;
 
public class w3 {
    public static void main(String[] args) {
        int num1,num2,sum,sub,mul,div,mod;
        num1=125;
        num2=24;
        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        
        System.out.printf("%d + %d = %d\n",num1,num2,sum);
        System.out.printf("%d - %d = %d\n",num1,num2,sub);
        System.out.printf("%d * %d = %d\n",num1,num2,mul);
        System.out.printf("%d / %d = %d\n",num1,num2,div);
        System.out.printf("%d mod %d = %d\n",num1,num2,mod);
    }
}
