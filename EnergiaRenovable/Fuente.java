/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnergiaRenovable;

import java.util.ArrayList;
import java.util.List;

public class Fuente {

    private List<String> tipo;
    private List<String> capacGeneracion;
    private List<String> ubicacion;
    private List<String> histProduccion;

    public Fuente(List<String> tipo, List<String> capacGeneracion, List<String> ubicacion, List<String> histProduccion) {
        this.tipo = new ArrayList<>();
        this.capacGeneracion = new ArrayList<>();
        this.ubicacion = new ArrayList<>();
        this.histProduccion = new ArrayList<>();
    }

    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(List<String> tipo) {
        this.tipo = tipo;
    }

    public List<String> getCapacGeneracion() {
        return capacGeneracion;
    }

    public void setCapacGeneracion(List<String> capacGeneracion) {
        this.capacGeneracion = capacGeneracion;
    }

    public List<String> getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(List<String> ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<String> getHistProduccion() {
        return histProduccion;
    }

    public void setHistProduccion(List<String> histProduccion) {
        this.histProduccion = histProduccion;
    }

    public List<String> añadirTipo(String newTipo) {
        this.tipo.add(newTipo);
        return this.tipo;
    }

    public List<String> añadirCapacGeneracion(String newCapacGeneracion) {
        this.capacGeneracion.add(newCapacGeneracion);
        return this.capacGeneracion;
    }

    public List<String> añadirUbicacion(String newUbicacion) {
        this.ubicacion.add(newUbicacion);
        return this.ubicacion;
    }

    public List<String> añadirHistProduccion(String newHistProduccion) {
        this.histProduccion.add(newHistProduccion);
        return this.histProduccion;
    }
}
