package ejercicios.Ejercicio8;

import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {

        //se podria definir lo como una variable de clase tambien y evitar tener que pasar lo a la funcion
        ArrayList<Tarea> tareas = new ArrayList<>();
        tareasHelper("Dormir", "Dormir en la cama", tareas);
        tareasHelper("Limpiar", "Limpiar la habitacion", tareas);
        tareasHelper("Pasear", "Pasear Con El Pero", tareas);
        tareasHelper("Deberes", "Hacer los deberes", tareas);
        tareasHelper("Comer", "Comer la pizza", tareas);

        mostrarTareas(tareas);



    }

    public static void tareasHelper(String titulo, String descripcion, ArrayList<Tarea> tareas) {
        //van estar generado no completadas por defecto
        Tarea tarea = new Tarea(titulo, descripcion, false);
        tareas.add(tarea);

    }

    public static void mostrarTareas(ArrayList<Tarea> tareas) {
        for(Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}