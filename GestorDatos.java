/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicioTuristico {
    
    public ArrayList<ServicioTuristico> generarServicioTuristico() {
        
        ArrayList<ServicioTuristico> servicioTuristico = new ArrayList<>();
        
        servicioTuristico.add(new RutaGastronomica("Degustacion de queso", 4 , 3));
        servicioTuristico.add(new PaseoLacustre("Lago Manantiales", 4 , "Lancha"));
        servicioTuristico.add(new ExcursionCultural("Visita museo", 3 , "Museo de ilustraciones"));
        servicioTuristico.add(new RutaGastronomica("Fabrica de chocolate", 5 , 2));
        servicioTuristico.add(new PaseoLacustre("Paseo Monte Isabella", 5 , "caminata"));
        servicioTuristico.add(new ExcursionCultural("Recorrido historico", 6 , "Ruinas indigenas"));
        
        return servicioTuristico;
        
    }
}

