 
package javapractice;

import java.util.Scanner;

 
public class test234 {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sex : female/male");
		String sex = input.next();
		System.out.println("Enter the balance:");
		int balance;
        balance = input.nextInt();
		
		double bonus;
		
	if(sex.equals("female"))
	{
		if (balance > 5000) 
		{
			bonus = 5.0 * balance;
		}
		else 
		{
			bonus = 2.0 * balance;
		}
			
	} 
	else 
	{
		bonus = 3.0 * balance;
	}
		
	double balance1 = balance + bonus;
	
	System.out.println("Total balance is:"+balance1);
	System.out.println(balance);
	System.out.println(bonus);
	}
    
    
    
}
