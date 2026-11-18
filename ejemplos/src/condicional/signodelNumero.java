package condicional;
import java.util.Scanner;
public class signodelNumero {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
	System.out.println("Dame un númeor");
	int num =input.nextInt();
	if (num<0) { System.out.println("El número es negativo");
	} else {System.out.println("El número es positivo");
}}}
