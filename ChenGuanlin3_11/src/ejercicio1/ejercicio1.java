package ejercicio1;

public class ejercicio1 {
public static void main(String[] args) {
	
	        int[][] matriz = new int[5][5];

	        int numero = 1;

	  
	        for (int i = 0; i < 5; i++) {

	            for (int j = 0; j < 5; j++) {

	                matriz[i][j] = numero;
	                numero++;

	            }
	        }

	
	        for (int i = 0; i < 5; i++) {

	            for (int j = 0; j < 5; j++) {

	                System.out.print(matriz[i][j] + "\t");

	            }

	            System.out.println();
	        }
	    }
	
	
	
}

