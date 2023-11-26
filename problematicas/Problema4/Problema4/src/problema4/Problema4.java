/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = 15;
        int denominador = 3;
        int sig =1;
        String signo;
        String cadena = "1 ";

        while (denominador <= limite) {
            if (sig % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            sig = sig +1;
            cadena = String.format("%s %s 1/%d ",
                    cadena,
                    signo,
                    denominador);
            denominador = denominador + 2;
        }

        System.out.println(cadena);
    }

}