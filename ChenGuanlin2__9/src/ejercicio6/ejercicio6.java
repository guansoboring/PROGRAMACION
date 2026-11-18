package ejercicio6;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input =new Scanner(System.in);
		
		int numero=0;
		boolean negativo=false;   //para detectar negativos
	    int contador=0;
	    
	   do{
	    	System.out.println("Introduce un número");
			 numero=input.nextInt();
			 contador++;
			 if(numero<0) {
				 negativo=true;    //detectado un negativo
	    }
			 } while(contador<100&& numero!=0);   // controlar las veces y no contar los valores nulos
		
	  // imprimir el resultado
	   if(negativo) {
		   System.out.print("Se ha leido algún negativo");
	   }else {
		   System.out.print("no se ha leido ningun negativo");
	   }
		 
		 
		 
	 }
		
		
		
		}
		
		
		
		
	


