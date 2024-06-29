import javax.swing.JOptionPane;

public class numerosAleatorios {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Elije Cantidad de numeros aleatorios",
                "Numero aleatorio",
                0);
        int limite = Integer.parseInt(texto);
        texto = JOptionPane.showInputDialog(null, "Elije un numero");
        int numero1 = Integer.parseInt(texto);
        texto = JOptionPane.showInputDialog(null, "Elije otro numero");
        int numero2 = Integer.parseInt(texto);
        for (int i = 0; i < limite; i++) {
            System.out.println(aleatorio(numero1, numero2));
        }
    }

    public static int aleatorio(int num, int num2) {
        return ((int) Math.floor(Math.random() * (num2 - num) + num));

    }
}
