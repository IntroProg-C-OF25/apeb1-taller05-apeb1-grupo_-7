
/**
 * Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
 * Si el usuario tiene edad mayor a 65 años, 
 * se debe descontar el 10% por pertenecer a la tercera edad.
 * @author Ricardo Rosales 
 */
import java.util.Scanner;
public class Ejercicio10_FacturacionElectrica {
    public static void main(String[] args) {
        double valorCostoPorKilovatioHora, numeroDeKilovatios, total, totalDescuento;
        Scanner pe = new Scanner(System.in);
        System.out.print("Cuanto kilovatios consumio por hora: ");
        numeroDeKilovatios = pe.nextDouble();
        System.out.print("Valor de kilovatio/hora: ");
        valorCostoPorKilovatioHora = pe.nextDouble();

        int edad;
        System.out.print("Ingrese edad: ");
        edad = pe.nextInt();
        if (edad >= 65) {
            total = (numeroDeKilovatios * valorCostoPorKilovatioHora);
            totalDescuento = total - (total * 0.1);
            System.out.println("Valor total a cancelar = " + totalDescuento);
        } else {
            total = (numeroDeKilovatios * valorCostoPorKilovatioHora);
            System.out.println("valor total a cancelar  = " + total);
        }
    }

}
/*run:
Cuanto kilovatios consumio por hora: 500
Valor de kilovatio/hora: 4
Ingrese edad: 6
valor total a cancelar  = 2000.0
*/
