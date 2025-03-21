package tema9;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        boolean error = false;
        do {


            try {
                System.out.println("Introduce un número: ");
                int num = sc.nextInt();
                System.out.println("Introduce otro número: ");
                num2 = sc.nextInt();
                num3 = num / num2;
                System.out.println("El resultado de la división es: " + num3);
            } catch(InputMismatchException e){
                System.out.println("Error de entrada/salida");
                error = true;
            } catch (Exception e) {
                System.out.println("No se puede dividir por 0, intenta de nuevo.");
                error = true;
            }
        } while (error);
    }
}