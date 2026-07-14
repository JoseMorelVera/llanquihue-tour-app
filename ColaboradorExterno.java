/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author josem
 */
public class ColaboradorExterno extends RecursoAgencia implements Registrable {
    
    String servicio;

    public ColaboradorExterno(String id, String nombre, String servicio) {
        super(id, nombre);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nServicio : " + servicio;
    }
    
    @Override 
    public String mostrarResumen() {
        return "Tipo: Colaborador Externo\n" + toString() + "\n";
    }
}
