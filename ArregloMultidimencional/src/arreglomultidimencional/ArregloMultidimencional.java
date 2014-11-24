/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglomultidimencional;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class ArregloMultidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    String [][] arrMulti ={  {"Agentina","Buenos Aires", "Cordoba", "La Plata"},
                             {"Colombia","Bogota", "Cali", "Medellin"},
                             {"Chile","Concepción", "Santiago", "Valparaiso"},
                             {"Mexico","Ciudad Juárez", "León", "Monterrey"},                             
                          };
 
    String ax="";
 
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
           ax+= arrMulti[i][j]+"        ";
        }
        ax+="\n";
    }
  
}

}

