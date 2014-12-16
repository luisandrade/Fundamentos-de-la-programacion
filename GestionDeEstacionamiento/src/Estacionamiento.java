

package gestiondeestacionamiento;

import java.util.Calendar;


public class Estacionamiento {
    
String patenteVehiculo;
Calendar horaLlegada;

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public Calendar getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Calendar horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    
}
