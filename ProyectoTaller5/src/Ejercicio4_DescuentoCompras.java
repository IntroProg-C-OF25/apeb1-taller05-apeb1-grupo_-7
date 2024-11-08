
/**
 *Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; 
 * de lo contrario, no hay descuento.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio4_DescuentoCompras {

    public static void main(String[] args) {
        double precio, totalPagar;
        Scanner an = new Scanner(System.in);
        System.out.print("Escribir el precio del producto: ");
        precio = an.nextDouble();
        if (precio >= 100) {
            totalPagar = precio - (precio * 0.1);
            System.out.println("Precio total a pagar con descuento: = " + totalPagar);
        } else {
            System.out.println("Precio total a pagar: " + precio);
        }
    }
}
/*run:
Escribir el precio del producto: 1000
Precio total a pagar con descuento: = 900.0
*/