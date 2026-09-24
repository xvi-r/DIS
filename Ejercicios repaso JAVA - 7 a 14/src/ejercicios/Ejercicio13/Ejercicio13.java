package ejercicios.Ejercicio13;

public class Ejercicio13 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Proyecto DI");

        proyecto.addTarea(new Tarea("Construir", "Construir Casas", false));
        proyecto.addTarea(new Tarea("Diseñar", "Diseñar Planos", true));
        proyecto.addTarea(new Tarea("Comprar", "Comprar Materiales", false));
        proyecto.addTarea(new Tarea("Contratar", "Contratar Trabajadores", true));
        proyecto.addTarea(new Tarea("Presupuestar", "Preparar el presupuesto", false));
        proyecto.addTarea(new Tarea("Revisar", "Revisar los planos", true));
        proyecto.addTarea(new Tarea("Excavar", "Preparar los cimientos", false));
        proyecto.addTarea(new Tarea("Instalar", "Instalar electricidad", false));
        proyecto.addTarea(new Tarea("Pintar", "Pintar las habitaciones", true));
        proyecto.addTarea(new Tarea("Inspeccionar", "Realizar la inspección final", false));

        System.out.println(proyecto.getNombre() + '\n');

        System.out.println("Total de Tareas = " + proyecto.getNumeroTareas());
        System.out.println("Completadas = " + proyecto.getNumeroCompletadas());
        System.out.println("Pendientes = " + proyecto.getNumeroPendientes());

    }
}
