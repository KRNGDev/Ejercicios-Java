package ejercicio01;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        final double PORCENTAJEIVA = 0.21;
        String textoNumero = JOptionPane.showInputDialog("Introduce el precio del producto");
        double precioSinIVA = Double.parseDouble(textoNumero);

        double IVA = precioSinIVA * PORCENTAJEIVA;
        double totalConIVA = precioSinIVA + IVA;

        JOptionPane.showMessageDialog(null, "El Precio Con IVA del producto es : " + totalConIVA, "Resultado con IVA",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
