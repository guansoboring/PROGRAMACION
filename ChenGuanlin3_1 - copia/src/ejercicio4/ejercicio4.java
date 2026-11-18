package ejercicio4;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input =new Scanner(System.in);
     int [] numeros=new int [20];
     
     for(int i=0;i<numeros.length;i++) {
    	 System.out.println("Introduce un número "+(i+1));
    	 numeros[i]=input.nextInt();
     }
	int sumapositivos=0;
	int sumanegativos=0;
	
	for(int i=0;i<numeros.length;i++) {
		if(numeros[i]>0) {
			sumapositivos+=numeros[i];
		}else {
			sumanegativos+=numeros[i];
			}
	}      	System.out.println("La suma de los positivos son: "+sumapositivos);
            System.out.println("La suma de los negativos son: "+sumanegativos);
	}    
}
	
	
	