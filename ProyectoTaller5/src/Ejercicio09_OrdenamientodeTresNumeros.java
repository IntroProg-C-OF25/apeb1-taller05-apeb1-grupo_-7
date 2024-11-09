
/**
 *Dados tres números, ordenarlos en orden ascendente.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio09_OrdenamientodeTresNumeros {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        n1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = tcl.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        n3 = tcl.nextInt();

        if ((n1 < n2) && (n1 < n3)) {
            System.out.println("Primer numero: " + n1);

        } else if (n2 < n3) {
            System.out.println("Primer numero: " + n2);
        } else {
            System.out.println("Primer numero: " + n3);
        }

        {
            if (((n1 > n2) && (n1 < n3)) || ((n1 > n3) && (n1 < n2))) {
                System.out.println("Segundo numero: " + n1);

            } else if (((n2 > n3) && (n2 < n1)) || ((n2 > n1) && (n2 < n3))) {
                System.out.println("Segundo numero: " + n2);

            } else if (((n2 > n3) && (n3 > n1)) || ((n1 > n3) && (n3 > n2))) {
                System.out.println("Segundo numero: " + n3);

            }
            if ((n1 > n2) && (n1 > n3)) {
                System.out.println("Tercer numero: " + n1);

            } else if (n2 > n3) {
                System.out.println("Tercer numero: " + n2);
            } else {
                System.out.println("Tercer numero: " + n3);
            }
        }
    }
}
/**
 * run:
 * Ingrese el primer numero: 2
 * Ingrese el segundo numero: 3
 * Ingrese el tercer numero: 1
 * Primer numero: 1
 * Segundo numero: 2
 * Tercer numero: 3
 */
