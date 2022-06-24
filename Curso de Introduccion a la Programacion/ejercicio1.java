public class Main {
    
    public static void main(String[] args) {
        // Primera parte
        int resultado = SumandoNumeros(23, 55, 66);
        System.out.println(resultado);

        // Segunda parte
        Coche miAutito = new Coche();
        miAutito.aumentarPuertas();
        miAutito.aumentarPuertas();

        System.out.println(miAutito.puertas);
    }


    // Primera parte:
        //Crear una función con tres parámetros que sean números que se suman entre sí.
        //Llamar a la función en el main y darle valores.

    public static int SumandoNumeros(int a, int b, int c) {
        return a + b + b;
    }

}



// Segunda parte:
    // Crear una clase coche.
    // Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    // Una función que incremente el número de puertas que tiene el coche.
    // Crear un objeto miCoche en el main y añadirle una puerta.
    // Mostrar el número de puertas que tiene el objeto.

class Coche {
    public int puertas = 2;
    
    public void aumentarPuertas() {
        this.puertas++;
    }
}