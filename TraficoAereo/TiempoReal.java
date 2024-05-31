/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraficoAereo;

import java.util.ArrayList;
import java.util.List;

public class TiempoReal {

    private List<String> posicion;
    private List<String> estado;

    public TiempoReal(List<String> posicion, List<String> estado) {
        this.posicion = new ArrayList<>();
        this.estado = new ArrayList<>();
    }

    public List<String> getPosicion() {
        return posicion;
    }

    public void setPosicion(List<String> posicion) {
        this.posicion = posicion;
    }

    public List<String> getEstado() {
        return estado;
    }

    public void setEstado(List<String> estado) {
        this.estado = estado;
    }

    public List<String> añadirPosicion(String newPosicion) {
        this.posicion.add(newPosicion);
        return this.posicion;
    }

    public List<String> añadirEstado(String newEstado) {
        this.estado.add(newEstado);
        return this.estado;
    }
}
