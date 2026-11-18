package ejercicio1;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] numeros=new int[10];
	
		
		
		for(int i=0;i<10;i++) {
		System.out.println("Introduce un número "+(i+1) );
		numeros[i]=input.nextInt();
		}
		
	   for(int i=0;i<numeros.length;i++) {
		System.out.print(numeros[i]+" ");
	}
	
	
	
	
	}

}
