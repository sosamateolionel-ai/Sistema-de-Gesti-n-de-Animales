public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Pío");
    }

    // Método particular de Pajaro
    public void volar() {
        System.out.println(nombre + " despliega las alas y vuela.");
    }
}