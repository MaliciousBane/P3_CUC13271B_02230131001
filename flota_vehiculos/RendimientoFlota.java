/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota_vehiculos;

import java.util.ArrayList;
import java.util.List;

public class RendimientoFlota {
    private List<String> consumoCombustible;
    private List<Integer> costosMantenimiento;
    private List<String> efic_Conductores;

    public RendimientoFlota(List<String> consumoCombustible, List<Integer> costosMantenimiento, List<String> efic_Conductores) {
        this.consumoCombustible = new ArrayList<>();
        this.costosMantenimiento = new ArrayList<>();
        this.efic_Conductores = new ArrayList<>();
    }

    public List<String> getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(List<String> consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public List<Integer> getCostosMantenimiento() {
        return costosMantenimiento;
    }

    public void setCostosMantenimiento(List<Integer> costosMantenimiento) {
        this.costosMantenimiento = costosMantenimiento;
    }

    public List<String> getEfic_Conductores() {
        return efic_Conductores;
    }

    public void setEfic_Conductores(List<String> efic_Conductores) {
        this.efic_Conductores = efic_Conductores;
    }
    
    public List<String> añadirConsumoCombustible(String newConsumoCombustible) {
        this.consumoCombustible.add(newConsumoCombustible);
        return this.consumoCombustible;
    }

    public List<Integer> añadirCostosMantenimiento(int newCostosMantenimiento) {
        this.costosMantenimiento.add(Integer.SIZE,newCostosMantenimiento);
        return this.costosMantenimiento;
    }

    public List<String> añadirEfic_Conductores(String newEfic_Conductores) {
        this.efic_Conductores.add(newEfic_Conductores);
        return this.efic_Conductores;
    }
}
