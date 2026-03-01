import java.util.Scanner;
public class deber {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor para la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        leer.close();
    }

        
    
    
}