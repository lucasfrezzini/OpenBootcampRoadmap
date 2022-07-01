import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.edad = 30;
        cliente.telefono = 123444;
        cliente.nombre = "Pedro Aznar";
        cliente.credito = 11000;
        
        System.out.println("El cliente: " + cliente.nombre + " tiene " + cliente.edad + " años, su telefono es: " + cliente.telefono + " y su credito es: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 33;
        trabajador.telefono = 12322444;
        trabajador.nombre = "Javier Milei";
        trabajador.salario = 1800;
        
        System.out.println("El trabajador: " + trabajador.nombre + " tiene " + trabajador.edad + " años, su telefono es: " + trabajador.telefono + " y su salario es: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}