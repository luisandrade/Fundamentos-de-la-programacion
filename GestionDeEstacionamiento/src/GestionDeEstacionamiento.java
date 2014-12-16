

package gestiondeestacionamiento;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Scanner;

public  class GestionDeEstacionamiento {

    
   int valorHora = 600;
   int valorExtra = 300;
            
   Estacionamiento[] arrEstacionamiento = new Estacionamiento[19];     
   
    public void inicioGestion() {
        System.out.println("Selencione una opcion: 1 = Registrar entrada, 2 = Registrar salida");
          Scanner captura = new Scanner (System.in);
          int opcion = captura.nextInt();
         // Se realizan accion segun opcion ingresada
          switch (opcion){
              case 1:
                  resgistroEntrada();
                  
                  break;
              case 2:
                  registroSalida();
                  break;
              default:
                  System.out.println("Opción invalida");
          }
      }
    
    public void resgistroEntrada(){
        
       
       Estacionamiento estacionamiento = new Estacionamiento();
       Calendar fechaActual = Calendar.getInstance(); 
       System.out.println("Favor ingrese patente: ");
       Scanner captura = new Scanner (System.in);
       String patente = captura.nextLine();
       estacionamiento.setPatenteVehiculo(patente);
       estacionamiento.setHoraLlegada(fechaActual);
       
       
        for (int i = 0; i < 19; i++) {
            if (arrEstacionamiento[i]==null){ 
                arrEstacionamiento[i]=estacionamiento;
             System.out.println("El vehiculo con patente "+estacionamiento.getPatenteVehiculo()+" en el lugar: "+(i+1));
                break;
            }
        }
       inicioGestion();
        
    }
    
    public void registroSalida(){
   

             
            System.out.println("Favor ingrese patente: ");
            Scanner captura = new Scanner (System.in);
            String patente = captura.nextLine();
             
             for (int i = 0; i < 19; i++) {
            if (null !=arrEstacionamiento[i] && patente.equals(arrEstacionamiento[i].getPatenteVehiculo())){ 
                // Calculo diferencia en minutos
                long horaLlegada = arrEstacionamiento[i].getHoraLlegada().getTimeInMillis();                
                long horaSalida = Calendar.getInstance().getTimeInMillis();
                long diff =  horaSalida - horaLlegada;
                long difMin = (diff) / (60*1000);
                
               if (difMin >0){
                
                   BigDecimal resto =  new BigDecimal((difMin -60)/30);
                   
                   int restoDiv = (int) ((difMin +61)%30);                   
                   int restoRedondeado = resto.setScale(0, RoundingMode.UP).intValue();
                   
                   //Si se pasa un minuto se cobra 300
                   if (restoDiv>=1){
                       restoRedondeado = 1 + (restoRedondeado);
                   }
                   // con "this" hace referencia a la variable de clase.
                   int totalPagar = restoRedondeado * this.valorExtra;
                   System.out.println("El total a pagar es de: " +(totalPagar+this.valorHora));
                            
                }else{
                    System.out.println("El total a pagar es de: $600");
                }                
                arrEstacionamiento[i]=null;
                break;
            }else {
                System.out.println("No se encuentra el vehiculo");
                break;
            }
    
         }

         inicioGestion();
}    
}