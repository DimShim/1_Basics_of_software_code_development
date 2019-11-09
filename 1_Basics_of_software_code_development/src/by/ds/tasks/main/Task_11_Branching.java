package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 5. Вычислить значение функции: F(x) = x^2 - 3x + 9, если x <= 3;
 * 							      F(x) = 1/(x^3 + 6),  если x > 3.
 */

public class Task_11_Branching {

	public static void main(String[] args) {

		double y;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter x: ");
		double x = in.nextDouble();

		if (x <= 3) {
			y = (x * x) - (3 * x) + 9;
		} else {
			y = 1 / (x * x * x + 6);
		}

		System.out.printf("y = %.3f \n", y);
		in.close();
	}

}
