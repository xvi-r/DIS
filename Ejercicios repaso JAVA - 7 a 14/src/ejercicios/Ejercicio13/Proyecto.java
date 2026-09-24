package ejercicios.Ejercicio13;

import java.util.ArrayList;

public class Proyecto {
    //final porque supong el nombre no se va a cambiar
    final String nombre;
    final ArrayList<Tarea> tareas = new ArrayList<>();

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public void addTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println(tarea.getTitulo() + " añadido");
    }

    public  void removeTarea(Tarea tarea) {
        tareas.remove(tarea);
        System.out.println(tarea.getTitulo() + " quitado");
    }

    public ArrayList<Tarea> getTareas() {
        return  this.tareas;
    }


    //Ejercicio 13
    public int getNumeroTareas() {
        return this.tareas.size();
    }

    public int getNumeroCompletadas() {
        return getTareasCompletadas().size();
    }

    public int getNumeroPendientes() {
        return getTareasPendientes().size();
    }




    //muevo las metodos del main aqui ya que se hace mas limpio y tiene mas sentido
    //asi que gestionan las tareas de el proyecto

    public void tareasHelper(String titulo, String descripcion, boolean completada) {
        //van estar generado no completadas por defecto
        Tarea tarea = new Tarea(titulo, descripcion, completada);
        this.tareas.add(tarea);
    }

    // en teoria esos metodos ya pordrian ir a la clase Proyecto
    public void mostrarTareas() {
        for (Tarea tarea : this.tareas) {
            System.out.println(tarea);
        }
    }

    //no seria necesario usar this cada vez, solo hace falta si hay variable con el mismo nombre asi puedes
    //decir que esta hablando a la variable que pertence a la clase
    public void eliminarTarea(int index) {
        try {
            System.out.println(tareas.get(index).getTitulo() + " Eliminado");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe ninguna tarea en esa posición.");
            return;
        }
        tareas.remove(index);
    }

    public void buscarPorTitulo(String texto) {
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

    public ArrayList<Tarea> getTareasPendientes() {
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


    public ArrayList<Tarea> getTareasCompletadas() {
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

    public String getNombre() {
        return nombre;
    }
}

