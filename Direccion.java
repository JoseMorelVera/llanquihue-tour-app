/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Esta clase se utiliza como composicion con la clase cliente
 * 
 * Datos de la direccion 
 */
public class Direccion {
    private String calle;
    private int numero;
    private String comuna;
    private String region;

    /**
     * Constructor de la clase direccion
     * 
     * @param calle representa el nombre de la calle 
     * @param numero representa el numero de la casa o departamento
     * @param comuna representa la comuna del cliente
     * @param region representa la region del cliente
     */
    public Direccion(String calle, int numero, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * 
     * @return Muestra la direccion completa del cliente 
     */
    @Override
    public String toString(){
        return calle + " #" + numero + ", " + comuna + ", " + region;
    }
    
}
