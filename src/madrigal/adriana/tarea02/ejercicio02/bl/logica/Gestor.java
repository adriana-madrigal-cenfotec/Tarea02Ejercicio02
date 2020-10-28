package madrigal.adriana.tarea02.ejercicio02.bl.logica;

import madrigal.adriana.tarea02.ejercicio02.bl.entidades.Motor;
import madrigal.adriana.tarea02.ejercicio02.bl.entidades.Vehiculo;

import java.util.ArrayList;

public class Gestor {
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    ArrayList<Motor> motores = new ArrayList<>();


    public void crearVehiculo(String marca, String modelo, String serialNumber, String marcaMotor, String type){
        Motor motor = new Motor(serialNumber, marcaMotor, type);
        Vehiculo vehiculo= new Vehiculo(marca,modelo,motor);

        vehiculos.add(vehiculo);
        motores.add(motor);
    }

    public ArrayList<Vehiculo> listarVehiculoMotor(){
        return  this.vehiculos;
    }
}
