package com.greatlearning.paymoney;

public class PayMoney {

	public static int numberOfTransactions(int[] transaction, int target) {

		for (int i = 0; i < transaction.length; i++) {
			if (target == transaction[i] || target < transaction[i]) {
				return i + 1;
			} else {
				target = target - transaction[i];
			}
		}
		return -1;
	}

}
