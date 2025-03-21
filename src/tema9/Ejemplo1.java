package tema9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {

        try{
            calculaDivision();
        } catch (Exception e){
            System.out.println("No se puede dividir por 0, intenta de nuevo.");
        }
    }

    public static void calculaDivision() throws Exception {
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        int num3 = num / num2;
        System.out.println("El resultado de la división es: " + num3);

    }
}
