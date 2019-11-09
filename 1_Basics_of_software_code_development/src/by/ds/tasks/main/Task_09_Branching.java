package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 3. Даны три точки A(x1,y1), B(x2,y2), C(x3,y3). Определить,
 *    будут ли они расположены на одной прямой.
 */

public class Task_09_Branching {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter coord A(x1,y1): ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();

		System.out.print("Enter coord B(x2,y2): ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		System.out.print("Enter coord C(x3,y3): ");
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();

		if ((x1 == x2 & x2 == x3) | 
			(y1 == y2 & y2 == y3) | 
			(x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
			System.out.println("Точки расположены на одной прямой!");
		} else {
			System.out.println("Точки не расположены на одной прямой!");
		}
		in.close();

	}

}
