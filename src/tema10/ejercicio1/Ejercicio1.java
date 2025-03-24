package tema10.ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args){
        String s = "Hola Mundo";

        FileWriter f = null;
        try {
            f = new FileWriter("src/tema10/ejercicio1/fichero.txt");
            for(char c : s.toCharArray()){
                f.write(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        } finally {
            try {
                f.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }





    }
}
