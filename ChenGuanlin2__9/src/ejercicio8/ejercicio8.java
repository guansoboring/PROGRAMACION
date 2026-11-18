package ejercicio8;
import java.util.Iterator;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int numero=0;
		boolean negativo=false;
		int contadornegativo=0;
		int contadorpositivo=0;
		do {
			System.out.println("Introduce un número(no nulo)");
			numero=input.nextInt();
			if(numero>0) {
				contadorpositivo++;
			}else {
				negativo=true;
				contadornegativo++;
			}
			
		}while(numero!=0);
		if(negativo) {
			System.out.println("Se ha detectado negativo");
		}
		System.out.print(contadorpositivo+" positivos\n"+contadornegativo+" negativos");
		
		
	}

}
