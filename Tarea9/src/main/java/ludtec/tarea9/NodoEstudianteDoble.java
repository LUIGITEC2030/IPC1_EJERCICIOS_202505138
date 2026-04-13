/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludtec.tarea9;

/**
 *
 * @author LudTec
 */
public class NodoEstudianteDoble {
    private String carnet;
    private String nombre;
    private double nota;
    private NodoEstudianteDoble prev;
    private NodoEstudianteDoble next;
    
    public NodoEstudianteDoble(String carnet, String nombre, double nota){
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota = nota;
        
        // Referencias
        this.prev = null;
        this.next = null;
    }
    
    // Getters
    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public NodoEstudianteDoble getPrev() {
        return prev;
    }

    public NodoEstudianteDoble getNext() {
        return next;
    }

    // Setters
    public void setPrev(NodoEstudianteDoble prev) {
        this.prev = prev;
    }

    public void setNext(NodoEstudianteDoble next) {
        this.next = next;
    }
    
    
}
