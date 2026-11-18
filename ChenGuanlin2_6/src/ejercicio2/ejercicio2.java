package ejercicio2;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("Introduce tu nombre");
String nombre =input.nextLine();

System.out.println("Introduce tu edad");
byte edad =input.nextByte();

System.out.println("Introduce tu nota");
float nota =input.nextFloat();

if(edad>=18&&nota>=7) {System.out.println(nombre+" usted ha sido admitido en el curso, cumple las condiciones requeridas");
	}
else System.out.println(nombre+ " lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");


	
	
	
	
	
	}}
