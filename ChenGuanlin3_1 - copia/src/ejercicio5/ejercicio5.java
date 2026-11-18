package ejercicio5;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input =new Scanner(System.in);
	     int [] numeros=new int [20];
	     for(int i=0;i<numeros.length;i++) {
	    	 System.out.println("Introduce un número "+(i+1));
	    	 numeros[i]=input.nextInt();
	    	 
	     }double suma=0;
	     for(int i=0;i<numeros.length;i++) {
	    	 suma+=numeros[i];
	     } System.out.println("La media es: "+(suma/numeros.length));
	}

}
