import java.util.*;

public class Main {

    public static void main(String[] args) {

        numeroPrimo();

        /*
         * String texto =
         * "Este es un ejemplo de texto que debe ser justificado aojsdlfikhaoi sd alskdjhfoi laksndfñkl alkjahskd asliaoifñglkans  asdioljhfgñoladñlkfaois fsdka fjh alkjñsñlkfa añhdññs asjf ñasjfoai las a olsejf añ asldkfjhashln fjsijfkwnfña slkfno w`´."
         * ;
         * String justificado = justificarTexto(texto, 23);
         * System.out.println(justificado);
         */
    }

    public static void numeroPrimo() {

        for (int i = 1; i < 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }

        }

    }

    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void fibonacci() {
        int contador = 0;
        long numeroAnterior = 0;
        long numeroSegundo = 1;
        while (contador <= 50) {

            long resultado = numeroAnterior + numeroSegundo;
            System.out.println(numeroAnterior);
            numeroAnterior = numeroSegundo;
            numeroSegundo = resultado;
            contador++;

        }
    }

    public static Boolean anagrama(String palabra1, String palabra2) {

        if (palabra1.toLowerCase() == palabra2.toLowerCase()) {
            return false;
        }

        char[] anagrama1 = palabra1.toLowerCase().toCharArray();
        char[] anagrama2 = palabra2.toLowerCase().toCharArray();

        Arrays.sort(anagrama1);
        Arrays.sort(anagrama2);

        return Arrays.equals(anagrama1, anagrama2);
    }

    public static void fizzBuzz() {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static String justificarTexto(String texto, int longitud) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        StringBuilder linea = new StringBuilder();

        for (String palabra : palabras) {
            if (linea.length() + palabra.length() + 1 > longitud) {
                resultado.append(justificarLinea(linea.toString().trim(), longitud)).append("\n");
                linea = new StringBuilder();
            }
            linea.append(palabra).append(" ");
        }

        // Añadir la última línea
        if (linea.length() > 0) {
            resultado.append(justificarLinea(linea.toString().trim(), longitud));
        }

        return resultado.toString();
    }

    private static String justificarLinea(String linea, int longitud) {
        String[] palabras = linea.split(" ");
        int espaciosTotales = longitud - linea.length() + palabras.length - 1;

        if (palabras.length == 1) {
            return rellenarDerecha(linea, longitud); // Si solo hay una palabra, rellenar con espacios a la derecha
        }

        int espaciosEntrePalabras = espaciosTotales / (palabras.length - 1);
        int espaciosExtra = espaciosTotales % (palabras.length - 1);

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            resultado.append(palabras[i]);
            if (i < palabras.length - 1) {
                int espaciosAAgregar = espaciosEntrePalabras + (i < espaciosExtra ? 1 : 0);
                resultado.append(" ".repeat(espaciosAAgregar));
            }
        }

        return resultado.toString();
    }

    private static String rellenarDerecha(String linea, int longitud) {
        StringBuilder resultado = new StringBuilder(linea);
        while (resultado.length() < longitud) {
            resultado.append(" ");
        }
        return resultado.toString();
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int segundoNum = target - nums[i];
            if (map.containsKey(segundoNum)) {
                return new int[] { map.get(segundoNum), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No hay solución");

    }

    private static Integer sumaLista(int[] lista) {
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }

        return suma;
    }

    private static Integer masGrande(List<Integer> lista) {
        List<Integer> listaOrdenada = new ArrayList<>(lista);
        Collections.sort(listaOrdenada);

        return listaOrdenada.get(listaOrdenada.size() - 1);
    }

    private static List<Integer> numeros(List<Integer> lista) {
        ArrayList<Integer> newList;

        Set<Integer> setSinDuplicados = new HashSet<>(lista);

        List<Integer> listaSinDuplicados = new ArrayList<>(setSinDuplicados);

        Collections.sort(listaSinDuplicados);
        return listaSinDuplicados;

    }

    private static void cadenaAlReves(String texto) {
        StringBuilder cadena = new StringBuilder(texto).reverse();
        System.out.println(cadena);
        /*
         * 
         * String nuevoTexto="";
         * for(int i=lista.length;i>0;i--){
         * nuevoTexto+=lista.charAt(i)
         * }
         * System.out.println(nuevotexto);
         */
    }

    private static void reservaAsientos() {
        char asientos[][] = new char[10][10];
        int fila, asiento;
        boolean reserva = false;
        String respuesta = "";
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos.length; c++) {
                asientos[f][c] = 'L';

            }

        }
        dibujarMap(asientos);

        System.out.println("---------Reserve su asiento----------");

        while (reserva != true) {
            System.out.println("Elija fila del 1 al 10 y asiento dle 1 al 10");
            System.out.println("Fila : ");
            fila = teclado.nextInt() - 1;
            System.out.println("asiento :");
            asiento = teclado.nextInt() - 1;
            if (fila <= 9 && asiento <= 9) {
                if (fila >= 0 && asiento >= 0) {

                    if (asientos[fila][asiento] == 'L') {
                        asientos[fila][asiento] = 'X';
                        System.out.println("El asiento se ha reservado Correctamente.");
                        dibujarMap(asientos);
                        System.out.println("¿Queire reservar otro asiento?");
                        System.out.println("S/N : ");

                        reserva = isReserva(respuesta, teclado, reserva);
                    } else {
                        System.out.println("El asiento y esta reservado, quieres buscar otro?  S/N");

                        reserva = isReserva(respuesta, teclado, reserva);

                    }

                } else {
                    System.out.println("Introduce un numero correcto de fila y asiento en tre 1 y 10 cada uno.");
                }
            } else {
                System.out.println("Introduce un numero correcto de fila y asiento en tre 1 y 10 cada uno.");
            }

        }
        System.out.println("Gracias por la reserva.");
    }

    private static boolean isReserva(String respuesta, Scanner teclado, boolean reserva) {
        respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("N")) {

            reserva = true;
        } else if (!respuesta.equalsIgnoreCase("S")) {
            System.out.println("Introduce 'S' o 'N' ");
            isReserva(respuesta, teclado, reserva);
        }
        return reserva;
    }

    private static void dibujarMap(char[][] asientos) {
        for (int f = 0; f < asientos.length; f++) {
            System.out.print(f + 1 + " ");
            for (int c = 0; c < asientos.length; c++) {

                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println();
        }
    }
}