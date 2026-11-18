package ejercicio2;
import java.util.Scanner;
public class ejercicio2 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		   Scanner input =new Scanner(System.in);
		  
		   System.out.println("Cómo te llamas?");
		   String nombre =input.nextLine();
		  
		   System.out.println("Donde vives?");
		   String direccion =input.nextLine();
		   
		   System.out.println("Cuál es tu número de telefono?");
		   String telefono =input.nextLine();
		   
		   System.out.println("Hola "+nombre);
		   System.out.println("Vives en "+direccion);
		   System.out.println("Tu número de telefono es: "+telefono);
			}

}
