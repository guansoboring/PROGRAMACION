package ejercicio1;
import java.util.Scanner;
public class ejercicio1 {
public static void main(String[] args) {

	Scanner name = new Scanner(System.in);
	System.out.println("Introduce una frase");
	String frase=name.nextLine();
	
	String [] palabras=frase.split(" ");
	
	for (int i = 0; i < palabras.length; i++) {
		System.out.println(palabras[i]);
	}
	
}
}
