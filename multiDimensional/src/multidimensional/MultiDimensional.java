/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multidimensional;


public class MultiDimensional {

   
    public static void main(String[] args) {
   
   String [][] arregloMulti = new String [4][4];
        
   arregloMulti[0][0]="Ingenieria en administracion de empresas,";
   arregloMulti[0][1]="Ingenieria en produccion ganadera,";
   arregloMulti[0][2]="Ingenieria agricola,";
   arregloMulti[0][3]="Ingenieria en contruccion,";
   arregloMulti[1][0]="Diseño grafico profesional,";
   arregloMulti[1][1]="Ingenieria en electricidad,";
   arregloMulti[1][2]="Ingenieria en informatica,";
   arregloMulti[1][3]="Ingenieria en telecomunicaciones,";
   arregloMulti[2][0]="Ingenieria en maquinaria,";
   arregloMulti[2][1]="Ingenieria industrial,";
   arregloMulti[2][2]="Ingenieria en prevension de riesgo,";
   arregloMulti[2][3]="Administracion de hoteles y restaurantes,";
   arregloMulti[3][0]="Diseño de moda,";
   arregloMulti[3][1]="Ingenieria en electrica,";
   arregloMulti[3][2]="Ingenieria en sonido,";
   arregloMulti[3][3]="Ingenieria en automatizacion y control indistrial,";  
        
    System.out.println("Programa que muestra las carreras profesional de INACAP sede Temuco");
    for(int i=0;i<arregloMulti.length;i++){
        for(int k=0;k<arregloMulti[i].length;k++){
          
   System.out.print(arregloMulti[i][k]+" ");
   
    }
    System.out.println();
    }
    
}
}
