 
package javapractice;
 
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        int i,j,k;
        System.out.print("Give a value:");
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        
        for(i=1;i<=10;i++){
            k = j*i;
            System.out.printf("%d * %d = %d\n",j,i,k);
        }
        System.out.println("   j     a   v      v   a");
        System.out.println("   j    a a   v    v   a a");
        System.out.println("j  j   a a a   v  v   a a a");
        System.out.println(" jj   a     a   v    a     a");
        
    }
}
