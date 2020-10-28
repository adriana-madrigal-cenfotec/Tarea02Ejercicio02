package madrigal.adriana.tarea02.ejercicio02.UI;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void showMenu(){
        output.println("Bievenido al sistema de registro vehiculos de AMACO group: escoja una opcion:");
        output.println("1. Registrar vehiculo y el motor");
        output.println("2. Listar vehiculo y el motor");
        output.println("3. Salir");
    }

    public int leerOpcion() {
        output.println("Su opcion es: ");
        return input.nextInt();
    }


    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }

    public String leerTexto() {
        return input.next();
    }
}
