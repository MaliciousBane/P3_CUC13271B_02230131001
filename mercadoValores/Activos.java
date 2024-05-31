/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoValores;

import java.util.ArrayList;
import java.util.List;

public class Activos {

    private List<String> tipo;
    private List<Integer> precioAct;
    private List<String> hisPrecio;
    private List<Integer> volatilidad;

    public Activos(List<String> tipo, List<Integer> precioAct, List<String> hisPrecio, List<Integer> volatilidad) {
        this.tipo = new ArrayList<>();
        this.precioAct = new ArrayList<>();
        this.hisPrecio = new ArrayList<>();
        this.volatilidad = new ArrayList<>();
    }

    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(List<String> tipo) {
        this.tipo = tipo;
    }

    public List<Integer> getPrecioAct() {
        return precioAct;
    }

    public void setPrecioAct(List<Integer> precioAct) {
        this.precioAct = precioAct;
    }

    public List<String> getHisPrecio() {
        return hisPrecio;
    }

    public void setHisPrecio(List<String> hisPrecio) {
        this.hisPrecio = hisPrecio;
    }

    public List<Integer> getVolatilidad() {
        return volatilidad;
    }

    public void setVolatilidad(List<Integer> volatilidad) {
        this.volatilidad = volatilidad;
    }
    
    public List<String> añadirTipo(String newTipo) {
        this.tipo.add(newTipo);
        return this.tipo;
    }

    public List<Integer> añadirPrecioAct(int newPrecioAct) {
        this.precioAct.add(Integer.SIZE, newPrecioAct);
        return this.precioAct;
    }

    public List<String> añadirHisPrecio(String newHisPrecio) {
        this.hisPrecio.add(newHisPrecio);
        return this.hisPrecio;
    }

    public List<Integer> añadirVolatilidad(int newVolatilidad) {
        this.volatilidad.add(Integer.SIZE, newVolatilidad);
        return this.volatilidad;
    }
}
