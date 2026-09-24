package ejercicios.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        int index = 1;
        //Usaria un ArrayList pero el ejercicio solo menciona Array
        String[] tareas = {"Estudiar Java", "Preparar práctica", "Revisar ejercicios", "Subir proyecto"};

        for (String tarea : tareas) {
            System.out.println(index + ". " + tarea);
            index++;
        }

    }
}