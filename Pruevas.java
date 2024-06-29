import java.util.Scanner;

public class Pruevas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salida = "salir";
        System.out.println("Quieres salir");
        String salir = sc.next();

        System.out.println("Mi moto alpina derapante");
        String cadena = "Mi moto alpina derapante";

        for (int j; j < cadena.length(); j++) {
            System.out.println((int) cadena.charAt(j) + " ");
        }

        int contadr = 0;
        for (int i = 0; i < cadena.length(); i++) {
            // Comprobamos si el caracter es una vocal
            if (cadena.charAt(i) == 'a' ||
                    cadena.charAt(i) == 'e' ||
                    cadena.charAt(i) == 'i' ||
                    cadena.charAt(i) == 'o' ||
                    cadena.charAt(i) == 'u') {
                contadr++;
            }
        }

        System.out.println("Hay " + contadr + " vocales");
        System.out.println(cadena.replace('o', 'e'));

        for (int i = 1; i <= 100; i++) {
            // Hacemos un casting para que nos devuelva un numero entero
            int raiz = (int) Math.sqrt(i);
            int contador = 0;

            // Hacemos otro bucle para contar los divisibles
            for (int j = raiz; j > 1; j--) {
                if (i % j == 0) {
                    contador++;
                }
            }

            /*
             * Segun el numero de divisibles, sabemos si es primo o no
             * Si es primo el contador sera 0
             */

            if (contador < 1) {
                System.out.println(i);
            }
        }

        while (!salir.equals(salida)) {

            System.out.println("Introduce un numero");
            String num = sc.next();
            salir = num;

            if (!salir.equals(salida)) {

                int contador = 0;
                int num1 = Integer.parseInt(salir);

                // cualquier numero menor de uno no es un numero primo

                if (num1 <= 1) {
                    System.out.println("Elnumero " + num1 + "no es primo");
                } else {

                    int raiz = (int) Math.sqrt(num1);

                    for (int i = raiz; i > 1; i--) {

                        if (num1 % i == 0) {
                            contador++;
                        }

                    }

                }
                System.out.println(">> " + contador);
                if (contador < 1) {
                    System.out.println("El numero " + num1 + " es primo");
                } else {
                    System.out.println("el numero " + num1 + " no es primo");
                }
            } else {
                System.out.println("Saliendo del programa >>");
            }
        }

    }
}
