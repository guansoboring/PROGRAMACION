package ejercicio3;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input =new Scanner(System.in);
     int [] numeros=new int [10];
	
	
	 for(int i=0;i<numeros.length;i++) {
		System.out.println("Introduce un número"+(i+1));
		numeros[i]=input.nextInt();
	}  
	 int maximo=numeros[0];
    
	 for(int i=1;i<numeros.length;i++) {
       if(maximo<=numeros[i]) {
    	   maximo=numeros[i];
    	   }
    }System.out.println("El mayor es : "+maximo);
    
    int minimo=numeros[0];
    
	 for(int i=1;i<numeros.length;i++) {
      if(minimo>=numeros[i]) {
   	   minimo=numeros[i];
   	   }
   	   
   	   }System.out.println("El mayor es : "+minimo);
    	
     
     
     
     
	}

}
