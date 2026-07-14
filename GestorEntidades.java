/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;
import model.RecursoAgencia;
import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {
    
    private List<RecursoAgencia> listaEntidades = new ArrayList<>();
    
    public GestorEntidades() {
        
    }
    
    public void agregarEntidad(RecursoAgencia entidad) {
        listaEntidades.add(entidad);
    }
    
    public String mostrarResumen() {
        if (listaEntidades.isEmpty()) {
            return "No hay datos guardados.";
        }
        
        String resumen = "";
        
        for (RecursoAgencia entidad : listaEntidades) {
            
            if (entidad instanceof GuiaTuristico) {
                
                GuiaTuristico guiaTuristico = (GuiaTuristico) entidad;
                
                resumen += guiaTuristico.mostrarResumen() +
                        "\n";
                
            } else if (entidad instanceof Vehiculo) {
                
                Vehiculo vehiculo = (Vehiculo) entidad;
                
                resumen += vehiculo.mostrarResumen() +
                        "\n";
                
            } else if (entidad instanceof ColaboradorExterno) {
                
                ColaboradorExterno colaboradorExterno = (ColaboradorExterno) entidad;
                
                resumen += colaboradorExterno.mostrarResumen() +
                        "\n";
            }
                 
        }
        
        return resumen;
    }
   
}

