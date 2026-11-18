package ejercicio1;

public class ejercicio1 {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        int numero = 1;


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = numero;
                numero++;

            }
        }

    
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();
        }
    }
}