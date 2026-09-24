package ejercicios.Ejercicio10;

import java.util.ArrayList;

public class Ejercicio10 {
    public static void main(String[] args) {

        //se podria definir lo como una variable de clase tambien y evitar tener que pasar lo a la funcion
        ArrayList<Tarea> tareas = new ArrayList<>();
        tareasHelper("Dormir", "Dormir en la cama", tareas);
        tareasHelper(null, null, tareas);
        tareasHelper("Limpiar", "Limpiar la habitacion", tareas);
        tareasHelper("Pasear", "Pasear Con El Pero", tareas);
        tareasHelper("Deberes", "Hacer los deberes", tareas);
        tareasHelper("Comer", "Comer la pizza", tareas);
        tareasHelper(null, null, tareas);


        buscarPorTitulo(tareas, "ar");

    }

    public static void tareasHelper(String titulo, String descripcion, ArrayList<Tarea> tareas) {
        //van estar generado no completadas por defecto
        Tarea tarea = new Tarea(titulo, descripcion, false);
        tareas.add(tarea);

    }

    public static void mostrarTareas(ArrayList<Tarea> tareas) {
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }

    public static void eliminarTarea(int index, ArrayList<Tarea> tareas) {
        try {
            System.out.println(tareas.get(index).getTitulo() + " Eliminado");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe ninguna tarea en esa posición.");
            return;
        }
        tareas.remove(index);
    }

    public static void buscarPorTitulo(ArrayList<Tarea> tareas, String texto) {
        texto = texto.toLowerCase();
        int count = 0;
        String titulo;

        for (Tarea tarea : tareas) {
            try {
                titulo = tarea.getTitulo().toLowerCase();
                if (titulo.contains(texto)) {
                    count++;
                    System.out.println(tarea.getTitulo() + " encontrado");
                }
            } catch (NullPointerException e) {
                continue;
            }

        }
        System.out.println("Se han encontrado " + count + " tareas");
    }
}