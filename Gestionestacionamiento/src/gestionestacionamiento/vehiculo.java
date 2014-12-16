/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionestacionamiento;

/**
 *
 * @author luis
 */
public class vehiculo {
    
    public static void main(String [] args ) { 

int i = 0; // van a ser las horas 
int j = 0; // van a ser los minutos 

for( i = 0; i <= 23; i++ ) { 
for( j = 0; j <= 59; j++ ) { 

if( i < 10 & j >= 10 ) // para que coloque el cero antes de la i 
System.out.println("0" + i + " : " + j); 
else if( i < 10 & j < 10 ) // para colocar el cero antes de la i y la j 
System.out.println("0" + i + " : " + "0" + j); 
else 
System.out.println(i + " : " + j); 
} // fin del for interior 
} // fin del for exterior 

} // fin del metodo main 
} // fin de la clase 
    

   