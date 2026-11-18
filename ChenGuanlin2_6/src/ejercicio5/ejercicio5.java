package ejercicio5;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("Introduce tu nombre");
String nombre = input.nextLine();

System.out.println("Introduce tus apellidos");
String apellidos = input.nextLine();

System.out.println("Introduce tu ciclo formativo");
String ciclo = input.nextLine();

System.out.println("Introduce tu nota");
int nota = input.nextInt();

System.out.println("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nCiclo formativo: "+ciclo+"\nNota: "+nota);

if(nota<5&&nota>=0) {//nota suspenso y evitar número negativo
	System.out.println("Insuficiente");
}
if(nota>=5) {
	System.out.println("Aprobado");
}
if(nota>=5) {
	System.out.println("Aprobado");
}
if(nota==6) {
	System.out.println("Bien");
}
if(nota>6&&nota<=8) {
	System.out.println("Notable");
}	
if(nota>8&&nota<=10) {
	System.out.println("Sobresaliente");
}	}}