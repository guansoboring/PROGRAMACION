package ejercicio4;
import java.util.Scanner;
public class ejercicio4 {
public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	
	System.out.println("Introduce una palabra");
	String palabra=name.nextLine();
	String []letras=palabra.split("");
	
	int a=0;
	int e=0;
	int i=0;
	int o=0;
	int u=0;
	
	
	
	for (int j = 0; j < letras.length; j++) {
		if (letras[j].equalsIgnoreCase("a")) {
			a++;
		}else if (letras[j].equalsIgnoreCase("e")) {
			e++;
		}else if (letras[j].equalsIgnoreCase("i")) {
			i++;
		}else if (letras[j].equalsIgnoreCase("o")) {
			o++;
		}else if (letras[j].equalsIgnoreCase("u")) {
			u++;
		}
	}
	System.out.println("Nº de a: "+ a);
	System.out.println("Nº de e: "+ e);
	System.out.println("Nº de i: "+ i);
	System.out.println("Nº de o: "+ o);
	System.out.println("Nº de u: "+ u);
	
	
	
}
}
