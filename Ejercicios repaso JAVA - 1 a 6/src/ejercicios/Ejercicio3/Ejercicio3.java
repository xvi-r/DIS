package ejercicios.Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String prioridad;

        while (true) {
            try {
                System.out.print("Entra un numero entre 1 y 3: ");
                numero = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Tienes que entrar un numero");
                //Limpiar el input buffer
                scanner.nextLine();
                continue;
            }
            prioridad = asignarPrioridad(numero);
            if (!prioridad.equals("Invalido")) {
                break;
            }
            System.out.println("Solo numeros entre 1 y 3!");

            continue;


        }

        System.out.println("Prioridad: " + prioridad);


    }


    public static String asignarPrioridad(int numero) {
        switch (numero) {
            case 1:
                return "Baja";
            case 2:
                return "Media";
            case 3:
                return "Alta";
            default:
                return "Invalido";
        }
    }
}
