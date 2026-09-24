package ejercicios.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine().trim();

        int edad = 0;
        boolean edadValida = false;

        while (!edadValida) {
            System.out.print("Introduce tu edad: ");
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                if (edad >= 0) {
                    edadValida = true;
                } else {
                    System.out.println("La edad debe ser un número positivo.");
                }
            } else {
                System.out.println("Por favor, introduce un número válido para la edad.");
                scanner.next(); // Limpiar entrada no válida
            }
        }

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        System.out.println("Dentro de 5 años tendrás " + (edad + 5) + " años.");

        scanner.close();
    }
}

