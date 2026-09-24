package ejercicios.Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {

        Tarea tarea = new Tarea("Dormir", "Dormir en una cama", false);
        Tarea tarea2 = new Tarea("Comer", "Comer el pescado en la nevera", false);
        Tarea tarea3 = new Tarea("Deberes", "Hacer los deberes", true);
        System.out.println(tarea);

        tarea.setDescripcion("Comer comida");

        System.out.println(tarea);
        System.out.println(tarea2);
        System.out.println(tarea3);
    }
}