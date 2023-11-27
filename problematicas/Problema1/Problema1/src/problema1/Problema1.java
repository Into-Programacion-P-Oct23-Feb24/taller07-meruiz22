/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String cadenaReporteedad = "";
        String nombreJugador;
        String apellido;
        String posicionCampo;

        int edad;
        double estatura;
        boolean bandera = true;
        String salir;

        int sumaEdades = 0;
        double sumaEstatura = 0;

        int contadorIteraciones = 0;

        double promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");
        cadenaReporteedad = String.format("%s%s\n", cadenaReporteedad,
                "Listado de Edades");

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese el apellido del Jugador: ");
            apellido = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();

            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;

            contadorIteraciones = contadorIteraciones + 1;

            cadenaReporte = String.format("%s"
                    + "%d. "
                    + "%s "
                    + "%s"
                    + "-%s-, "
                    + "edad %d,"
                    + "estatura %.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    apellido,
                    posicionCampo,
                    edad,
                    estatura);
            cadenaReporteedad = String.format("%s %s\n",
                    cadenaReporteedad,
                    edad);
            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
        }while (bandera);
        promedioEdad = (double) sumaEdades / contadorIteraciones;
        promedioEstatura = sumaEstatura / contadorIteraciones;

        cadenaReporte = String.format("%s%s",
                cadenaReporte,
                cadenaReporteedad);
        cadenaReporte = String.format("%s"
                + "Promedio de edades: %.2f\n"
                + "Promedio Estatura: %.2f\n",
                cadenaReporte,
                promedioEdad,
                promedioEstatura);

        System.out.printf("%s\n", cadenaReporte);
    }

}
