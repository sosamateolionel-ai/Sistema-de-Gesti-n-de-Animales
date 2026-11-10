public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau");
    }

    // Método particular de Perro
    public void traerPelota() {
        System.out.println(nombre + " corre y trae la pelota.");
    }
}