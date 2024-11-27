
/**
 *Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento
 * por tipo de cliente: Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento
 * del 20% En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas:
 * por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Problema6_Empresa {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int cont = 0, limite = 7, tipoCliente;
        double costoCompu, descuento = 0, valorTotal;
        while (cont < limite) {
            System.out.println("Venta #" + (cont + 1));
            System.out.print("INGRESA EL NOMBRE DEL CLIENTE: ");
            nombre = tcl.nextLine();
            System.out.print("INGRESA EL COSTO DE LA COMPUTADORA: ");
            costoCompu = tcl.nextDouble();
            System.out.print("INGRESA EL TIPO DE CLIENTE (1 o 2): ");
            tipoCliente = tcl.nextInt();
            tcl.nextLine();
            if (tipoCliente == 1) {
                descuento = costoCompu * 0.10;
            }
            if (tipoCliente == 2) {
                descuento = costoCompu * 0.20;
            }

            valorTotal = costoCompu - descuento;

            System.out.println("Cliente: " + nombre + ", compra computadora con precio original $" + costoCompu + " y paga $" + valorTotal);
            System.out.println();

            cont++;
        }

    }
}
/***
 * run:
* Venta #1
* INGRESA EL NOMBRE DEL CLIENTE: Daniel
* INGRESA EL COSTO DE LA COMPUTADORA: 100
* INGRESA EL TIPO DE CLIENTE (1 o 2): 1
* Cliente: Daniel, compra computadora con precio original $100.0 y paga $90.0

* Venta #2
* INGRESA EL NOMBRE DEL CLIENTE: Pedro
* INGRESA EL COSTO DE LA COMPUTADORA: 200
* INGRESA EL TIPO DE CLIENTE (1 o 2): 2
* Cliente: Pedro, compra computadora con precio original $200.0 y paga $160.0

* Venta #3
* INGRESA EL NOMBRE DEL CLIENTE: Chente
* INGRESA EL COSTO DE LA COMPUTADORA: 300
* INGRESA EL TIPO DE CLIENTE (1 o 2): 1
* Cliente: Chente, compra computadora con precio original $300.0 y paga $270.0

* Venta #4
* INGRESA EL NOMBRE DEL CLIENTE: Emilio
* INGRESA EL COSTO DE LA COMPUTADORA: 100
* INGRESA EL TIPO DE CLIENTE (1 o 2): 3
* Cliente: Emilio, compra computadora con precio original $100.0 y paga $70.0

* Venta #5
* INGRESA EL NOMBRE DEL CLIENTE: Jhordy
* INGRESA EL COSTO DE LA COMPUTADORA: 1000
* INGRESA EL TIPO DE CLIENTE (1 o 2): 2
* Cliente: Jhordy, compra computadora con precio original $1000.0 y paga $800.0

* Venta #6
* INGRESA EL NOMBRE DEL CLIENTE: Juan
* INGRESA EL COSTO DE LA COMPUTADORA: 250
* INGRESA EL TIPO DE CLIENTE (1 o 2): 2
* Cliente: Juan, compra computadora con precio original $250.0 y paga $200.0

* Venta #7
* INGRESA EL NOMBRE DEL CLIENTE: Toledo
* INGRESA EL COSTO DE LA COMPUTADORA: 1000
* INGRESA EL TIPO DE CLIENTE (1 o 2): 3
* Cliente: Toledo, compra computadora con precio original $1000.0 y paga $950.0
* BUILD SUCCESSFUL (total time: 2 minutes 20 seconds)
 */
