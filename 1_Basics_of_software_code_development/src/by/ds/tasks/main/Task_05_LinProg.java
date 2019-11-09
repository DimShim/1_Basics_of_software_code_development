package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 5. Дано натуральное число Т, которое представляет длительность
 *    прошедшего времени в секундах. Вывести данное значение длительности
 *    в часах, минутах и секундах в следующей форме: HHч MMмин SSс. 
 */

public class Task_05_LinProg {
	public static void main(String[] args) {

		int b; // переменная для часов
		int c; // переменная для минут
		int d; // переменная для секунд

		Scanner time = new Scanner(System.in);

		System.out.println("Enter a natural number: ");
		int t = time.nextInt();

		b = t / 3600;
		c = (t - (b * 3600)) / 60;
		d = t - (b * 3600) - (c * 60);

		System.out.println(b + "h " + c + "min " + d + "sec");

		time.close();
	}

}
