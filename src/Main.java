//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Perro perro = new Perro("Rocky", 4);
    Gato gato = new Gato("Misha", 2);
    Pajaro pajaro = new Pajaro("Piolín", 1);
    Animal generico = new Animal("Bicho", 3);

    System.out.println("=== MÉTODOS PARTICULARES ===");
    perro.traerPelota();
    gato.ronronear();
    pajaro.volar();

    System.out.println("\n=== SONIDOS (POLIMORFISMO) ===");
    Animal[] zoologico = { perro, gato, pajaro, generico };
    for (Animal a : zoologico) {
        System.out.print(a + " -> ");
        a.hacerSonido();
    }

}
