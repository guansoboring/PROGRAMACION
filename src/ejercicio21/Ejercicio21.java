package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
public static boolean Menu(int a ) {
	Scanner name = new Scanner(System.in);
	System.out.println("1.Circuferencias");
	System.out.println("2.Área");
    a=name.nextInt();
    if(a==1) {
    	return true;
    }else {
    	return false;
    }
}
public static double Circu(double a) {
	return (2*Math.PI*a);
}
public static double Area(double a) {
	return (Math.PI*a*a);
}
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Introduce el radio(cm)");
		int radio =name.nextInt();
		int inicio=0;
		if(Menu(inicio)) {
			System.out.println("1.Circuferencias");
			System.out.println("La circuferencia es: "+Circu(radio));
		}else {
			System.out.println("2.Área");
			System.out.println("El área es: "+Area(radio));
		}

  
	
	
	
	}
}
