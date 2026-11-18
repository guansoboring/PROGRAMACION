package ejercicio1;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);

System.out.println("Introduce tu nombre");
String nombre =input.nextLine();

System.out.println("Introduce tu edad");
int edad =input.nextInt();
System.out.println("Introduce tu salario deseado ");
float salariodeseado =input.nextFloat();
 if(salariodeseado>=30000||edad>=45) {
	 System.out.println("Lo sentimos pero no cumple nuestro perfil");
 }
 else{System.out.println("Años de experiencia");
 int aniosexperiencias=input.nextInt();
 System.out.println("Números de proyectos");
int numerosproyectos =input.nextInt();

if (aniosexperiencias>=2&&numerosproyectos>=3) {
		System.out.println("Estás contratado");
	}
 }
 
	}}
	


