/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luigitec2030.tarea7;

/**
 *
 * @author Luigi Tec
 */
public class TutorAcademico extends Persona{
    private String codigoTutor;
    private Curso[] cursosAsignados;
    private int totalCursos = 0;
    
    public TutorAcademico(String nombre, String codigoTutor) {
        super(nombre);
        this.codigoTutor = codigoTutor;
        this.cursosAsignados = new Curso[5];
    }

    public Curso[] getCursosAsignado() {
        return cursosAsignados;
    }

    public void asignarCurso(Curso c){
        this.cursosAsignados[totalCursos] = c;
    }
}
