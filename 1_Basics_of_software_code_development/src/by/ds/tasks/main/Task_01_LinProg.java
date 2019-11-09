package by.ds.tasks.main;

/* 
 * 1. Найдите значение функции: z = ( (a - 3 ) * b / 2) + c
 */

import java.util.Scanner;

public class Task_01_LinProg {
	public static void main(String[] args) {

		float z;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter - с: ");
		float c = in.nextFloat();

		System.out.print("Enter - a: ");
		float a = in.nextFloat();

		System.out.print("Enter - b: ");
		float b = in.nextFloat();

		z = ((a - 3) * b / 2) + c;

		System.out.printf("Значение функции z = %.2f \n", z);

		in.close();

	}
}