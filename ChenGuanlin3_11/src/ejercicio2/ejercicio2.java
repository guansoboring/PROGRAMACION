package ejercicio2;

import java.util.Iterator;

public class ejercicio2 {
public static void main(String[] args) {
	
	final int [][] tabla=new int [10][10];
	
	
	for (int  j= 0; j < tabla.length;j ++) {
		for (int i = 0; i < tabla[j].length; i++) {
			
			tabla[j][i]=(j+1)*(i+1);
			System.out.print(tabla[j][i]+"\t");
			
		}
	}

	
	
	



}
}
