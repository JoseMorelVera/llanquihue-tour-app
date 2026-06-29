/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase que toma a servicio turistico como clase padre 
 * 
 */
public class ExcursionCultural extends ServicioTuristico {
    
    private String lugarHistorico;

    /**
     * Constructo de la excursion cultural que toma el constructor de la clase servicio turistico 
     * 
     * @param lugarHistorico Ubicacion fisica del lugar historico
     * @param nombre nombre del lugar 
     * @param duracionHoras horas de la actividad
     */
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                " | Lugar historico: " + lugarHistorico;
    }
}
