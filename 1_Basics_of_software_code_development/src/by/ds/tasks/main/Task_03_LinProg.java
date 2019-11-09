package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * 	  (sinx + cosy) / (cosx - siny) * tg xy
 */

public class Task_03_LinProg {
	public static void main(String[] args) {

		double sinx;
		double siny;
		double cosx;
		double cosy;
		double tgxy;

		double a;
		double b;

		System.out.println("Vvedite 4isla 4tobi x*y <= 360");
		Scanner in = new Scanner(System.in);

		System.out.print("Vvedite x: ");
		double x = in.nextDouble();

		System.out.print("Vvedite y: ");
		double y = in.nextDouble();

		double xy = x * y;

		sinx = Math.toRadians(x);
		siny = y * Math.PI / 180;
		cosx = Math.toRadians(x);
		cosy = y * Math.PI / 180;
		tgxy = Math.toRadians(xy);

		a = ((Math.sin(sinx) + Math.cos(cosy)) / (Math.cos(cosx) - Math.sin(siny))) * Math.tan(tgxy);
		System.out.println("Otvet v radianah A = " + a);

		b = Math.toDegrees(a);
		System.out.println("Iz rad v grad A = " + b);

		in.close();
	}

}
