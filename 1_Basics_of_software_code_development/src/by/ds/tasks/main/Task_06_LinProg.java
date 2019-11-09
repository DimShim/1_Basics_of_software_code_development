package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 6. Для данной области составить линейную программу, которая печатает true, если точка с 
 *    координатами (x, y) принадлежит закрашенной области, и false - в противном случае:
 */

public class Task_06_LinProg {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean point;

		System.out.print("Enter x: ");
		int x = in.nextInt();

		System.out.print("Enter y: ");
		int y = in.nextInt();

		point = (y >= 0 & y <= 4 & x >= (-2) & x <= 2) |

				(y <= 0 & y >= (-3) & x >= (-4) & x <= 4);
		System.out.println(point);

		in.close();
	}

}
