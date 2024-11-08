
/** Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio3_MayorTresNumeros {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("Escribir el primer numero: ");
        num1 = an.nextInt();
        System.out.print("Escribir el segundo numero: ");
        num2 = an.nextInt();
        System.out.print("Escribir el tercer numero: ");
        num3 = an.nextInt();
        if (num1 == num2 && num1 == num3) {
            System.out.println("Todos los numeros son iguales ");
        } else {

            if (num1 >= num2 && num1 > num3) {
                System.out.println(num1 + " es el mayor");
            } else {

            }
            if (num3 >= num1 && num3 > num2) {
                System.out.println(num3 + " es el mayor");
            } else {

            }
            if (num2 >= num3 && num2 > num1) {
                System.out.println(num2 + " es el mayor");
            } else {

            }

            if (num1 == num2) {
                System.out.println("El numero 1 y el numero 2 son iguales");
            } else {

            }
            if (num2 == num3) {
                System.out.println("El numero 2 y el numero 3 son iguales");
            } else {

            }
            if (num1 == num3) {
                System.out.println("El numero 1 y el numero 3 son iguales");

            }
        }
    }
}

