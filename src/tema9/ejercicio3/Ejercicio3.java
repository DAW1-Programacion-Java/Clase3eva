package tema9.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            showMenu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showMenu() {
        int opcion = 0;
        try {
            do {
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("3. Opción 3");
                System.out.println("4. Salir");
                System.out.print("Introduce una opción: ");

                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opción 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opción 3");
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        throw new ExceptionFueraMenu("Opción fuera de rango");
                }

            } while (opcion != 4);
        } catch (ExceptionFueraMenu e) {
            System.out.println(e.getMessage());
        }
    }
    /*public static void showMenu() throws Exception {
        int opcion = 0;
        do {
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Introduce una opción: ");

            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Has seleccionado la opción 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    throw new ExceptionFueraMenu("Opción fuera de rango");
            }

        } while (opcion != 4);
    }*/
}
