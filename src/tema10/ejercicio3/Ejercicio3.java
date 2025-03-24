package tema10.ejercicio3;

import java.io.*;
import java.util.Scanner;

/**
 * Ejercicio 3:Diseña un programa Java que solicite palabras (sin espacios) al usuario (método
 * next() de Scanner) y las guarde en un archivo. El proceso de petición finaliza cuando
 * el usuario teclee “fin”, que no debe escribirse en el archivo.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw;
        try{
            bw = new BufferedWriter(new FileWriter("src/tema10/ejercicio3/palabras.txt"));
            System.out.println("Introduce palabras (sin espacios). Para finalizar escribe 'fin'");
            String palabra = sc.next();
            while(!palabra.equals("fin")){
                bw.write(palabra);
                System.out.println("Introduce otra palabra");
                palabra = sc.next();
            }
            bw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }







    }
}
