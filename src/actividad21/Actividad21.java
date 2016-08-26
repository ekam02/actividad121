/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad21;

import java.util.Scanner;

/**
 *
 * @author Enrique A. Martínez Agudelo; C.C.: 1.082.905.929
 */
public class Actividad21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración e inicialización de variables.
        int valueX = 0; int valueY = 0; int valueZ = 0;
        
        // Declaración de elemento Scanner
        Scanner msn = new Scanner(System.in);
        
        // 1er Mensaje
        System.out.println("Por favo digite el 1er valor a operar");
        // Carga de valor por teclado
        valueX = msn.nextInt();
        
        // 2do Mensaje
        System.out.println("Por favo digite el 2do valor a operar");
        // Carga de valor por teclado
        valueY = msn.nextInt();
        
        // 3er Mensaje
        System.out.println("Por favo digite el 3er valor a operar");
        // Carga de valor por teclado
        valueZ = msn.nextInt();
        
        // Calculando el producto
        System.out.println("El Producto de los valores es: "+valueX*valueY*valueZ);
        
        // Calculando el promedio
        System.out.println("El Promedio de los valores es: "+(valueX+valueY+valueZ)/3.0);
        
    }
    
}
