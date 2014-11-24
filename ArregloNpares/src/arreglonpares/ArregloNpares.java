/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arreglonpares;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class ArregloNpares {

     public static void main(String[] args) {
    
         int pares []=new int[10];
   
             pares[0]=12;
             pares[1]=14;
             pares[2]=16;
             pares[3]=18;
             pares[4]=20;
             pares[5]=22;
             pares[6]=24;
             pares[7]=26;
             pares[8]=28;
             pares[9]=30;
            
             
     
             
             
   for (int i=0;i<=9;i++){
   
   System.out.println( pares[i]);
   }
             
   String nombres[]=new String[5];
   int con=0;
           System.out.println("Ingrese nombres");
           while (con<5){
              System.out.println(" Nombre");
              Scanner captura=new Scanner (System.in);
              nombres[con]=captura.nextLine();
              con++;
           }
           
           for (int i=0;i<5;i++){
               System.out.println(nombres[i]);
                 
           }
           
           for (int i=0;i<5;i++) {
                 System.out.println(nombres[i]);
    }
}
}
