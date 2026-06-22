/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase para representar los datos del Cliente
 * 
 * contiene herencia de clase padre Persona y composicion con clase direccion 
 */
public class Cliente extends Persona{
    private Direccion direccion;

    
    /**
     * Constructor de cliente con herencia de la clase persona y composicion de la clase dirrecion 
     * 
     * @param direccion direccion del cliente
     * @param nombre nombre del cliente
     * @param rut rut del cliente
     */
    public Cliente(Direccion direccion, String nombre, String rut) {
        super(nombre, rut);
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    /**
     * Muesta la informacion del cliente 
     */
    public void mostrarInformacion(){
        super.mostrarInfomacion();
        System.out.println("Ubicacion: " + direccion );
    }
    
    
}
