
/**
 *Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, la cantidad que se requiere
 *y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio11_PedidosOnline {

    public static void main(String[] args) {
        double preciouni, costototal;
        int cantidad;
        String descripcion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la descripcion del articulo: ");
        descripcion = tcl.nextLine();
        System.out.print("Ingerse la cantidad requerida: ");
        cantidad = tcl.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        preciouni = tcl.nextDouble();
        costototal = (preciouni * cantidad);
        if (cantidad > 50) {
            costototal = ((preciouni * cantidad) * 0.85);
        }
        System.out.println("El costo total es: " + costototal);
    }
}
/**
 * run: Ingrese la descripcion del articulo: botellas de agua Ingerse la
 * cantidad requerida: 54 Ingrese el precio unitario: 1,50 El costo total es:
 * 68.85
 */
