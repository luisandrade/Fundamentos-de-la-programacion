/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarMensajeInicial();
        solicitarNumero();
        int numero=capturarNumero();
        int cuadrado=calcularCuadrado(numero);
        mostrarResultado(cuadrado);
        mostrarMensajeFinal();
    }
    public static void mostrarMensajeInicial(){
        System.out.println("programa de calculo de cuadrado");
        
    }
    public static void solicitarNumero(){
    System.out.println("Ingrese un numero");
}
    
public static int capturarNumero(){
Scanner capturador=new Scanner(System.in);
int capturado=capturador.nextInt();
return capturado;
}
public static int calcularCuadrado(int n){
int resultado=n*n;
return resultado;
}
public static void mostrarResultado(int c){
System.out.println("cuadrado es"+c);
}
public static void mostrarMensajeFinal(){
System.out.println("Programa Finalizado");
}
}