/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Planes {
    
    private String actividad;
    private String lugar;
    private int precio;
    private Guia guia;

    public Planes(String actividad, String lugar, int precio, Guia guia) {
        this.actividad = actividad;
        this.lugar = lugar;
        this.precio = precio;
        this.guia = guia;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }
 
    

    @Override
    public String toString() {
        return "Actividad: " + actividad +
                " | Lugar: " + lugar + 
                " | Precio: " + precio + 
                " | Guia: " + guia;
        
    }
    
}
