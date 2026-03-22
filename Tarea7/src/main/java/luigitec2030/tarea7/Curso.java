
package luigitec2030.tarea7;

/**
 *
 * @author Luigi Tec
 */
public class Curso {
    private String codigo, nombre;
    private String tutor;
    private int totalTareas = 0;
    private Actividad[] actividades;

    public Curso(String codigo, String nombre, String tutor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tutor = tutor;
        
        // Arreglo de tareas
        this.actividades = new Actividad[10];
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
    public String getCodigo() {
        return codigo;
    }

   
    public String getNombre() {
        return nombre;
    }

    public String getTutor() {
        return tutor;
    }

    public int getNumTareas(){
        return this.totalTareas;
    }

    // Métodos 
    public void agregarActividad(Actividad t){
        actividades[totalTareas] = t;
        totalTareas++;
    }
    
    public void mostrarActividades(){
        for(Actividad act : actividades){
            if (act != null) act.mostrar();
        }
    }
    
}
