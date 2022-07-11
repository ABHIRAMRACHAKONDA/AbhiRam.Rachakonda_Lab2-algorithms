package com.greatlearning.currency;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Currency Denominations");
		int numberOfDenominations = sc.nextInt();
		int[] denominations = new int[numberOfDenominations];
		System.out.println("Enter the currency Denominations");
		for (int i = 0; i < numberOfDenominations; i++) {
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount which you want to pay");
		int amount = sc.nextInt();

		Currency currency = new Currency(denominations, numberOfDenominations);
		MergeSort.sort(currency.denominations, 0, numberOfDenominations - 1);

		NotesCount.numberOfDenominations(currency.denominations, amount);
		sc.close();
	}

}
