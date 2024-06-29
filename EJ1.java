import java.util.Locale;
import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {

        // Pruebas de Operaciones matematicas

        double n = 12;
        double n2 = 12;

        System.out.println("La suma es " + (n + n2));
        System.out.println("La Resta es " + (n - n2));
        System.out.println("La Multiplicacion es " + (n * n2));
        System.out.println("La División es " + (n / n2));

        if (n <= n2) {
            if (n == n2) {

                System.out.println("son iguales ");
            } else {
                System.out.println("Es menos que  " + n2);
            }

        } else {
            System.out.println("Es mayor que " + n2);
        }

        // Introduccion de Nombre

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del pringado");
        String nombre = sc.nextLine();
        if (nombre == null) {
            System.out.println("Introduce un nombre de verdad");
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce  el Radio de un circulo");
        sc2.useLocale(Locale.US);
        float radio = sc2.nextFloat();

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del Circulo con Radio " + radio + ", tiene un area de " + area);

        // hacemos que identifique si un numero es divisible por 2

        Scanner numScanner = new Scanner(System.in);
        System.out.println("Introduce unnumero divisible entre 2");
        int num = numScanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("el Numero " + num + " es divisible entre 2");
        } else {
            System.out.println("El Numero " + num + " no es divisible entre 2");
        }

        // Calculamos un numero para la tablra ASCII

        Scanner asciiScanner = new Scanner(System.in);
        System.out.println("Introduce un numero para codificar en la tabla ASCII");
        int ascii = asciiScanner.nextInt();

        char caracter = (char) ascii;
        System.out.println("La letra del codigo corespondiente al numero " + ascii + " es " + caracter);

        // Pedimos el precio de un producto y le aplicamos el IVA del 21%
        // Declaramos constante

        final double IVA = 0.21;
        double precio;

        Scanner precioScanner = new Scanner(System.in);
        System.out.println("Dime el precio Bruto de tus Zapatos");
        precio = precioScanner.nextDouble();
        System.out.println("El precio con IVA es " + (precio * (1 + IVA)));

        // Usamos Bucle While para mostrar Numeros

        int bucle = 1;

        System.out.println("Bucle While");
        while (bucle <= 10) {

            System.out.println(bucle);
            bucle++;
        }

        // Definimos el Bucle For

        System.out.println("Bucle For");
        for (int r = 1; r <= 10; r++) {

            System.out.println(r);
        }
        // Mostramos En el Bucle Solo los numeros divisibles entre 2

        System.out.println("Bucle For para divisibles entre 2 y 3");
        for (int r = 1; r <= 10; r++) {
            if (r % 2 == 0) {

                System.out.println(r);
            } else if (r % 3 == 0) {
                System.out.println(r);
            }
        }

        /*
         * Definimos una aplicacion donde le damos el numero de vetas hechas y nos pide
         * las ventas
         * tantas veces como hemos indicado Haciendo un total de ventas al final
         */

        // Pregucntamos cuantas ventas son

        Scanner ventScanner = new Scanner(System.in);
        System.out.println("Cantidad de ventas hechas");
        double ventas = ventScanner.nextDouble();

        // Declaramos variables

        int numventa = 1;
        double sumaVentas = 0;

        // Declaramos el bucle
        for (int i = 1; i <= ventas; i++) {

            Scanner preciosScanner = new Scanner(System.in);
            System.out.println("Introduce el precio de venta " + numventa);
            numventa++;
            double precioventa = precioScanner.nextDouble();

            sumaVentas = sumaVentas + precioventa;

        }
        System.out.println("El total de las ventas es " + sumaVentas);

        // Calcular una Ecuacion de segundo grado

        // Declaramos las variables que vamos a pedir
        Scanner varAScanner = new Scanner(System.in);
        System.out.println("introduce el numero para la A");
        int varA = varAScanner.nextInt();

        Scanner varBScanner = new Scanner(System.in);
        System.out.println("introduce el numero para la B");
        int varB = varBScanner.nextInt();

        Scanner varCScanner = new Scanner(System.in);
        System.out.println("introduce el numero para la C");
        int varC = varCScanner.nextInt();

        // Creamos la ecuación

        double discriminate = Math.pow(varB, 2) - (4 * varA * varC);
        // Mensaje de traza
        System.out.println(">>" + discriminate);
        if (discriminate > 0) {
            double x1 = ((varB * (-1) + Math.sqrt(discriminate)) / (2 * varA));
            double x2 = ((varB * (-1) - Math.sqrt(discriminate)) / (2 * varA));
            System.out.println("El valor de x1 es " + x1 + "y el valor de x2 es " + x2);

        } else {
            System.out.println("El discriminante es negativo");
        }

        System.out.println("La ecuacion X=" + varA + "+" + varB + "+" + varC);
        System.out.println("Siendo X=" + (varA + varB + varC));

        System.out.println("Todo esto lo calculo " + nombre);
    }

}