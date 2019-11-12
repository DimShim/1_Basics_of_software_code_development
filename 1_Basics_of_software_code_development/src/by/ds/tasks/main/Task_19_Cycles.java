package by.ds.tasks.main;

import java.util.Scanner;

/*
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и 
 *    второго числа.
 */

public class Task_19_Cycles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter two number: ");
		int a = in.nextInt();
		System.out.print("Enter two number: ");
		int b = in.nextInt();
		int s = b;
		int z = 0;
		int v = 0;
		byte  pq=0, pw=0,pe=0,pr=0,pt=0,py=0,pu=0,pi=0,po=0,pp=0;
		
		while(a != 0) {		//перебор первого числа
			int c = a % 10;
			
			while (b != 0) {	// перебор второго числа
				int x = b % 10;
				if(x == c) { 		// выводим число только один раз
					/////////////////
					if(x == 0) { 		
						pq++;
						if(pq==1) {
							byte q=0;
						System.out.print(" "+ q);
						}
					} 
						/////////////////
						if(x == 1){
							pw++;
							if(pw==1) {
								byte w=1;
							System.out.print(" "+ w);
							}
						} 
							/////////////////
							if(x == 2){
								pe++;
								if(pe==1) {
									byte e=2;
								System.out.print(" "+ e);
								}
							} 
								/////////////////
								if(x == 3){
									pr++;
									if(pr==1) {
										byte r=3;
									System.out.print(" "+ r);
									}
								} 
									/////////////////
									if(x == 4){
										pt++;
										if(pt==1) {
											byte t=4;
										System.out.print(" "+ t);
										}
									} 
										/////////////////
										if(x == 5){
											py++;
											if(py==1) {
												byte y=5;
											System.out.print(" "+ y);
											}
										} 
											/////////////////
											if(x == 6){
												pu++;
												if(pu==1) {
													byte u=6;
												System.out.print(" "+ u);
												}
											} 
												/////////////////
												if(x == 7){
													pi++;
													if(pi==1) {
														byte i=7;
													System.out.print(" "+ i);
													}
												} 
													/////////////////
													if(x == 8){
														po++;
														if(po==1) {
															byte o=8;
														System.out.print(" "+ o);
														}
													} 
														/////////////////
														if(x == 9){
															pp++;
															if(pp==1) {
																byte p=9;
															System.out.print(" "+ p);
															}
														} 
				}
				// проверяем повторяющиеся подряд цифры для второго числа
				do {
					b = (b-x)/10;
					v = b%10;
				}while(v == x);
			
				if(b == x)
					break;
			}
			b = s; // резервная копия второго числа
			
			// проверяем повторяющиеся подряд цифры для первго числа
			do {
				a = (a - c) / 10;
				z = a%10;
			}while(z == c);
			
				if(a == 0)
					break;	
		}
		in.close();
	}
	
}
