/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraficoAereo;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {

    private List<String> aerolinea;
    private List<Integer> numVuelo;
    private List<String> origen;
    private List<String> destino;
    private List<String> fechaSalida;
    private List<String> fechaLlegada;
    private List<String> horaSalida;
    private List<String> horaLlegada;

    public Vuelo(List<String> aerolinea, List<Integer> numVuelo, List<String> origen, List<String> destino, List<String> fechaSalida, List<String> fechaLlegada, List<String> horaSalida, List<String> horaLlegada) {
        this.aerolinea = new ArrayList<>();
        this.numVuelo = new ArrayList<>();
        this.origen = new ArrayList<>();
        this.destino = new ArrayList<>();
        this.fechaSalida = new ArrayList<>();
        this.fechaLlegada = new ArrayList<>();
        this.horaSalida = new ArrayList<>();
        this.horaLlegada = new ArrayList<>();
    }

    public List<String> getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(List<String> aerolinea) {
        this.aerolinea = aerolinea;
    }

    public List<Integer> getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(List<Integer> numVuelo) {
        this.numVuelo = numVuelo;
    }

    public List<String> getOrigen() {
        return origen;
    }

    public void setOrigen(List<String> origen) {
        this.origen = origen;
    }

    public List<String> getDestino() {
        return destino;
    }

    public void setDestino(List<String> destino) {
        this.destino = destino;
    }

    public List<String> getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(List<String> fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public List<String> getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(List<String> fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public List<String> getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(List<String> horaSalida) {
        this.horaSalida = horaSalida;
    }

    public List<String> getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(List<String> horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public List<String> añadirAerolinea(String newAerolinea) {
        this.aerolinea.add(newAerolinea);
        return this.aerolinea;
    }

    public List<String> añadirOrigen(String newOrigen) {
        this.origen.add(newOrigen);
        return this.origen;
    }

    public List<String> añadirDestino(String newDestino) {
        this.destino.add(newDestino);
        return this.destino;
    }

    public List<Integer> añadirNumVuelo(int newNumVuelo) {
        this.numVuelo.add(Integer.SIZE, newNumVuelo);
        return this.numVuelo;
    }

    public List<String> añadirFechaSalida(String newFechaSalida) {
        this.fechaSalida.add(newFechaSalida);
        return this.fechaSalida;
    }

    public List<String> añadirFechaLlegada(String newFechaLlegada) {
        this.fechaLlegada.add(newFechaLlegada);
        return this.fechaLlegada;
    }

    public List<String> añadirHoraSalida(String newHoraSalida) {
        this.horaSalida.add(newHoraSalida);
        return this.horaSalida;
    }

    public List<String> añadirHoraLlegada(String newHoraLlegada) {
        this.horaLlegada.add(newHoraLlegada);
        return this.horaLlegada;
    }

}
