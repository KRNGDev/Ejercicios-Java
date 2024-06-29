import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjBucle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = JOptionPane.showInputDialog(null,
                "Por favor, introduce una frase",
                "Introducción",
                JOptionPane.INFORMATION_MESSAGE);

        String cadenaResultante = "";

        // true = Lo pasamos todo a mayusculas
        // false= Lo pasamos todo a minusculas
        boolean isMayus;

        String[] opciones = { "Mayusculas", "Minusculas", "Tu Puta madre" };
        int eleccion = JOptionPane.showOptionDialog(null,
                "Elige tu opcion",
                "Eleccion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        isMayus = (eleccion == JOptionPane.YES_OPTION);

        if (isMayus) {
            cadenaResultante = texto.toUpperCase();
        } else {
            cadenaResultante = texto.toLowerCase();
        }

        // Mostramos el mensaje resultante
        JOptionPane.showMessageDialog(null,
                cadenaResultante,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);

        // Sumar en unatributo frases y luego mostrarlo
        /*
         * String frase;
         * String sumFrases = "";
         * 
         * do {
         * frase = JOptionPane.showInputDialog(null,
         * "Introduce una frase",
         * "Escribe", JOptionPane.INFORMATION_MESSAGE);
         * sumFrases += " " + frase;
         * 
         * } while (!frase.isEmpty());
         * JOptionPane.showMessageDialog(null,
         * "Has escrito: " + sumFrases, "Resultado", 0);
         */

        // Colocamos una frase y la mostramos sin espacios

        /*
         * String texto = JOptionPane.showInputDialog(null,
         * "Inserta una frase",
         * "Inserción",
         * JOptionPane.INFORMATION_MESSAGE);
         * 
         * String fraseSinEspacios = "";
         * char caracterActual;
         * 
         * for (int i = 0; i < texto.length(); i++) {
         * 
         * caracterActual = texto.charAt(i);
         * 
         * if (caracterActual != ' ') {
         * fraseSinEspacios += String.valueOf(caracterActual);
         * 
         * }
         * }
         * JOptionPane.showMessageDialog(null,
         * "La frase sin espacios es " + fraseSinEspacios,
         * "Resultado",
         * JOptionPane.INFORMATION_MESSAGE);
         */
        /*
         * System.out.println("indique un numero");
         * int num = sc.nextInt();
         * while (num < 1) {
         * if (num < 1) {
         * System.out.println("Indique un numero mayor a 1");
         * num = sc.nextInt();
         * 
         * }
         * }
         * int suma = 0;
         * 
         * for (int contador = 1; contador < num; contador++) {
         * suma += contador;
         * 
         * }
         * System.out.println("la suma es " + suma);
         */
        // Cuento las veces que se escribe un numero hasta que se cumple la condicion
        /*
         * System.out.println("Escribe un numero que no sea -1");
         * int num = sc.nextInt();
         * int contador;
         * for (contador = 0; num != -1; contador++) {
         * 
         * System.out.println("Dame mas numeros");
         * num = sc.nextInt();
         * 
         * }
         * System.out.println("Has perdido el tiempo poniendo numeros " + contador +
         * " veces");
         */

    }
}
