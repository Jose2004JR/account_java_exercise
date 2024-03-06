package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import model.entitites.Account;
import model.excption.AccountException;

public class Program {

	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());
			sc.close();
		} 
		catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Formato inválido");
		}
	}
}
