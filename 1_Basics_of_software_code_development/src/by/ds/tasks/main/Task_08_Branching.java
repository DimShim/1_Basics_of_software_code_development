package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 2. Найти max{min(a, b), min(c, d)}.
 */

public class Task_08_Branching {

	public static void main(String[] args) {

		int min1;
		int min2;
		int max1;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = in.nextInt();

		System.out.println("Enter b: ");
		int b = in.nextInt();

		System.out.println("Enter c: ");
		int c = in.nextInt();

		System.out.println("Enter d: ");
		int d = in.nextInt();

		if (a < b) {
			min1 = a;
			System.out.println("min1 is: " + a);
		} else {
			min1 = b;
			System.out.println("min1 is: " + b);
		}

		if (c < d) {
			min2 = c;
			System.out.println("min2 is: " + c);
		} else {
			min2 = d;
			System.out.println("min2 is: " + d);
		}

		if (min1 > min2) {
			max1 = min1;
			System.out.println("maximum is: " + max1);
		} else {
			max1 = min2;
			System.out.println("maximum is: " + max1);

		}

		in.close();
	}

}
