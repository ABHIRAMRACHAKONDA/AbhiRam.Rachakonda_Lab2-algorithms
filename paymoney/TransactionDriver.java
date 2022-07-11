package com.greatlearning.paymoney;

import java.util.*;

public class TransactionDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the Transaction");
		int size = sc.nextInt();

		int transaction[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the daily transactions in crores of day " + (i + 1));
			transaction[i] = sc.nextInt();
		}

		// method to display transaction
		displayTransactions(transaction);

		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();

		while (targetNo-- != 0) {
			System.out.println("enter the value of target");
			int target = sc.nextInt();

			// method to get no.Of transactions required
			int numberOfTransactions = PayMoney.numberOfTransactions(transaction, target);

			if (numberOfTransactions == -1) {
				System.out.println("The target " + target + " amount is not acheived");
			} else {
				System.out.println("The target " + target + " amount is acheived in crores at " + numberOfTransactions
						+ " transaction");

			}
		}
		sc.close();
	}

	public static void displayTransactions(int[] transaction) {
		for (int i = 0; i < transaction.length; i++) {
			System.out.println(transaction[i] + " ");
		}
	}
}