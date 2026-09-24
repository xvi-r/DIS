package ejercicios.Ejercicio12;

public class Ejercicio12 {
    public static void main(String[] args) {

        //se podria definir lo como una variable de clase tambien y evitar tener que pasar lo a la funcion
        Proyecto proyecto = new Proyecto("Proyecto DI");

        proyecto.addTarea(new Tarea("Construir", "Construir Casas", false));
        proyecto.addTarea(new Tarea("Diseñar", "Diseñar Planos", false));
        proyecto.addTarea(new Tarea("Comprar", "Comprar Materiales", false));


        proyecto.mostrarTareas();

        //o usando getTareas()

        for(Tarea tarea : proyecto.getTareas()) {
            System.out.println(tarea);
        }

        //quitando una tarea
        proyecto.removeTarea(proyecto.getTareas().get(1));
        System.out.println();

        proyecto.mostrarTareas();



    }


}