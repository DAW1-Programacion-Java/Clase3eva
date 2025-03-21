package tema9;

import java.util.Scanner;

public class Ejemplo2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            imprimeNombre();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void imprimeNombre() throws Exception {
        System.out.println("Introduce un nombre: ");
        String nom = sc.nextLine();
        if (nom.equals("Mario")) {
            throw new ExceptionMia("Mario no puede jugar que esta castigado");
        }
        System.out.println(nom);

    }
}
