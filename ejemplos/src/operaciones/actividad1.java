package operaciones;

public class actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e1=13;
		int e2=72;
        double d1 = 13.69;
        double d2 = 69.13;
        int sumaEntero=e1+e2;
        
       
 System.out.println(
	        " Valores iniciales: e1=" + e1 + ", e2=" + e2 + ", d1=" + d1 + ", d2=" + d2 +
	        "   Suma enteros: " + sumaEntero +
	        "   Resta enteros: " + (e1 - e2) +
	        "  Producto enteros: " + (e1 * e2) +
	        "   Cociente e2/e1: " + (e2 / e1) +
	        "   Resto e2/e1: " + (e2 % e1) +
	        "   Suma double: " + (d1 + d2) +
	        "  Resta double: " + (d1 - d2) +
	        "   Producto double: " + (d1 * d2) +
	        "   División double: " + (d1 / d2) +
	        "   Resto double: " + (d1 % d2) +
	        "   Doble: e1=" + (e1 * 2) + ", e2=" + (e2 * 2) +
	        ", d1=" + (d1 * 2) + ", d2=" + (d2 * 2) +
	        "   Suma todas: " + (e1 + e2 + d1 + d2) +
	        "  Producto todas: " + (e1 * e2 * d1 * d2)
	    );
d1 = Math.random();
System.out.println(d1);}   
	

}
