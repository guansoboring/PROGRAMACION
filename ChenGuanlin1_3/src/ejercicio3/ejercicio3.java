package ejercicio3;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Introduce el número 1");
		double numero1 = input.nextDouble();
		
		System.out.println("Introduce el número 2");
		double numero2 = input.nextDouble();
		double numero3;
		
		numero3=numero1;
		numero1=numero2;
		numero2=numero3;
	    
		
		System.out.println("Los números se intercambiaron,número1 es: "+ numero1+" número2 es: "+numero2);
		
	}
	}