/**Mostrar el nombre del día de la semana en función del número ingresado (1 para lunes, 2 para martes, etc.).
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;
public class Ejercicio2_DiaSemana {
    
    public static void main(String[] args) {
        //ESTRUCTURA DE CONTROL DE SELECCION MULTIPLE 
        //EN CASO DE = switch
        int numeroDia;
        Scanner pe = new Scanner(System.in);
        System.out.print("Deme el Nuero del dia: ");
        numeroDia = pe.nextInt();
        //ESTRUCTURA DE CONTROL DE SELLECION MULTIPLE 
        // EN CASO DE = switch
        switch (numeroDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
            default:
                System.out.println("Error te comiste el ajo pensando que era la papa");
                break;

        }

    }
}
/*run:
Deme el Nuero del dia: 5
Viernes
*/
