package ejercicios.Ejercicio11;

public class Tarea {
    String titulo;
    String descripcion;
    boolean completada;

    public Tarea(String titulo, String descripcion, boolean completada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completar() {
        this.completada = true;
        System.out.println("Tarea: " + this.titulo + " completada");
    }

    //un ovveride porque el metodo defecto que esta inherado de la clase Object creo por defecto devuelve la referencia del objecto
    @Override
    public String toString() {
        return "Titulo: " + this.titulo + ", Descripcion: " + this.descripcion + ", Completada: " + this.completada;
    }
}
