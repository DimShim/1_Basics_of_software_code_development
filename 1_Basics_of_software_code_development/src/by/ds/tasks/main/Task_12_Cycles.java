package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа
 *    суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task_12_Cycles {
	
	public static void main(String [] args) {
		
		int c = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int a = in.nextInt();
		
		for (int b = 1; b <= a; b++) {
			c += b;
		}
		System.out.println(c);
		in.close();
	}

}