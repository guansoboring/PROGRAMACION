package ejercicio2;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] numeros=new int[10];
		int numero;
		int suma=0;
		
		for(int i=0;i<10;i++) {
		System.out.println("Introduce un número "+(i+1) );
		numeros[i]=input.nextInt();
		}
		
	   for(int i=0;i<numeros.length;i++) {
		    suma=suma+numeros[i];
	
	}System.out.print(suma);
	
	
	
	
	}

}
