/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraficoAereo;

import java.util.List;

public class Informes {

    private List<String> histVuelo;
    private List<String> patronTrafico;
    private List<String> congestiones;

    public Informes(List<String> histVuelo, List<String> patronTrafico, List<String> congestiones) {
        this.histVuelo = histVuelo;
        this.patronTrafico = patronTrafico;
        this.congestiones = congestiones;
    }

    public List<String> getHistVuelo() {
        return histVuelo;
    }

    public void setHistVuelo(List<String> histVuelo) {
        this.histVuelo = histVuelo;
    }

    public List<String> getPatronTrafico() {
        return patronTrafico;
    }

    public void setPatronTrafico(List<String> patronTrafico) {
        this.patronTrafico = patronTrafico;
    }

    public List<String> getCongestiones() {
        return congestiones;
    }

    public void setCongestiones(List<String> congestiones) {
        this.congestiones = congestiones;
    }

    public List<String> añadirHistVuelo(String newHistVuelo) {
        this.histVuelo.add(newHistVuelo);
        return this.histVuelo;
    }

    public List<String> añadirPatronTrafico(String newPatronTrafico) {
        this.patronTrafico.add(newPatronTrafico);
        return this.patronTrafico;
    }

    public List<String> añadirCongestiones(String newCongestiones) {
        this.congestiones.add(newCongestiones);
        return this.congestiones;
    }
}
