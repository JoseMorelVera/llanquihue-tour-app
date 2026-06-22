/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IU;

import model.Planes;
import data.GestorDatos;
import java.util.ArrayList;
import java.util.Scanner;

public class LLanquihueTourApp {

    public static void main(String[] args) {
        GestorDatos gd = new GestorDatos();
        String rutaPlanes = "src/planes.txt"; 
        
        ArrayList<Planes> todosLosPlanes = gd.cargarPlanes(rutaPlanes);
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("=========================================");
        System.out.println("  BIENVENIDO A LLANQUIHUE TOUR APP  ");
        System.out.println("=========================================");

        do {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Mostrar todos los planes disponibles");
            System.out.println("2. Buscar/Filtrar planes por actividad");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("\n--- TODOS LOS PLANES ---");
                        for (Planes p : todosLosPlanes) {
                            System.out.println("Actividad: " + p.getActividad() + " | Lugar: " + p.getLugar() + " | Precio: $" + p.getPrecio() + " | Guia: " + p.getGuia());
                        }
                        break;
                    case 2:
                        System.out.print("\nIngrese el nombre de la Actividad a buscar : ");
                        String actividad = sc.nextLine();
                        ArrayList<Planes> filtrados = gd.filtrarPlanesPorActividad(todosLosPlanes, actividad);
                        
                        System.out.println("\n--- RESULTADOS DE BUSQUEDA ---");
                        if (filtrados.isEmpty()) {
                            System.out.println("No se encontraron planes turisticos para: " + actividad);
                        } else {
                            for (Planes p : filtrados) {
                                System.out.println("Actividad: " + p.getActividad() + " | Precio: $" + p.getPrecio() + " | Guia: " + p.getGuia());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("¡Gracias por utilizar Llanquihue Tour App!");
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un numero valido.");
            }
        } while (opcion != 3);
        
        sc.close(); 
    }
    
}
