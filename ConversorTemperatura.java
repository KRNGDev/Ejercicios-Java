import javax.swing.JOptionPane;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = obtencionDeDatos("Registra la temperatura en ºC");
        double temperaturaFahrenheit = conversionAFahrenheit(temperaturaCelsius);
        mostrarResultado("La temperatura en Fahrenhait es de: " + temperaturaFahrenheit);
    }

    // Muestra una ventana donde se pide y se guarda un dato
    public static double obtencionDeDatos(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        double celsius = Double.parseDouble(texto);
        return celsius;
    }

    // Convierte el dato de grados celsius ha Fahrenheit
    public static double conversionAFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    // Muestra una ventana con un mensaje y el resultado
    public static void mostrarResultado(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Temperatura Fahrenheit", JOptionPane.INFORMATION_MESSAGE);
    }

}
