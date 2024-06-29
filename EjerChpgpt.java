
import javax.swing.JOptionPane;

public class EjerChpgpt {
    public static void main(String[] args) {
        double calificacion1 = obtenerCalificacion("Ingrese la primera calificación");
        double calificacion2 = obtenerCalificacion("Ingrese la segunda calificación");
        double calificacion3 = obtenerCalificacion("Ingrese la tercera calificación");

        double promedio = calcularPromedio(calificacion1, calificacion2, calificacion3);

        mostrarResultado("El promedio de las calificaciones es: " + promedio);
    }

    public static double obtenerCalificacion(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        double calificacion = Double.parseDouble(texto);
        return calificacion;
    }

    public static double calcularPromedio(double calificacion1, double calificacion2, double calificacion3) {
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        return promedio;
    }

    public static void mostrarResultado(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Promedio de calificaciones", JOptionPane.INFORMATION_MESSAGE);
    }
}
