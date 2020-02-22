package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AcountException;

public class Program {

	public static void main(String[] args) throws AcountException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withDrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withDrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			acc.withDraw(amount);
			
			System.out.println(acc.toString());
		
		}
		catch(InputMismatchException e){
			System.out.println("Error type miss match: " + e.toString());
		}
		catch(AcountException e) {
			System.out.println(e.getMessage());
		}
			
		
		sc.close();

	}

}
