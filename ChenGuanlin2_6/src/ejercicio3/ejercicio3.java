package ejercicio3;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("Introduce tu nombre");
String nombre = input.nextLine();

System.out.println("Introduce tus apellidos");
String apellidos = input.nextLine();

System.out.println("Introduce tu edad");
byte edad = input.nextByte();


if(edad>=18) {
	System.out.println("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nedad: "+edad+"\n"+"\n"+"Usted ha sido admitido");
}
else System.out.println("No tiene la edad requerida para realizar estos estudios");

	}

}
