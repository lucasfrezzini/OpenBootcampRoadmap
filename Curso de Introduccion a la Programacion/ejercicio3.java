// Crear clase Persona.
// Crear variables las privadas edad, nombre y telefono de la clase Persona.
// Crear gets y sets de cada propiedad.
// Crear un objeto persona en el main.
// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola

public class Main {
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad = 22;
        persona.setTelefono = 2233344;
        persona.setNombre = "Antonio Rios";

        System.out.println("El señor " + persona.getNombre + " tiene " + persona.getEdad + " y su telefono es personal es " persona.getTelefono);
    }

}

public class Persona {
    private int edad;
    private int telefono;
    private String nombre;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public int getTelefono() {
        return telefono;
    }

    // Setters
    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public void setEdad(String newEdad) {
        this.edad = newEdad;
    }

    public void setTelefono(String newTelefono) {
        this.telefono = newTelefono;
    }

}