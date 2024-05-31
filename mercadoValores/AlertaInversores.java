/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoValores;

public class AlertaInversores {

    private boolean alerta;

    public AlertaInversores(boolean alerta) {
        this.alerta = alerta;
    }

    public boolean isAlerta() {
        return alerta;
    }

    public void setAlerta(boolean alerta) {
        this.alerta = alerta;
    }

    public String EvetoImportante(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica sobre un evento importante del mercado";
        }
        return mensaje;
    }

    public String cambioPrecio(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica sobre cambios bruscos de precios";
        }
        return mensaje;
    }
    
        public String noticiasRelevantes(boolean newAlerta, String mensaje) {
        if (newAlerta == true) {
            mensaje = "Se le notifica sobre noticias relevantes";
        }
        return mensaje;
    }
}
