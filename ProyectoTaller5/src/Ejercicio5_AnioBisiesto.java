
/**
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio5_AnioBisiesto {

    public static void main(String[] args) {
        int anio;
        Scanner an = new Scanner(System.in);

        System.out.print("Ingrese un anio: ");
        anio = an.nextInt();

        if (anio % 4 == 0) {
            System.out.print("El anio es bisiessto ");
        } else {
            System.out.print("El anio no es bisiesto ");
        }
    }
}
/*run:
Ingrese un anio: 1666
El anio no es bisiesto
*/