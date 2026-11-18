package ejercicio2;
import java.util.Scanner;
public class ejercicio2 {
public static void main(String[] args) {
Scanner name = new Scanner(System.in);
	
	System.out.println("introduce una frase");
	String frase1=name.nextLine();
	System.out.println("introduce otra frase");
	String frase2=name.nextLine();
	
	if(frase1.equalsIgnoreCase(frase2)) {
		System.out.println("Son iguales");
	}else {
		System.out.println("Son diferentes");
	}
	
	
	
	
}
}
