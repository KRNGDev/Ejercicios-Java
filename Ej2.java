
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Entrada con contraseña

        Scanner sc = new Scanner(System.in);
        String llave = "ensodojo";

        final int INTENTOS = 3;
        boolean acierto = false;

        for (int i = 0; i < INTENTOS && !acierto; i++) {

            System.out.println("Introduce la contraseña");
            String pwrd = sc.next();
            if (pwrd.equals(llave)) {
                System.out.println("Contraseña Correcta ");
                acierto = true;

            }
        }
        if (acierto == false) {

            System.out.println("Numero de intentos Agotados");
        }

        // Aplicacion que nos pida un dia de la semana y nos diga si es laborable o no

        Scanner semanasc = new Scanner(System.in);
        System.out.println("Para saber si es laborable , escriva el dia de la semana");
        String dia = semanasc.nextLine();

        switch (dia) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Es dia Laboral");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("Dia Festivo");
            default:
                System.out.println("Introduce bien un dia de la semana");
        }

    }

}
