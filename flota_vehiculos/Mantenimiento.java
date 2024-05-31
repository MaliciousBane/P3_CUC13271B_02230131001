/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota_vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Mantenimiento {
    private List<String> cambioAceite;
    private List<String> inspecciones;
    private List<String> reparaciones;

    public Mantenimiento(List<String> cambioAceite, List<String> inspecciones, List<String> reparaciones) {
        this.cambioAceite = new ArrayList<>();
        this.inspecciones = new ArrayList<>();
        this.reparaciones = new ArrayList<>();
    }

    public List<String> getCambioAceite() {
        return cambioAceite;
    }

    public void setCambioAceite(List<String> cambioAceite) {
        this.cambioAceite = cambioAceite;
    }

    public List<String> getInspecciones() {
        return inspecciones;
    }

    public void setInspecciones(List<String> inspecciones) {
        this.inspecciones = inspecciones;
    }

    public List<String> getReparaciones() {
        return reparaciones;
    }

    public void setReparaciones(List<String> reparaciones) {
        this.reparaciones = reparaciones;
    }

   public List<String> añadirAceite(String newCambioAceite) {
        this.cambioAceite.add(newCambioAceite);
        return this.cambioAceite;
    }

    public List<String> añadirInspecciones(String newInspecciones) {
        this.inspecciones.add(newInspecciones);
        return this.inspecciones;
    }

    public List<String> añadirReparaciones(String newReparaciones) {
        this.reparaciones.add(newReparaciones);
        return this.reparaciones;
    }
    
}
