/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

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
        int limite = 15;
        int numerador = 1;
        int denominador = 3;
        String signo;
        String cadena = "1 ";

        while (denominador <= limite) {
            // para manejar el signo asociado 
            if (denominador % 3 == 0) {
                signo = "-";
            } else {
                signo = "+";
            }
            
            cadena = String.format("%s%s%d/%d ", 
                    cadena,
                    signo,
                    numerador, 
                    denominador);
            denominador = denominador + 2;  
        } 

        System.out.println(cadena);
    }
    
}
