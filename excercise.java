
package javapractice;

import java.util.Scanner;

public class excercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance,bonus;
        String sex;
        String f = "female";
        
        
        System.out.print("What is ur SEX: ");
        sex = input.next();
        
        System.out.print("How much ur Salary: ");
        balance = input.nextDouble();
        
            if(sex.equals(f)){
            if(balance>5000){
               bonus = 0.5*balance; 
            }
            else{
               bonus = balance*0.2; 
            }
        }
        else{
            bonus = 0.2*balance;
        }
        balance = balance + bonus;
        System.out.println("Ur Salary with Bonus Is: "+balance);
    }
}
