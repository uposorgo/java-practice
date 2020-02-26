

package javapractice;

import java.util.Scanner;

public class FayolsTriangle {
   public static void main(String args[]){
      int n,i,j,k = 1;
      System.out.println("Enter the number of lines you need in the FloyidsTriangle");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();

      for(i = 1; i <= n; i++) {
          for(j = n; j >= i;j--){
              System.out.print(" ");
          }
         for(j=1;j <= i; j++){
            System.out.print(" "+i);
         }
         System.out.println();
      }
   }
}
