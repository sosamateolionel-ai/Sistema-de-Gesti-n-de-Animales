# Sistema de Gestión de Animales

## Descripción
Este proyecto desarrolla un programa de representación de animales utilizando Java y Programación Orientada a Objetos.

Permite crear diferentes tipos de animales, como perros, gatos y pájaros, compartiendo características generales mediante una clase base y especializando sus comportamientos mediante herencia y sobrescritura de métodos.

## Funcionamiento del programa

El programa crea cuatro animales:

- **Perro:** Rocky, de 4 años.
- **Gato:** Misha, de 2 años.
- **Pájaro:** Piolín, de 1 año.
- **Animal genérico:** Bicho, de 3 años.

Primero ejecuta los métodos particulares de cada especie:

1. El perro corre y trae la pelota.
2. El gato ronronea.
3. El pájaro despliega las alas y vuela.

Luego, almacena los cuatro animales en un arreglo de tipo `Animal[]` y recorre sus elementos mediante un ciclo `for`.

Durante el recorrido, muestra los datos de cada animal y ejecuta `hacerSonido()`. Java determina automáticamente qué versión del método utilizar según el tipo real del objeto.

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `Animal` | Clase base que contiene el nombre, la edad y los comportamientos generales. |
| `Perro` | Hereda de `Animal`, redefine el sonido y agrega el método `traerPelota()`. |
| `Gato` | Hereda de `Animal`, redefine el sonido y agrega el método `ronronear()`. |
| `Pajaro` | Hereda de `Animal`, redefine el sonido y agrega el método `volar()`. |
| `Main` | Crea los animales, ejecuta sus métodos y demuestra el polimorfismo. |

## Conceptos de programación aplicados

- **Herencia:** las clases `Perro`, `Gato` y `Pajaro` extienden la clase `Animal`.
- **Polimorfismo:** se utiliza un arreglo `Animal[]` para almacenar diferentes tipos de animales.
- **Sobrescritura de métodos:** cada subclase redefine `hacerSonido()` mediante `@Override`.
- **Constructores con `super()`:** las clases derivadas reutilizan el constructor de la clase base para inicializar nombre y edad.
- **Encapsulamiento:** se utilizan atributos `protected` y métodos getters para acceder a los datos.
- **Métodos específicos:** cada especie incorpora un comportamiento particular que no está disponible en la clase base.
- **Método `toString()`:** permite representar los datos de cada animal como texto, adaptando correctamente la palabra año según corresponda.

## Tecnologías utilizadas

- Lenguaje: Java.
- Entorno de desarrollo: IntelliJ IDEA.
- Paradigma: Programación Orientada a Objetos.

## Ejecución

<img width="476" height="277" alt="image" src="https://github.com/user-attachments/assets/64592fa6-db21-43f4-a188-1409d2156414" />

## Resultado esperado

El programa muestra primero las acciones particulares de cada especie y luego los sonidos correspondientes:

- Rocky dice: Guau.
- Misha dice: Miau.
- Piolín dice: Pío.
- Bicho emite un sonido indefinido.

El último resultado demuestra que la clase base conserva su comportamiento original cuando se instancia directamente.

## Objetivo del ejercicio

Comprender y aplicar los conceptos de herencia, polimorfismo y sobrescritura de métodos, utilizando una clase base común para representar diferentes especies de animales y sus comportamientos específicos.

## Estructura del proyecto

```text
SistemaGestionAnimales/
├── Animal.java
├── Perro.java
├── Gato.java
├── Pajaro.java
├── Main.java
└── README.md
```

**Nombre sugerido para el repositorio:** `sistema-gestion-animales`

## Observación

La clase `Animal` no está declarada como abstracta, por lo que permite crear directamente un animal genérico, como sucede con el objeto `Bicho` en el programa. Si el ejercicio requiere una clase abstracta, será necesario modificar su declaración y adaptar el método `hacerSonido()` y la instancia correspondiente en `Main`.
