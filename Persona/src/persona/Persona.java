/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persona;

/**
 *
 * @author luis
 */
public class Persona {

    public static String nombre;
    public static int edad;
    
    public static void main (String[] args) {
        Persona miPersona = new Persona();
        miPersona.nombre="luis";
        miPersona.edad=28;
        miPersona.saludar();
    
    
}
}
