package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой
 *    треуголник, и если да, то будет ли он прямоугольным.
 */

public class Task_07_Branching {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter angle a: ");
		int a = in.nextInt();

		System.out.println("Enter angle b: ");
		int b = in.nextInt();

		if (180 - a - b > 0) {
			System.out.println("Triangle exists!");

			if (180 - a - b == 90) {
				System.out.println("Right triangle!");
			}
		}
		in.close();

	}

}
