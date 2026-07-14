/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Clase a utilizar como clase padre de...
 * 
 */
public class RecursoAgencia {
    
    private String id;
    private String nombre;

    
    /**
     * Contrustro de la clase padre RecursoAgencia 
     * 
     * @param id identifacion 
     * @param nombre nombre 
     */
    public RecursoAgencia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "ID : " + id +
                "\nNombre : " + nombre;
    }
    
}
