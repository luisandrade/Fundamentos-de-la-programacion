/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculardivisa;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class CalcularDivisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valordolar = 590 ;
       int dolares;
       int pesos=dolares*590;
      
     
       mostrarMensajeInicial();
       solicitardolares();
       dolares=capturarDolares();
       calcularDivisa();
    }

    private static void mostrarMensajeInicial() {
        System.out.println("Programa para calcular divisas");     
    }

    private static void solicitardolares() {
        System.out.println("Ingrese valor en dolares");
    }
   
    private static void capturarDolares() {
        Scanner capturador = new Scanner (System.in);
        int dolares = capturador.nextInt();
        return dolares;
    }

    private static void calcularDivisa() {
        System.out.println("") ;
        
    }
    
}
