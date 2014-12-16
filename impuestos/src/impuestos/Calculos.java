/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impuestos;

/**
 *
 * @author luis
 */
public class Calculos {
    public static void main (String[]args ){
        System.out.println("Ingrese valor neto");
        
        Scanner captura=new Scanner (System.in);
        double neto=captura.nextDouble();
        
        Impuestos misImpuestos=newImpuesto();
        double iva =misImpuestos.calcularIva(neto);
        
        publicacion mostrariva=new publicacion();
        mostrarIva.MostrarIva(IVA);
        
        
        
    }
    
    
    
}
