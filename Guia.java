/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Esta clase muestra los datos del guia
 * 
 */
public class Guia {
    private String nombre;
    private String especialidad;

    /**
     * 
     * @param nombre nombre del guia 
     * @param especialidad lugar de especialidad del guia
     */
    public Guia(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString() {
        return "Nombre :" + nombre +
                " | Especialidad :" + especialidad;
                
    }
    
}

