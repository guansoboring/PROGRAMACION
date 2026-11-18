package ejercicio7;
import java.util.Scanner;
public class ejercicio7 {
public static void main(String[]args) {
	
	Scanner input=new Scanner(System.in);
	int contadornegativo=0;
	int contadorpositivo=0;
	int contador=0;
	int numero=0;
	do {
		System.out.println("Introduce un número(no nulo)");
		numero=input.nextInt();
		contador++;
		if(numero>0) {
			contadorpositivo++;
		}else {
			contadornegativo++;
		}
		
	}while(contador<3&&numero!=0);
	
	System.out.print("hay: "+contadorpositivo+" positivos"+" y "+contadornegativo+" negativos");
	
}
}
