/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pesoideal2;

/**
 *
 * @author luis
 */
import java.util.Scanner;
public class Pesoideal2 {

  
    public static void main(String[] args) {
        mostrarMensajeInicial();
        solicitarEdad();
        int PesoIdeal=(Edad*2+8);
        mostrarResultado();
        mostrarMensajeFinal();
    }
    public static void mostrarMensajeInicial(){
        System.out.println("Programa de cualculo de peso ideal");
}
    public static void solicitarEdad(){
    System.out.println("ingrese un numero");
}
    
