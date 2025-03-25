package tema10.ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //List<String> lista = new ArrayList<>();

        System.out.println("Introduce una palabra a buscar:");
        String palabra = sc.nextLine();
        System.out.println("Buscando la palabra: " + palabra);
        System.out.println("*******************************");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/tema10/ejercicio6/texto.txt"));
            String linea;
            int contador = 1;
            while ((linea = br.readLine()) != null) {
                if(linea.contains(palabra)){
                    System.out.println("Encontrada en la lineas "+ contador + ": " + linea);
                }
                contador++;
                //lista.add(linea);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}