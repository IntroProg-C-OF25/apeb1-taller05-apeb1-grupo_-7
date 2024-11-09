
/**
 *Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio06_CategoriadeEdad {

    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad >= 18) {
            System.out.println("Eres un adulto");
        } else {
            if ((edad >= 0) && (edad < 12)) {
                System.out.println("Eres un niño");
            } else {
                System.out.println("Eres un adolescente");
            }
        }
    }
}

/**
* run:
* Ingrese su edad: 12
* Eres un adolescente
 */
