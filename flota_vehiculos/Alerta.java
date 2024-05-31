/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota_vehiculos;

public class Alerta {

    private boolean alerta;

    public Alerta(boolean alerta) {
        this.alerta = false;
    }

    public boolean isAlerta() {
        return alerta;
    }

    public void setAlerta(boolean alerta) {
        this.alerta = alerta;
    }

    public String EventoImportante(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica de un evento de su importancia";
        }
        return mensaje;
    }

    public String VencimientoSeguro(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica del vencimiento de un seguro";
        }
        return mensaje;
    }

    public String RenovacionLicencia(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica acerca de la renovacion de una licencia";
        }
        return mensaje;
    }
}
