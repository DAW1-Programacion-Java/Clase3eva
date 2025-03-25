package tema10.ejercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio4 {
    public static List<String> leerLineas(String ruta) {
        List<String> lineas = new ArrayList<>();
        BufferedReader br;
        try  {
            br = new BufferedReader(new FileReader(ruta));
            String l;
            while ((l= br.readLine()) != null) {
                lineas.add(l);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lineas;
    }

    public static List<String> ordenar(List<String> lineas) {
        Collections.sort(lineas);
        return lineas;

    }

    public static void escribirLineas(List<String> lineas, String ruta) {

        BufferedWriter bw;
        try{
            bw = new BufferedWriter(new FileWriter(ruta));
            for (String l : lineas) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
