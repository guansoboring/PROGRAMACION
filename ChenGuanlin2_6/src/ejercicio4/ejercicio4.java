package ejercicio4;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("Introduce tu nombre");
String nombre = input.nextLine();

System.out.println("Introduce tus apellidos");
String apellidos = input.nextLine();

System.out.println("Introduce tu ImporteGastado1");
float gastado1 = input.nextFloat();
System.out.println("Introduce tu ImporteGastado2");
float gastado2 = input.nextFloat();
System.out.println("Introduce tu ImporteGastado3");
float gastado3 = input.nextFloat();
System.out.println("Introduce tu ImporteGastado4");
float gastado4 = input.nextFloat();

float total=gastado1+gastado2+gastado3+gastado4;
float media=(gastado1+gastado2+gastado3+gastado4)/4;

System.out.println("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nImporteGastado1"+gastado1+"\nImporteGastado2"+gastado2+"\nImporteGastado3"+gastado3+"\nImporteGastado4"+gastado4+"\nMedia: "+media+"\nTotal: "+total);

if(total>=300) {
	if(total<1) {
		total=(int)total;
	}
	System.out.println("Tienes un descuento de 50€");
}else System.out.println("No tienes descuento");


	
	}}