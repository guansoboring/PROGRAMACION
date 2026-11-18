package ejercicio3;
import java.util.Scanner;
public class ejercicio3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Introduce el número de la fila");
	int n =input.nextInt();
	System.out.println("Introduce el número de la fila");
	int m =input.nextInt();
	
	 int [][] matriz=new int [n][m];
	 int positivos=0;
	 int negativos=0;
	 int ceros=0;
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			System.out.println("Introduce el número");
			matriz[i][j]=input.nextInt();
			  }
		
	}
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
	       System.out.print(matriz[i][j]+"\t");
		}System.out.println(" ");
		}
	
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			if(matriz[i][j]>0) {
				positivos+=1;
			}else if (matriz[i][j]<0) {
				negativos+=1;
			}else {
				ceros+=1;
			}
					
		}
	}
	System.out.println("postivivos: "+positivos);	
	System.out.println(" negativos: "+negativos);	
	System.out.println(" ceros: "+ceros);
	
	
	
}
}
