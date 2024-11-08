
/**
 *En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días
 * Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación 
 * y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio13_SistemaReservaHoteleros {

    public static void main(String[] args) {
        double dia, precio, pago, pago1, pago2, pago3;
        Scanner an = new Scanner(System.in);
        System.out.print("Dame el numero de dias que llevas hospedado: ");
        dia = an.nextDouble();
        System.out.print("Precio de la habitacion: ");
        precio = an.nextDouble();

        if (dia <= 4) {
            pago = (precio);
            System.out.print("Precio total a pagar por hospedaje de menos de 5 dias: " + pago);

        } else {
            if (dia <= 5) {
                pago1 = precio - (precio * 0.1);

                System.out.print("Precio total a pagar por hospedaje de 10 dias:  = " + pago1);
            } else {

                if (dia <= 10) {
                    pago2 = precio - (precio * 0.15);

                    System.out.print("Precio total a pagar por hospedaje de 15 o mas dias: = " + pago2);
                } else {
                    if (dia >= 15) {
                        pago3 = precio - (precio * 0.2);

                        System.out.print("Precio total a pagar por hospedaje de 20 dias o mas: = " + pago3);
                    } else {

                    }
                }
            }
        }
    }
}
/*run:
Dame el numero de dias que llevas hospedado: 29
Precio de la habitacion: 1000
Precio total a pagar por hospedaje de 20 dias o mas: = 800.0
*/