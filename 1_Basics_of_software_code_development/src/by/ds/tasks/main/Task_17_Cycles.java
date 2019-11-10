package by.ds.tasks.main;

/*
 * 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task_17_Cycles {
	public static void main(String[] args){
		
      for(int i =0; i<256; i++){
    	  System.out.println( i + ". " + (char)i);
        }
    }
}
