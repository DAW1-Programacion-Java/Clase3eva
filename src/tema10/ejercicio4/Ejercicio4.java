package tema10.ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static List<String> leerLineas(String ruta) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String l;
            while ((l= br.readLine()) != null) {
                lineas.add(l);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lineas;
    }
}
