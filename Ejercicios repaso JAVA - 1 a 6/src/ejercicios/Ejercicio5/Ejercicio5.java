package ejercicios.Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {

        String[] tareas = {"Comer", "Dormir", "Limpiar Casa", "Pasear con el perro"};
        System.out.println(buscarTarea(tareas, "dorm"));
    }

    public static int buscarTarea(String[] tareas, String texto) {
        int index = 0;
        for (String tarea : tareas) {
            //ahora mismo importa si es mayuscula o no pero se podria usar equalsIgnoreCase()
            if (tarea.equals(texto)) {
                return index;
            }
            index++;
        }
        return -1;
    }
}