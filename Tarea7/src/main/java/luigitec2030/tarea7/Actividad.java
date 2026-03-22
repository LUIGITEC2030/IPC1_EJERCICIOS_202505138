package luigitec2030.tarea7;

/**
 *
 * @author Luigi Tec
 */
public abstract class Actividad {
    private String titulo, descripcion, fechaDeEntrega;

    public Actividad(String titulo, String descripcion, String fechaDeEntrega){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaDeEntrega = fechaDeEntrega;
    }
    
    public void mostrarDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Fecha de Entrega: " + fechaDeEntrega);
        System.out.println("");
    }
    
    public abstract void mostrar();
    
}
