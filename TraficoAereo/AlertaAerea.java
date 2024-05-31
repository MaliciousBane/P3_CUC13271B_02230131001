/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraficoAereo;

public class AlertaAerea {
    private boolean alerta;

    public AlertaAerea(boolean alerta) {
        this.alerta = alerta;
    }

    public boolean isAlerta() {
        return alerta;
    }

    public void setAlerta(boolean alerta) {
        this.alerta = alerta;
    }
    
        public String EventoCritico(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica de un evento de su critico";
        }
        return mensaje;
    }

    public String EmergenciaBordo(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica de una emegencia a bordo";
        }
        return mensaje;
    }

    public String condicionesMetereologicas(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica acerca de las condiciones meteorologicas";
        }
        return mensaje;
    }
}
