package ejercicio2;

import java.util.Iterator;

public class ejercicio2 {
public static void main(String[] args) {
	
	final int [][] tabla=new int[10][10];
	
	
	for (int i = 0; i < tabla.length; i++) {
		for (int j = 0; j < tabla[i].length; j++) {
			tabla[i][j]=(i+1)*(j+1);
		}
	}
	for (int i = 0; i < tabla.length; i++) {
		for (int j = 0; j < tabla[i].length; j++) {
			System.out.print(tabla[i][j]+ "/t");
		}
	}
	
	
	
}
}
