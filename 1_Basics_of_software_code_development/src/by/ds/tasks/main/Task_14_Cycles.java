package by.ds.tasks.main;

/*
 * 3. Найти сумму квадратов первых ста чисел.
 */

public class Task_14_Cycles {
		
	public static void main(String[] args) {
		
		int b = 0;
		
		for (int a = 1; a <= 100; a++) {
			int squ = a * a;
			b +=squ;
		}
		System.out.print(b);
	}

}
