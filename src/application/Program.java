package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessExceptions;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(numberAccount, holder, initialBalance, withdrawLimit);
		
		System.out.print("\nEnter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
		}
		catch(BusinessExceptions e){
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}
	
}
