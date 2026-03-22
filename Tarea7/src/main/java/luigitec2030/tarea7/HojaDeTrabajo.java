/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luigitec2030.tarea7;

/**
 *
 * @author Luigi Tec
 */
public class HojaDeTrabajo extends Actividad{
    public HojaDeTrabajo(String titulo, String descripcion, String fechaDeEntrega){
        super(titulo, descripcion, fechaDeEntrega);
    }
    
    @Override
    public void mostrar(){
        System.out.println("Hoja de Trabajo: ");
        mostrarDatos();
    }
}
