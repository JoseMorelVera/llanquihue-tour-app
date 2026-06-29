/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.ServicioTuristico;

/**
 * Clase hija de la clase Servicioturistico
 * 
 */
public class RutaGastronomica extends ServicioTuristico {
    
    private int numeroDeParadas;
 
    /**
     * Constructor que contiene el constructor de la clase Servicio gastronomico
     * 
     * @param nombre nombre de la actividad 
     * @param duracionHoras cantidad de horas que dura la actividad
     * @param numeroDeParadas numero de paradas de la actividad 
     */
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                " | Numero de paradas: " + numeroDeParadas;
        
    }
    
}
