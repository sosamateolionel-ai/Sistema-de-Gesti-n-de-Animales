public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    // Comportamiento genérico: las subclases lo especializan
    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido indefinido.");
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + (edad == 1 ? " año)" : " años)");
    }
}