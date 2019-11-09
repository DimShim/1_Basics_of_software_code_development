package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 2. Вычислить значение функции на отрезке [a,b] с шагом h.
 */

public class Task_13_Cycles {
	
	
    public static void main(String[] args) {
        
    	 double a;
         double b;
         double h;
         double с = 0;
         
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a - ");
        a = in.nextDouble();
        System.out.println("Введите b - ");
        b = in.nextDouble();
        System.out.println("Введите h - ");
        h = in.nextDouble();

        while (a <= b) {
            if (a <= 2) {
            	с = -a;
            } else {
            	с = a;
            }
            System.out.println("x = "+ a + " | y = " + с);
            a += h;
        }
        in.close();
    }
}
	