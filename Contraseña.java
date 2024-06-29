import javax.swing.JOptionPane;

public class Contraseña {
    public static void main(String[] args) {

        final int INTENTOS = 3;
        boolean aciertos = false;
        String contraseña = "";
        String clave1 = obtencionDeDatos("Escribe la contraeña");
        String clave2 = obtencionDeDatos("Confirma la contraseña");

        // Guardamos una contraseña

        if (clave1.equals(clave2)) {
            contraseña = clave1;
            mostrarMensaje("Contraseña Guardada correctamente");
        } else {
            mostrarMensaje("Las contraseñas no coinciden");
        }
        // Pedimos la contrseña guardada para acceder

        for (int i = 0; i < INTENTOS && !aciertos; i++) {
            String Pass = obtencionDeDatos("Introduzca la Contraseña correcta");
            if (Pass.equals(contraseña)) {
                mostrarMensaje("Contraseña correcta");
            } else {
                mostrarMensaje("Contraseña incorrecta te quedan " + (INTENTOS - i - 1) + " intentos");
            }
        }
    }

    public static String obtencionDeDatos(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        return texto;
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
}
