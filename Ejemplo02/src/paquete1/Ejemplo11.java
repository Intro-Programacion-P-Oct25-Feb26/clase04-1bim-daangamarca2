/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo11 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // para ingresar los decimales con 
                                        // punto
                                        // no con coma
        // declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        double notaAsignatura1;      
        double notaAsignatura2;
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = entrada.nextLine(); // nextLine me permite recibir o almacenar una cadena 
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = entrada.nextDouble();
        
        
        System.out.printf("Asignatura 1: %s\nNota 1:%.1f" , // %2f significa que si tengo un decimal lo voy a recibir con dos decimales             
                nombreAsignatura1,
                notaAsignatura1
                );
    }
    
}
