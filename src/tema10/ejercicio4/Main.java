package tema10.ejercicio4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lineas = Ejercicio4.leerLineas("src/tema10/ejercicio4/fichero.txt");
        lineas = Ejercicio4.ordenar(lineas);
        Ejercicio4.escribirLineas(lineas, "src/tema10/ejercicio4/ficheroOrdenado.txt");
    }
}
