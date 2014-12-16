/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;

import java.util.Scanner;


public class JavaApplication23 {

   
    public static void main(String[] args) {
   String nombre;
   int edad;
   solicitarNombre();
   nombre = capturarNombre();
   solicitarEdad();
   edad = capturarEdad();
   
   
    }

     

    private static void solicitarNombre() {
       System.out.print("Ingrese nombre");
        
    }

    private static String capturarNombre() {
        String nombreCapturado;
        Scanner capturador = new Scanner(System.in); 
        nombreCapturado = capturador.nextLine();
        return nombreCapturado;
    }

    private static void solicitarEdad() {
       System.out.println(("ingrese edad:"));
    }

    private static int capturarEdad() {
        Scanner capturador = new Scanner(System.in);
        int edad = capturador.nextInt();
        return edad;
    }


       
    }
    
}
