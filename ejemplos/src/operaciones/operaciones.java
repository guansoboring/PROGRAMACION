package operaciones;
import java.util.Scanner;
public class operaciones {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Introduce un número: ");
	 int num = input.nextInt();
	  System.out.println("La raíz cuadrada del número es: "+ Math.sqrt(num));
	  
  }
}
