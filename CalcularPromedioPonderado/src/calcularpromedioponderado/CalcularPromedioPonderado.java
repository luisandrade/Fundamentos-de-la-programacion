/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcularpromedioponderado;

import java.util.Scanner;

/**
 *
 * @author Visual Studio
 */
public class CalcularPromedioPonderado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int cantidadNotas;
        double nota,ponderacion,notaPonderada;
        double sumaNotasPonderadas =0;
        double sumaPonderaciones=0;
        mostrarMensajeInicial();
        
        solicitarCantidadNotas();
        cantidadNotas=capturarCantidadNotas();
        
        for(int i=0;i<cantidadNotas;i++){
         
         solicitarNota();
         nota = capturarNota();
         
         solicitarPonderacion();
         ponderacion = capturarPonderacion();
        
         notaPonderada = calcularNotaPonderada(nota,ponderacion);
         sumaPonderaciones=sumaPonderaciones+notaPonderada;
         sumaNotasPonderadas = sumaNotasPonderadas + notaPonderada;
        
        }
        mostrarNotaPonderada(sumaNotasPonderadas);
        mostrarSituacion(sumaNotasPonderadas);
        
    }

    private static void mostrarMensajeInicial() {
    System.out.println("Calculo de notas ponderadas");   
    }

    private static void solicitarCantidadNotas() {
   System.out.print("ingrese cantidad de notas: "); 
    }

    private static int capturarCantidadNotas() {
    Scanner capturador = new Scanner(System.in);
    int cantidadNotas = capturador.nextInt();
    return cantidadNotas;
    }

    private static void solicitarNota() {
       System.out.print("Ingrese nota :");    
    }

    private static double capturarNota() {
    Scanner capturador = new Scanner(System.in);
    double nota = capturador.nextDouble();
    return nota;
    }

    private static void solicitarPonderacion() {
      System.out.print("Ingrese ponderacion :"); 
    }

    private static double capturarPonderacion() {
    Scanner capturador = new Scanner(System.in);
    double ponderacion = capturador.nextDouble();
    return ponderacion/100;
    }

    private static double calcularNotaPonderada(double nota, double ponderacion) {
    return nota*ponderacion;
    }

    private static void mostrarNotaPonderada(double sumaNotasPonderadas) {
    System.out.println("La nota ponderada es:"+sumaNotasPonderadas);
    }

    private static void mostrarSituacion(double sumaNotasPonderadas) {
    double promedioFinal, notaExamen;
    
    if(sumaNotasPonderadas >= 4.0){
        System.out.println("situación : Aprobado");
    }else{
        solicitarNotaExamen();
        notaExamen= capturarNotaExamen();
        promedioFinal=calcularPromedioFinal(sumaNotasPonderadas,notaExamen);
    if (promedioFinal >=4.0){
        System.out.println("Aprobado");
    }else{
        System.out.println("Reprobado");
    }
    }
    }
    private static void solicitarNotaExamen() {
       System.out.println("Ingrese nota Examen");
    }

// puede ser int cuando debiera ser double //
    private static double capturarNotaExamen() {
    Scanner capturador = new Scanner (System.in);
     double notaExamen = capturador.nextDouble();
     return notaExamen;
    }

    private static double calcularPromedioFinal(double sumaNotasPonderadas, double notaExamen) {
    return (sumaNotasPonderadas*0.6)+(notaExamen*0.4);
    
    }
    
}