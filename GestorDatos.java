/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.Planes;
import model.Cliente;
import model.Direccion;
import model.Guia;
import model.Planes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {
    
    public ArrayList<Planes> cargarPlanes(String rutaArchivo) { 
        
        ArrayList<Planes> listaPlanes = new ArrayList<>();
        
        try { 
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            
            String linea;
            
            while ((linea = lector.readLine()) != null ) { 
                String[] partes = linea.split(";");
                
                if(partes.length == 4 ) {
                    
                    String actividad = partes[0];
                    String lugar = partes[1];
                    int precio = Integer.parseInt(partes[2]);
                    String nombreGuia = partes [3];
                    
                    Guia guia = new Guia(nombreGuia, "Local");
                    Planes plan = new Planes(actividad, lugar, precio, guia);
                    
                    listaPlanes.add(plan);
                    
                }
            }
            
            lector.close();
            
        }catch (IOException e ) {
            System.out.println("Error al leer el archivo");
            
        }
        
        return listaPlanes;
    }
    
    public ArrayList<Planes> filtrarPlanesPorActividad(ArrayList<Planes> todosLosPlanes, String actividadBuscar) {
        ArrayList<Planes> filtrados = new ArrayList<>();
        for (Planes p : todosLosPlanes) {
            if (p.getActividad().equalsIgnoreCase(actividadBuscar)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
    
}
