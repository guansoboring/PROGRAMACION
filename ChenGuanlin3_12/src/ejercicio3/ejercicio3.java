package ejercicio3;
import java.util.Scanner;
public class ejercicio3 {
public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	
	System.out.println("Tu nombre");
	String nombre=name.nextLine();
	String []letras_nombre=nombre.split("");
	
	System.out.println("Tu primer apellido");
	String apellido1=name.nextLine();
	String []letras_apellido1=apellido1.split("");
	
	System.out.println("Tu segundo apellido");
	String apellido2=name.nextLine();
	String []letras_apellido2=apellido2.split("");
    
String codigo=letras_nombre[0]+letras_nombre[1]+letras_nombre[2]+letras_apellido1[0]+letras_apellido1[1]+letras_apellido1[2]
	+letras_apellido2[0]+letras_apellido2[1]+letras_apellido2[2];
	
System.out.println(codigo.toUpperCase());	
	
	
}
}
