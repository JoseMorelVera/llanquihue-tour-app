/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorDatos {

     public void ejecutarPrueba() {
        
        // objetos de la clase Ruta gastronomica 
        RutaGastronomica ruta1 = new RutaGastronomica("Ruta del vino", 4 , 3 );
        RutaGastronomica ruta2 = new RutaGastronomica("Sabores locales", 6, 4 );
        
        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println();
        
        // objetos de la clase paseo lacustre 
        PaseoLacustre paseo1 = new PaseoLacustre("Visita volcan osorno", 3 , "Movilizacion local");
        PaseoLacustre paseo2 = new PaseoLacustre("Tour por el lago", 5, "Lancha");
        
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println();
        
        // objetos de la clase excursion cultural
        ExcursionCultural excursion1 = new ExcursionCultural("Colonos Alemanes", 6 , "Frutillar");
        ExcursionCultural excursion2 = new ExcursionCultural("Historia Patrimonial", 5 , "Puerto Varas");
        
        System.out.println(excursion1);
        System.out.println(excursion2);
        System.out.println();
        
    }
    
}
