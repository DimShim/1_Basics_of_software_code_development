package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители,
 *    кроме единицы и самого числа. m и n вводятся с клавиатуры.   
 */

public class Task_18_Cycles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter m: ");
		int m = in.nextInt();
		System.out.print("Enter n > m: ");
		int n = in.nextInt();
		
		while(m <= n) {
			System.out.print(m + " - ");
		for(int i = 2; i <= n; i++) {
			if(m % i == 0 & i != m) {
				System.out.print(i + " " );
			}
		}
		System.out.println();
		m += 1;
		}
		in.close();
	}
}
