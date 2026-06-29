/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.ServicioTuristico;

/**
 *Clase que toma la clase Servicio turisticos como clase padre
 * 
 */
public class PaseoLacustre extends ServicioTuristico{
    
    private String tipoEmbarcacion;

    /**
     * constructor de la clase paseolacustre que toma el constructor de la clase servicio turistico
     * 
     * @param nombre nombre del lugar del paseo
     * @param duracionHoras duracion de la acitivdad 
     * @param tipoEmbarcacion tipo de transporte que se usara 
     */
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                " | Tipo de Embarcacion: " + tipoEmbarcacion;
        
    }
    
}
