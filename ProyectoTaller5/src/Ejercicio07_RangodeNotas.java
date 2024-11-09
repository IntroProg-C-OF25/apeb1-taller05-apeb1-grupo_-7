
/**
 *Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio07_RangodeNotas {

    public static void main(String[] args) {
        double nota;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su nota: ");
        nota = tcl.nextDouble();
        if (nota >= 90) {
            System.out.println("Su calificacion es A");
        } else {
            if ((nota >= 80) && (nota <= 89)) {
                System.out.println("Su nota es B");
            } else {
                if ((nota >= 70) && (nota <= 79)) {
                    System.out.println("Su nota es C");
                } else {
                    System.out.println("Su nota es D");
                }
            }
        }
    }
}

/**
 * run: Ingrese su nota: 82 Su nota es B
 */
