package by.ds.tasks.main;

import java.math.BigInteger;

/*
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task_15_Cycles {
	
	public static void main(String[] args) {
		
		// примитивные типы данных не позволяют посчитать данное число
		/*long b = 1;
		
		for (int a = 1; a <= 200; a++) {
			int squ = a * a;
			b = b * squ;
			System.out.println(b);
		}
		//System.out.print(b);
		*/
		
		
        BigInteger a = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger square = new BigInteger("0");
        BigInteger multiplication = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            a = a.add(one);
            square = a.multiply(a);
            multiplication = multiplication.multiply(square);
        }
        System.out.println("Произведение квадратов = " + multiplication);
		
	}

}
