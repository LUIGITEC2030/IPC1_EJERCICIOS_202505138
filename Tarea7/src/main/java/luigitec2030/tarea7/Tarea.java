
package luigitec2030.tarea7;

/**
 *
 * @author Luigi Tec
 */
public class Tarea extends Actividad{
    public Tarea(String titulo, String descripcion, String fechaDeEntrega){
        super(titulo, descripcion, fechaDeEntrega);
    }
    
    @Override
    public void mostrar(){
        System.out.println("Tarea: ");
        mostrarDatos();
    }
    
}
