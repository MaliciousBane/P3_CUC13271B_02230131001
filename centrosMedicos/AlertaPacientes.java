/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrosMedicos;

public class AlertaPacientes {

    private boolean alerta;

    public AlertaPacientes(boolean alerta) {
        this.alerta = alerta;
    }

    public boolean isAlerta() {
        return alerta;
    }

    public void setAlerta(boolean alerta) {
        this.alerta = alerta;
    }

    public String citaProxima(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica sobre su proxima cita";
        }
        return mensaje;
    }

    public String vencimientoMedicamento(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica sobre la fecha de vencimiento de su medicacion";
        }
        return mensaje;
    }
}
