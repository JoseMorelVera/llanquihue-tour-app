/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Clase que representa los datos del empleado 
 * 
 * contiene herencia de la clase padre Persona
 */
public class Empleado extends Persona {
    private String puesto;

    
    /**
     * Constructos de clase Empleado contiene el constructo de la clase persona
     * 
     * @param puesto el cargo que tiene el empleado 
     * @param nombre el nombre del empleado 
     * @param rut el rut del empleado 
     */
    public Empleado(String puesto, String nombre, String rut) {
        super(nombre, rut);
        this.puesto = puesto;
    }
    
    /**
     * Muestra la informacion del Empleado
     */
    public void mostrarInformacion(){
        super.mostrarInfomacion();
        System.out.println("Puesto Corporativo: "+  puesto );
    }
    
}
