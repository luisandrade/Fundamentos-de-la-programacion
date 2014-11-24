/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglosejercicio;

/**
 *
 * @author luis
 */
public class ArreglosEjercicio {

    
    public static void main(String[] args) {
        int edades []=new int[4]; //arreglo unidimencional, se declara el arreglo //
        edades[0]=28; //indice y el valor asignado,asiganamos valor al arreglo //
        edades[1]=23; 
        edades[2]=18;
        edades[3]=19;
        
        //leer//
        System.out.println(edades[2]);
    
        //arreglo de datos alfanumericos//
     String nombres[]=new String [5];
     
     //asignamos valores//
             nombres[0]="Luis";
             nombres[1]="Manuel";
             nombres[2]="Carla";
             nombres[3]="Tulio";
             nombres[4]="Anabel";




for (int i=0;i<=4;i++){
    
   System.out.println("El nombre es " + nombres[i]);
}
   
   for (int i=4;i>=0;i--){
    
   System.out.println("El nombre es " + nombres[i]);
} 
    
}
}
