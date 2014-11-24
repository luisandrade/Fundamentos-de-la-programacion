/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversiondedivisa;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class ConversionDeDivisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    String nombres[] = new String[5];
	        int con = 0;
	        System.out.println("Ingrese  nombres:");
	        while(con < 5 )
	        {
	            System.out.print("Nombre:");
	            Scanner misNombres = new Scanner(System.in);
	            nombres[con]= misNombres.nextLine();
	 
	            con ++;
	            }
                
                for(int i=0;i<5;i++){
                    System.out.println(nombres[i]);
    
    
                }
    }
}
