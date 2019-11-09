package by.ds.tasks.main;

/*
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

import java.util.Scanner;

public class Task_02_LinProg {
	public static void main(String[] args) {

		double x1;    // Вычисляем значение под корнем
		double koren; // Извлекаем корнь числа
		double x2;    // Возводим в отрицательную степень 'b' по условию
		int stepn;

		double y;

		stepn = -2;

		Scanner in = new Scanner(System.in);

		System.out.print("Vvedite peremennyuy a: ");
		double a = in.nextDouble();

		System.out.print("Vvedite peremennyuy b: ");
		double b = in.nextDouble();

		System.out.print("Vvedite peremennyuy c: ");
		double c = in.nextDouble();

		x1 = ((b * b) + (4 * a * c));
		koren = Math.sqrt(x1);
		x2 = Math.pow(b, stepn);

		y = ((b + koren) / 2 * a) - ((a * a * a) * c) + x2;
		System.out.printf("Znachenie Y: %.2f \n", y);

		in.close();

	}

}
