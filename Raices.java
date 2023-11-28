import java.util.InputMismatchException;
import java.util.Scanner;
public class Raices {
public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            try {
        System.out.println("ingrese el coeficiente a: ");
        double a = lector.nextDouble();
        System.out.println("ingrese el coeficiente b: ");
        double b = lector.nextDouble();
        System.out.println("ingrese el coeficiente c: ");
        double c = lector.nextDouble();

        Raices2 ecuacion = new Raices2(a, b, c);
        ecuacion.calcular();

        lector.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                lector.nextLine();
                intentos--;
                if (intentos > 0) {
                    System.out.println("Intentos restantes: " + intentos);
                } else {
                    System.out.println("Se agotaron los intentos. Programa terminado.");
                }
            }
        }
    }
}