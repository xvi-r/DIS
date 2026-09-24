package ejercicios.Ejercicio11;

import java.util.ArrayList;

public class Ejercicio11 {
    public static void main(String[] args) {

        //se podria definir lo como una variable de clase tambien y evitar tener que pasar lo a la funcion
        ArrayList<Tarea> tareas = new ArrayList<>();
        tareasHelper("Dormir", "Dormir en la cama", false, tareas);
        tareasHelper("Limpiar", "Limpiar la habitacion", true, tareas);
        tareasHelper("Pasear", "Pasear Con El Pero", true, tareas);
        tareasHelper("Deberes", "Hacer los deberes", false, tareas);
        tareasHelper("Comer", "Comer la pizza", true, tareas);



        mostrarTareas(getTareasPendientes(tareas));
        System.out.println();
        mostrarTareas(getTareasCompletadas(tareas));
    }

    public static void tareasHelper(String titulo, String descripcion, boolean completada, ArrayList<Tarea> tareas) {
        //van estar generado no completadas por defecto
        Tarea tarea = new Tarea(titulo, descripcion, completada);
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

        //meto el try simplemente como ejemplo, pero funcionaria si alguien inserte una tarea null etc
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

    public static ArrayList<Tarea> getTareasPendientes(ArrayList<Tarea> tareas) {
        ArrayList<Tarea> tareasPendientes = new ArrayList<>();

        for (Tarea tarea : tareas) {
            try {
                if (!tarea.isCompletada()) {
                    tareasPendientes.add(tarea);
                }
            } catch (NullPointerException e) {
                continue;
            }
        }

        return tareasPendientes;
    }


    public static ArrayList<Tarea> getTareasCompletadas(ArrayList<Tarea> tareas) {
        ArrayList<Tarea> tareasCompletadas = new ArrayList<>();

        for (Tarea tarea : tareas) {
            try {
                if (tarea.isCompletada()) {
                    tareasCompletadas.add(tarea);
                }
            } catch (NullPointerException e) {
                continue;
            }
        }

        return tareasCompletadas;
    }
}