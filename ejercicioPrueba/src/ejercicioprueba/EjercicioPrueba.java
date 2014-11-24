/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioprueba;



/**
 *
 * @author luis
 */
public class EjercicioPrueba {

   
    
    
    public static void main(String[] args) {
       double sumaNotasPonderadas =0;
        int notasInsuficientes =0;
    }
        private static void mostrarSituacion(double sumaNotasPonderadas, int notasInsuficientes){
            
            if (sumaNotasPonderadas >= 5.5 && notasInsuficientes==0){
                System.out.println("Aprobado");
            }else{
                        solicitarNotaExamen();
                        double notaExamen=obtenerNotaExamen();
                        double promedioFinal=calcularPromedioFinal(sumaNotasPonderadas,notaExamen);
                       
                        if (promedioFinal>=4.0){
                           System.out.println("Aprobado");
                        }else{
                           System.out.println("Reprobado");
                        }
                    
                        }
                        }

    private static void solicitarNotaExamen() {
    System.out.println("Ingrese nota Examen");
    }
        
       
      
    }
                
            }
    }   
    
}
