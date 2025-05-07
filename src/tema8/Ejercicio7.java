package tema8;

import java.util.List;

/*
7. Crea una lista de objetos jugadores. La clase Jugador tiene como atributos nombre,
peso y altura..
a. Muestra los nombres de los jugadores en orden ASC
b. Muestra los datos de los jugadores cuyo nombre contiene la “a”
c. Muestra la media de los pesos
d. Mostrar los jugadores con altura superior a la media
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        List<Jugador> jugadores = List.of(
                new Jugador("Juan", 80, 1.80),
                new Jugador("Pedro", 75, 1.75),
                new Jugador("Luis", 90, 1.85),
                new Jugador("Ana", 70, 1.65),
                new Jugador("Maria", 65, 1.60),
                new Jugador("Carlos", 85, 1.90),
                new Jugador("Alberto", 78, 1.82)
        );

        // a. Muestra los nombres de los jugadores en orden ASC
    }
}
