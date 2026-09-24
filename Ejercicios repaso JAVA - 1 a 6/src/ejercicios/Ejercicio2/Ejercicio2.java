package ejercicios.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        //Consumir el /n dejado por el nextInt
        scanner.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descuento: ");
        double descuento = scanner.nextDouble();

        System.out.println();


        calcularTotal(precio, cantidad, descuento);
    }


        public static void calcularTotal(double precio, int cantidad, double descuento) {

            double subtTotal = cantidad * precio;
            System.out.println("Subtotal: " + subtTotal + " €");

            double descuentoFinal = subtTotal * (descuento / 100);
            System.out.println("Descuento: " + descuentoFinal + " €");

            System.out.println("Total: " + (subtTotal - descuentoFinal) + " €");



        }
}
