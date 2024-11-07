
/** *
 * Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 *
 * @autor Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio1_EdadVotar {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = an.nextInt();
        if (edad >= 18) {
            System.out.println("Si puede votar");
        } else {

            System.out.println("No puedes votar");

        }

    }

}
/*run:
Ingrese su edad: 5
No puedes votar
*/