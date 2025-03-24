package tema10.ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList(new String[]{
                "Hola Mundo",
                "Adios Mundo",
                "Hola de nuevo",
                "Adios de nuevo"
        });
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("src/tema10/ejercicio2/fichero.txt"));
            for (String s : lista) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
