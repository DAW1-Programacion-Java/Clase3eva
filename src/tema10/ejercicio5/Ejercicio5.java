package tema10.ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("hola", "adios", "buenos días",
                "buenas noches", "buenas tardes");
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("fichero.txt", true));
            for(String s : lista){
                bw.write(s);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
