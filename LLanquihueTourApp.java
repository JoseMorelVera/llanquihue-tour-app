/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IU;

import data.GestorDatos;

public class LLanquihueTourApp {

    public static void main(String[] args) {
        
        GestorServicioTuristico gestor = new GestorServicioTuristico();
        
        ArrayList<ServicioTuristico> lista = gestor.generarServicioTuristico();

        
        System.out.println("--- LISTADO DE SERVICIOS TURISTICOS ---");
        for (ServicioTuristico servicio : lista) {
            servicio.mostrarInformacion();
            System.out.println("-----------------------------------");
        }
        
    }
    
}
