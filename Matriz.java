package ejercicio02;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3, 5 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println("Aqui muestro una matriz de 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
