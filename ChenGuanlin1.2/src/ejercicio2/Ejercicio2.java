package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       System.out.println("Introduce el nombre del equipo");
       String nombre = input.nextLine();
       
       System.out.println("Introduce el año de la fundación");
       int anios = input.nextInt();
       input.nextLine();
       
       System.out.println("Introduce el nombre de estadio");
       String nombreDeEstadio = input.nextLine();
       
       System.out.println("Introduce el nombre del capitán");
       String nombreDelcapitan = input.nextLine();
       
       System.out.println("**********************************************************************************************");
       System.out.println("******* Nombre del Equipo: " +nombre + " ****************************************************");
       System.out.println("******* Fundado en: " + anios + " ********************************************************************");
       System.out.println("******* Estadio: " + nombreDeEstadio + " *********************************************************************");
       System.out.println("******* Capitán: " + nombreDelcapitan + " *********************************************************************");
       System.out.println("**********************************************************************************************");
	}

}
