package ejercicio5;
import java.util.Scanner;
public class ejercicio5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
System.out.println("Introduce un número");
int numero = input.nextInt();
int factorial=1;
for(int i=0;i<=numero;i++) {
   factorial = (factorial*i)*(numero-i);
}
System.out.println("el factorial del numero es: "+factorial);
	}

}
