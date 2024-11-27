
/**
 *Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10 ,10/12 ,15/14 ,20/16 ,25/18 ,30/20
 * @author Daniel Matute
 */

import java.util.Scanner;

public class Problema2_Serie2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 5, limite, denominador = 10;
        System.out.print("Dame el limite: ");
        limite = tcl.nextInt();
        while (contador <= limite) {
            System.out.print(contador + "/" + denominador + ", ");
            contador=contador +5;
            denominador = denominador + 2;
        }
        System.out.println("");
    }
}
/***
 * run:
 * Dame el limite: 30
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 
 * BUILD SUCCESSFUL (total time: 17 seconds)
 */