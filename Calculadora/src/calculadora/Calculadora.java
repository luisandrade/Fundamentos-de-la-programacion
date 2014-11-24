/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1, num2 ;
       
       mostrarMensajeInicial();
       
       solicitarPrimerNumero();
       num1 = capturarPrimerNumero();
       
       solicitarSegundoNumero();          
       num2 = capturarSegundoNumero();
               
       solicitarOperacion();
       operacion = calcularOperacion();
       
       
    }

    private static void mostrarMensajeInicial() {
        System.out.println("Calculadora de operaciones basicas");
    }

    private static void solicitarPrimerNumero() {
        System.out.println("Ingrese primer numero");
    }

    private static int capturarPrimerNumero() {
        Scanner capturador = new Scanner (System.in);
        int num1 = capturador.nextInt();
        return num1;
        
    }

    private static void solicitarSegundoNumero() {
        System.out.println("Ingrese segundo numero");
    }

    private static int capturarSegundoNumero() {
        Scanner capturador = new Scanner (System.in);
        int num2 = capturador.nextInt();
        return num2; 
    }

    private static void solicitarOperacion() {
        System.out.println("Ingrese operacion basica");
    }

    private static int calcularOperacion(int num1, int num2) {
       Scanner capturador = new Scanner (System.in);
       int 
    }
    
}



