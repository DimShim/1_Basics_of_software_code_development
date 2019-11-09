package by.ds.tasks.main;

/*
 * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
 *    модуль которых больше или равен заданному е. Общий член имеет вид:
 *    a[n] = 1/Math.pow(2, n) + 1/Math.pow(3, n) 
 */

import java.util.Scanner;
import java.lang.Math;

public class Task_16_Cycles {
	public static void main(String[] args) {
		
		double a = 0;
		double sum = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter e: ");
		double e = in.nextDouble();
		
		for (int n = 1; n < 1000; n++) {
			a = 1/Math.pow(2, n) + 1/Math.pow(3, n);
			//System.out.println(a);
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}
		System.out.printf("sum is %.10f", + sum);
		in.close();
		
	}

}
