
/**
 *Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre1	10	$2.5	$25
 * Nombre2	11	$2	$22
 * Nombre3	9	$3	$27
 * Nombre4	5	$4	$20
 * Nombre5	12	$2	$24
 * @author Daniel Matute
 */
import java.util.Scanner;
public class Problema3_Empleados {
     public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double salario, costo_dia;
        int dias, contador=1, limit;
        String nombre;
        System.out.print("Ingrese el limite de empleados: ");
        limit = tcl.nextInt();
        while (contador <= limit){
            System.out.print("Ingrese el Nombre: ");
            nombre = tcl.next();
            System.out.print("Ingrese el numero de dias: ");
            dias = tcl.nextInt();
            System.out.print("Ingrese el costo por dia: ");
            costo_dia = tcl.nextDouble();
            salario = dias * costo_dia;
            System.out.printf("|\t%s\t | %s | %s | %s | \n", "NOMBRE", "DIAS", "COSTO DIA", "SALARIO");
            System.out.printf("|\t%s\t |  %2d  |   %.2f    |  %.2f  | \n", nombre, dias, costo_dia, salario);
            contador++;
        }
    }
}       
/***
 * run:
 * Ingrese el limite de empleados: 5
 * Ingrese el Nombre: Daniel
 * Ingrese el numero de dias: 10
 * Ingrese el costo por dia: 2,5
 * |	NOMBRE	 | DIAS | COSTO DIA | SALARIO | 
 * |	Daniel	 |  10  |   2,50    |  25,00  | 
 * Ingrese el Nombre: Pedro
 * Ingrese el numero de dias: 11
 * Ingrese el costo por dia: 2
 * |	NOMBRE	 | DIAS | COSTO DIA | SALARIO | 
 * |	Pedro	 |  11  |   2,00    |  22,00  | 
 * Ingrese el Nombre: Chente
 * Ingrese el numero de dias: 9
 * Ingrese el costo por dia: 3
 * |	NOMBRE	 | DIAS | COSTO DIA | SALARIO | 
 * |	Chente	 |   9  |   3,00    |  27,00  | 
 * Ingrese el Nombre: Emilio
 * Ingrese el numero de dias: 5
 * Ingrese el costo por dia: 4
 * |	NOMBRE	 | DIAS | COSTO DIA | SALARIO | 
 * |	Emilio	 |   5  |   4,00    |  20,00  | 
 * Ingrese el Nombre: Jhordy
 * Ingrese el numero de dias: 12
 * Ingrese el costo por dia: 2
 * |	NOMBRE	 | DIAS | COSTO DIA | SALARIO | 
 * |	Jhordy	 |  12  |   2,00    |  24,00  | 
 * BUILD SUCCESSFUL (total time: 54 seconds)
 */
