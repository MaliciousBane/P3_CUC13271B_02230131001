/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota_vehiculos;

import java.util.ArrayList;
import java.util.List;

public class vehiculo {

    private List<String> tipo; //tipo de vehiculo
    private List<String> marca;
    private List<String> modelo;
    private List<Integer> año;
    private List<Integer> kilometraje;
    private List<String> conductor;

    public vehiculo(List<String> tipo, List<String> marca, List<String> modelo, List<Integer> año, List<Integer> kilometraje, List<String> conductor) {
        this.tipo = new ArrayList<>();
        this.marca = new ArrayList<>();
        this.modelo = new ArrayList<>();
        this.año = new ArrayList<>();
        this.kilometraje = new ArrayList<>();
        this.conductor = new ArrayList<>();
    }

    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(List<String> tipo) {
        this.tipo = tipo;
    }

    public List<String> getMarca() {
        return marca;
    }

    public void setMarca(List<String> marca) {
        this.marca = marca;
    }

    public List<String> getModelo() {
        return modelo;
    }

    public void setModelo(List<String> modelo) {
        this.modelo = modelo;
    }

    public List<Integer> getAño() {
        return año;
    }

    public void setAño(List<Integer> año) {
        this.año = año;
    }

    public List<Integer> getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(List<Integer> kilometraje) {
        this.kilometraje = kilometraje;
    }

    public List<String> getConductor() {
        return conductor;
    }

    public void setConductor(List<String> conductor) {
        this.conductor = conductor;
    }

    public List<String> añadirTipo(String newTipo) {
        this.tipo.add(newTipo);
        return this.tipo;
    }

    public List<String> añadirMarca(String newMarca) {
        this.marca.add(newMarca);
        return this.marca;
    }

    public List<String> añadirModelo(String newModelo) {
        this.tipo.add(newModelo);
        return this.tipo;
    }

    public List<Integer> añadirAño(int newAño) {
        this.año.add(Integer.SIZE,newAño);
        return this.año;
    }

    public List<Integer> añadirKilometraje(int newKilometraje) {
        this.kilometraje.add(Integer.SIZE,newKilometraje);
        return this.kilometraje;
    }

    public List<String> añadirConductor(String newConductor) {
        this.marca.add(newConductor);
        return this.marca;
    }

}
