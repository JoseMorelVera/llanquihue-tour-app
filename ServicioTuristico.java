/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Esta clase funcionara como clase padre para rutagastronomica, paseolacustre y excursioncultural
 * 
 */
public class ServicioTuristico {
    
    private String nombre;
    private int duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico
     * 
     * @param nombre indica el nombre de la actividad 
     * @param duracionHoras indica la cantidad de horas de la actividad
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Duracion: " + duracionHoras;
    }
    
}
