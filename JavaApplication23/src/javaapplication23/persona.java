/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;

import java.util.Scanner;





public class persona {
   
    
   

private static String solicitarNombre() {
       System.out.print("Ingrese nombre");
        
    }

    private static String capturarNombre() {
        String nombreCapturado;
        Scanner capturador = new Scanner(System.in); 
        nombreCapturado = capturador.nextLine();
        return nombreCapturado;
    
    }
}

