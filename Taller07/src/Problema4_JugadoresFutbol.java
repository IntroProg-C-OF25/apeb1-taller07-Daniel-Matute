
/**
 *Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador ,Posición en el campo de juego,Edad,Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 *1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 *2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 *3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 *4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 *5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 *Promedio de edades:  26.8
 *Promedio de estaturas: 1.87
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Problema4_JugadoresFutbol {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String listaJugadores = "Listado de jugadores\n";
        String nombre, posicion, respuesta;
        double estatura, sumaEdad = 0, sumaEstatura = 0, promedioEstatura, promedioEdad;
        int contador = 1, edad;
        boolean otro = true;

        while (otro) {
            System.out.print("Ingrese el nombre: ");
            nombre = tcl.nextLine();
            System.out.print("Ingrese la posicion en el campo de juego: ");
            posicion = tcl.nextLine();
            System.out.print("Ingrese la edad del jugador: ");
            edad = tcl.nextInt();
            System.out.print("Ingrese la altura del jugador en metros: ");
            estatura = tcl.nextDouble();
            tcl.nextLine();

            sumaEdad = sumaEdad + edad;
            sumaEstatura = sumaEstatura + estatura;
            listaJugadores = listaJugadores + (String.format("%d. %s -%s-, edad %d, estatura %.2f\n",
                    contador, nombre, posicion, edad, estatura));

            System.out.print("Desea ingresar mas jugadores?(si|no):");
            respuesta = tcl.nextLine();
            otro = respuesta.equalsIgnoreCase("si");
            if (otro == false) {
                break;
            }
            contador++;
        }
        promedioEdad = (sumaEdad / contador);
        promedioEstatura = (sumaEstatura / contador);
        System.out.print(listaJugadores);
        System.out.printf("Promedio de edades: %.2f\n", promedioEdad);
        System.out.printf("Promedio de estaturas: %.2f\n", promedioEstatura);

    }
}
/***
 * run:
 *Ingrese el nombre: Alexander Dominguez 
 *Ingrese la posicion en el campo de juego: Arquero
 *Ingrese la edad del jugador: 32
 *Ingrese la altura del jugador en metros: 1,95
 *Desea ingresar mas jugadores?(si|no):si
 *Ingrese el nombre: Xavier Arreaga
 *Ingrese la posicion en el campo de juego: Defensa
 *Ingrese la edad del jugador: 24
 *Ingrese la altura del jugador en metros: 1,85
 *Desea ingresar mas jugadores?(si|no):si
 *Ingrese el nombre: Moises Caicedo
 *Ingrese la posicion en el campo de juego: MedioCentro
 *Ingrese la edad del jugador: 19
 *Ingrese la altura del jugador en metros: 1,88
 *Desea ingresar mas jugadores?(si|no):si
 *Ingrese el nombre: Angel Mena
 *Ingrese la posicion en el campo de juego: Delantero
 *Ingrese la edad del jugador: 32
 *Ingrese la altura del jugador en metros: 1,75
 *Desea ingresar mas jugadores?(si|no):si
 *Ingrese el nombre: Michael Estrada
 *Ingrese la posicion en el campo de juego: Delantero
 *Ingrese la edad del jugador: 27
 *Ingrese la altura del jugador en metros: 1,93
 *Desea ingresar mas jugadores?(si|no):no
 *Listado de jugadores
 *1. Alexander Dominguez  -Arquero-, edad 32, estatura 1,95
 *2. Xavier Arreaga -Defensa-, edad 24, estatura 1,85
 *3. Moises Caicedo -MedioCentro-, edad 19, estatura 1,88
 *4. Angel Mena -Delantero-, edad 32, estatura 1,75
 *5. Michael Estrada -Delantero-, edad 27, estatura 1,93
 *Promedio de edades: 26,80
 *Promedio de estaturas: 1,87
 *BUILD SUCCESSFUL (total time: 2 minutes 7 seconds)
 */
