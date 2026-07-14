/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Clase hija de la clase Recurso agencia 
 * 
 */
public class GuiaTuristico extends RecursoAgencia implements Registrable {
    
    private String idioma;

    
    /**
     * constructor clase guia turistico 
     * 
     * @param id idenficacion 
     * @param nombre nommbre 
     * @param idioma idioma del guia 
     */
    public GuiaTuristico(String id, String nombre, String idioma) {
        super(id, nombre);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nIdioma : " + idioma;
    }
    
    @Override 
    public String mostrarResumen() {
        return "Tipo: Guia Turistico\n" + toString() + "\n";
    }
}
