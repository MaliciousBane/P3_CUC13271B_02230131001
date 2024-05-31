/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoValores;

import java.util.ArrayList;
import java.util.List;

public class InformesRendimiento {

    private List<String> analisisTend;
    private List<String> voulmenNegociacion;
    private List<String> correlacionActivo;

    public InformesRendimiento(List<String> analisisTend, List<String> voulmenNegociacion, List<String> correlacionActivo) {
        this.analisisTend = new ArrayList<>();
        this.voulmenNegociacion = new ArrayList<>();
        this.correlacionActivo = new ArrayList<>();
    }

    public List<String> getAnalisisTend() {
        return analisisTend;
    }

    public void setAnalisisTend(List<String> analisisTend) {
        this.analisisTend = analisisTend;
    }

    public List<String> getVoulmenNegociacion() {
        return voulmenNegociacion;
    }

    public void setVoulmenNegociacion(List<String> voulmenNegociacion) {
        this.voulmenNegociacion = voulmenNegociacion;
    }

    public List<String> getCorrelacionActivo() {
        return correlacionActivo;
    }

    public void setCorrelacionActivo(List<String> correlacionActivo) {
        this.correlacionActivo = correlacionActivo;
    }

    public List<String> añadirAnalisisTend(String newAnalisisTend) {
        this.analisisTend.add(newAnalisisTend);
        return this.analisisTend;
    }

    public List<String> añadirVoulmenNegociacion(String newVoulmenNegociacion) {
        this.voulmenNegociacion.add(newVoulmenNegociacion);
        return this.voulmenNegociacion;
    }

    public List<String> añadirCorrelacionActivo(String newCorrelacionActivo) {
        this.correlacionActivo.add(newCorrelacionActivo);
        return this.correlacionActivo;
    }
}
