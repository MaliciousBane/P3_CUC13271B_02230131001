/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrosMedicos;

import java.util.ArrayList;
import java.util.List;

public class paciente {

    private List<String> infoPersonal;
    private List<String> historialMed;
    private List<String> citaproramada;

    public paciente(List<String> infoPersonal, List<String> historialMed, List<String> citaproramada) {
        this.infoPersonal = new ArrayList<>();
        this.historialMed = new ArrayList<>();
        this.citaproramada = new ArrayList<>();
    }

    public List<String> getInfoPersonal() {
        return infoPersonal;
    }

    public void setInfoPersonal(List<String> infoPersonal) {
        this.infoPersonal = infoPersonal;
    }

    public List<String> getHistorialMed() {
        return historialMed;
    }

    public void setHistorialMed(List<String> historialMed) {
        this.historialMed = historialMed;
    }

    public List<String> getCitaproramada() {
        return citaproramada;
    }

    public void setCitaproramada(List<String> citaproramada) {
        this.citaproramada = citaproramada;
    }
    
    public List<String> añadirInfoPersonal(String newInfoPersonal) {
        this.infoPersonal.add(newInfoPersonal);
        return this.infoPersonal;
    }

    public List<String> añadirHistorialMed(String newHistorialMed) {
        this.historialMed.add(newHistorialMed);
        return this.historialMed;
    }

    public List<String> añadirCitaProramada(String newCitaProramada) {
        this.citaproramada.add(newCitaProramada);
        return this.citaproramada;
    }

}
