package ejemplos;

import java.util.Scanner;
public class pediralusuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaTeclado= new Scanner (System.in);
		
		System.out.println("nombre :");
		String nombre = entradaTeclado.nextLine(); 
		
		System.out.println("edad :");
		byte edad = entradaTeclado.nextByte();
		
		System.out.println("altura :");
		float altura = entradaTeclado.nextFloat();
		

		
		
	}
}