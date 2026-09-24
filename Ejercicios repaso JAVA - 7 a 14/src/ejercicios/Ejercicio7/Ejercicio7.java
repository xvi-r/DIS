package ejercicios.Ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args) {
        Tarea tarea = new Tarea("Dormir", "Dormir en la cama", false);

        System.out.println(tarea + "\n");
        System.out.println("Esta completada " + tarea.getTitulo() + ": " + tarea.isCompletada());

        tarea.completar();

        System.out.println("Esta completada " + tarea.getTitulo() + ": " + tarea.isCompletada());

    }
}