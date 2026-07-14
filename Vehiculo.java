/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author josem
 */
public class Vehiculo extends RecursoAgencia implements Registrable{
    
    private int capacidad;

    public Vehiculo(String id, String nombre, int capacidad) {
        super(id, nombre);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nCapacidad : " + capacidad;
                
    }
    @Override 
    public String mostrarResumen() {
        return "Tipo: Vehiculo\n" + toString() + "\n";
    }
}
