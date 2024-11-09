
/**
 *Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar
 *y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%,
 *si es de Italia, 15%, y si es de USA, 8%
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio12_CalculodeImpuestos {

    public static void main(String[] args) {
        String marca, origen;
        double impuesto, costo, preciodeventa;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la marca del automovil: ");
        marca = tcl.nextLine();
        System.out.print("Ingerse el origen del automovil (puede ser Alemania, Japon, Italia, USA): ");
        origen = tcl.nextLine();
        System.out.print("Ingrese el precio de venta del automovil: ");
        costo = tcl.nextDouble();
        impuesto = 0;
        if (origen.equals("Alemania")) {
            impuesto = (costo * 0.20);
        } else if (origen.equals("Japon")) {
            impuesto = (costo * 0.30);
        } else if (origen.equals("Italia")) {
            impuesto = (costo * 0.15);

        } else if (origen.equals("USA")) {
            impuesto = (costo * 0.08);

        }
        preciodeventa = impuesto + costo;
        System.out.println("El precio de venta con el impuesto es: " + preciodeventa);
    }
}

/**
 * run-single: Ingrese la marca del automovil: Toyota Ingerse el origen del
 * automovil (puede ser Alemania, Japon, Italia, USA): Alemania Ingrese el
 * precio de venta del automovil: 12000 El precio de venta con el impuesto es:
 * 14400.0
 */
