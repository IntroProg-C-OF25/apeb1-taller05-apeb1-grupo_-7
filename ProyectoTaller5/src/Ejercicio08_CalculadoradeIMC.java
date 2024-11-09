
/**
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;
public class Ejercicio08_CalculadoradeIMC {
    public static void main(String[] args) {
        double pesokg, alturamt, imc;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        pesokg = tcl.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        alturamt = tcl.nextDouble();
        imc = (pesokg) / (alturamt * alturamt);
        System.out.println("Su imc es: " + imc);
        /**
         * IMC menos de 18,5 = bajo peso, 18,5 - 24,9 = peso normal, 25 - 29,9 =
         * sobrepeso, 30 o mas = obeso
         */
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else {
            if ((imc >= 18.5) && (imc <= 24.9)) {
                System.out.println("Peso normal");
            } else {
                if ((imc >= 25) && (imc <= 29.9)) {
                    System.out.println("Sobrepeso");
                } else {
                    if (imc >= 30) {
                        System.out.println("Obeso");
                    }
                }
            }
        }
    }
 
}
/**
 * run:
 * Ingrese su peso en kilogramos: 53,3
 * Ingrese su altura en metros: 1,53
 * Su imc es: 22.769020462215387
 * Peso normal
 */