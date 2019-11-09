package by.ds.tasks.main;

/*
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 *    Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task_04_LinProg {
	public static void main(String[] args) {

		double R;
		double c;

		R = 555.222;
		c = ((R % 1) * 1000) + ((R - (R % 1)) / 1000);

		System.out.println("R = " + R);
		System.out.printf("c = %.3f\n", c);

	}

}
