/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IU;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;
import javax.swing.JOptionPane;


public class LLanquihueTourApp {
    
    public static void main(String[] args) {

    GestorEntidades gestor = new GestorEntidades();
        
        String[] opcionesMenu = {"Registrar Guía", "Registrar Vehículo", "Registrar Colaborador", "Ver Resumen", "Salir"};
        
        boolean continuar = true;

        while (continuar) {
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una acción para la Agencia Llanquihue Tour:",
                    "Sistema de Gestión - Llanquihue Tour",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcionesMenu,
                    opcionesMenu[0]
            );

            switch (seleccion) {
                case 0: 
                    try {
                        String idGuia = JOptionPane.showInputDialog("Ingrese el ID del Guía:");
                        String nombreGuia = JOptionPane.showInputDialog("Ingrese el Nombre del Guía:");
                        String idioma = JOptionPane.showInputDialog("Ingrese el Idioma del Guía:");
                        
                        if (idGuia != null && nombreGuia != null && idioma != null) {
                            GuiaTuristico nuevoGuia = new GuiaTuristico(idGuia, nombreGuia, idioma);
                            gestor.agregarEntidad(nuevoGuia);
                            JOptionPane.showMessageDialog(null, "¡Guía Turístico registrado con éxito!");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error en el ingreso de datos.");
                    }
                    break;

                case 1: 
                    try {
                        String idVehiculo = JOptionPane.showInputDialog("Ingrese el ID del Vehículo:");
                        String nombreVehiculo = JOptionPane.showInputDialog("Ingrese la Marca/Modelo del Vehículo:");
                        String capacidadStr = JOptionPane.showInputDialog("Ingrese la Capacidad de Pasajeros:");
                        
                        if (idVehiculo != null && nombreVehiculo != null && capacidadStr != null) {
                            int capacidad = Integer.parseInt(capacidadStr);
                            Vehiculo nuevoVehiculo = new Vehiculo(idVehiculo, nombreVehiculo, capacidad);
                            gestor.agregarEntidad(nuevoVehiculo);
                            JOptionPane.showMessageDialog(null, "¡Vehículo registrado con éxito!");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: La capacidad debe ser un número entero válido.");
                    }
                    break;

                case 2: 
                    try {
                        String idColab = JOptionPane.showInputDialog("Ingrese el ID del Colaborador:");
                        String nombreColab = JOptionPane.showInputDialog("Ingrese el Nombre del Colaborador:");
                        String servicio = JOptionPane.showInputDialog("Ingrese el Tipo de Servicio prestado:");
                        
                        if (idColab != null && nombreColab != null && servicio != null) {
                            ColaboradorExterno nuevoColab = new ColaboradorExterno(idColab, nombreColab, servicio);
                            gestor.agregarEntidad(nuevoColab);
                            JOptionPane.showMessageDialog(null, "¡Colaborador Externo registrado con éxito!");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error en el ingreso de datos.");
                    }
                    break;

                case 3: 
                    String resultado = gestor.mostrarResumen();
                    JOptionPane.showMessageDialog(
                            null, 
                            resultado, 
                            "Resumen de Entidades Registradas", 
                            JOptionPane.PLAIN_MESSAGE
                    );
                    break;

                case 4: 
                default:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema. ¡Buen viaje con Llanquihue Tour!");
                    break;
            }
        }
    }    
}
