package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры
 *    x, y, z кирпича. Определить, пройдет ли кирпич через
 *    отверстие.
 */

public class Task_10_Branching {

	public static void main(String[] args) {

		int a; // высота отверстия
		int b; // ширина отверстия

		a = 5;
		b = 10;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter x brick: "); // ширина кирпича
		int x = in.nextInt();

		// длина кирпича, считаем что она в априори > ширины и высоты,
		// System.out.print("Enter y brick: ");
		// int y = in.nextInt();

		System.out.print("Enter z brick: "); // высота кирпича
		int z = in.nextInt();

		if (z <= a & x <= b) {
			System.out.println("Brick will enter");
		} else {
			System.out.println("The brick will not enter");

		}
		in.close();
	}

}
