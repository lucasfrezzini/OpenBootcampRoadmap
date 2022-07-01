import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Cliente clienteA = new Cliente();
        clienteA.edad = 30;
        clienteA.telefono = 123444;
        clienteA.nombre = "Pedro Aznar";
        
        System.out.println("El cliente: " + clienteA.nombre + " tiene " + clienteA.edad + " años y su telefono es: " + clienteA.telefono);
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