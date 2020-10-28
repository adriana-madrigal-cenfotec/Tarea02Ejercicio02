package madrigal.adriana.tarea02.ejercicio02.controlador;

import madrigal.adriana.tarea02.ejercicio02.UI.UI;
import madrigal.adriana.tarea02.ejercicio02.bl.entidades.Vehiculo;
import madrigal.adriana.tarea02.ejercicio02.bl.logica.Gestor;

import java.util.ArrayList;

public class Controlador {
    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();

    public void ejecutar() {
        int opcion = 0;
        do {
            interfaz.showMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);

        } while (opcion != 3);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion){
            case 1:
                procesarCrearEmpleadoComputadora();
                break;
            case 2:
                listarVehiculoMotor();
                break;
            case 3:
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }

    }

    private void listarVehiculoMotor() {
        ArrayList<Vehiculo> listaVehiculos = gestor.listarVehiculoMotor();
        interfaz.imprimirMensaje("Lista de Empleados y Computadoras");
        for (int i = 0; i < listaVehiculos.size(); i++){
            interfaz.imprimirMensaje(listaVehiculos.get(i).toString());
        }
    }

    private void procesarCrearEmpleadoComputadora() {
        interfaz.imprimirMensaje("Ingrese la marca del vehiculo: ");
        String marca = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese el modelo");
        String modelo = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese el numero de serie del motor");
        String serialNumber = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese la marca del motor");
        String marcaMotor = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese el tipo de motor");
        String type = interfaz.leerTexto();
        gestor.crearVehiculo(marca,modelo,serialNumber,marcaMotor,type);
        interfaz.imprimirMensaje("El vehiculo y motor han sido registrados.");

    }

}
