/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculogananciasevento;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class CalculoGananciasEvento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int personas, valorEntrada, personasVIP;
       double descuentoPersonasVip, ganancia ;
       
       
       mostrarMensajeInicial();
      
       solicitarTotaldePersonas();
       personas=capturarPersonas();
               
       solicitarValorEntrada();
       valorEntrada=capturarValorEntrada();
       
       solicitarPersonasVip();
       personasVIP=capturarPersonasVip();
       
       solicitarPorcentajeDescuentoVip();
       descuentoPersonasVip=capturardescuentoVip();
       
       ganancia=calcularGanancia(personas,valorEntrada,personasVIP,descuentoPersonasVip);
       
       mostrarGananciaTotal(ganancia);
       
    }
    private static void mostrarMensajeInicial(){
        System.out.println("Calculo de ganancias evento");
        
    }
    private static void solicitarTotaldePersonas() {
        System.out.println("Ingrese cantidad total de asistentes");
    }

    private static int capturarPersonas(){
     Scanner capturador = new Scanner (System.in);
     int personas = capturador.nextInt();
     return personas;
        
    }
    private static void solicitarValorEntrada() {
       System.out.println("Ingrese valor de entrada");
    }

    private static int capturarValorEntrada(){
     Scanner capturador = new Scanner (System.in);
     int valorEntrada = capturador.nextInt();
     return valorEntrada;
        
    }
    private static void solicitarPersonasVip() {
        System.out.println("Ingrese Cantidad de personas VIP");
        
    }
     private static int capturarPersonasVip(){
     Scanner capturador = new Scanner (System.in);
     int personasVip = capturador.nextInt();
     return personasVip;
}
     private static void solicitarPorcentajeDescuentoVip() {
          System.out.println("Ingrese descuento VIP");
    }
     
    private static double capturardescuentoVip(){
    Scanner capturador = new Scanner (System.in);     
    double descuentoPersonasVip = capturador.nextDouble();
    return descuentoPersonasVip;
    }    

    private static double calcularGanancia(int personas, int valorEntrada, int personasVIP, double descuentoPersonasVip) {
        int personasNoVip=personas-personasVIP;
        double valorEntradaVip=valorEntrada-(valorEntrada*descuentoPersonasVip);
        double gananciaNormal = personas*valorEntrada;
        double gananciaVip =personasNoVip*valorEntradaVip;
        return gananciaNormal+gananciaVip/100;
    }

    private static void mostrarGananciaTotal(double ganancia) {
        System.out.println("La ganancia es" +ganancia);
    }
    
}
