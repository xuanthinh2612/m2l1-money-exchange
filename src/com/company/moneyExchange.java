package com.company;

import java.util.Scanner;

public class moneyExchange {

    public static void main(String[] args) {
	// write your code here
        System.out.println("input your money to exchange (USD)");
        Scanner scanner = new Scanner(System.in);
        double inputMoney = scanner.nextDouble();
        double outputMoney = inputMoney*23500;
        System.out.printf("to VND: %.2f",outputMoney);
    }
}
