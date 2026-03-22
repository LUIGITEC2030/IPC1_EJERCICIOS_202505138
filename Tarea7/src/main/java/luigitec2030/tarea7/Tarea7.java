

package luigitec2030.tarea7;

/**
 *
 * @author Luigi Tec
 */
import java.util.Scanner;

public class Tarea7 {
    private static Scanner sc = new Scanner(System.in);
    
    // Arreglos que contendrán los datos del sistema
    private static Curso[] cursos = new Curso[10];
    private static TutorAcademico[] tutores = new TutorAcademico[5];
    // Contadores 
    private static int totalCursos = 0, totalTutores = 0;
    
    public static void main(String[] args) {
        TutorAcademico tutor1 = new TutorAcademico("Diego Robles", "IPC12026");
        TutorAcademico tutor2 = new TutorAcademico("Kevin Salvatierra", "CA2026");
        tutores[0] = tutor1;
        tutores[1] = tutor2;
        totalTutores++;
        totalTutores++;
 
        menu();
    }
    
    public static void menu(){
        // Inicializando tutores

        String op;
        
        do{
            System.out.println("========================================");
            System.out.println("Gestion de Cursos y asignacion de tareas");
            System.out.println("========================================");
            System.out.println("1. Crear Curso");
            System.out.println("2. Agregar Tareas");
            System.out.println("3. Mostrar cursos y sus tareas");
            System.out.println("4. Salir");
            System.out.println("----------------------------------------");
            System.out.print("Op: ");
            op = sc.nextLine();

            switch(op){
                case "1":
                    boolean creado = crearCurso();
                    if (creado){
                        System.out.println("");
                        System.out.println("Curso agregado correctamente");
                        System.out.println("");
                    }
                    break;
                case "2":
                    boolean agregado = agregarActividad();
                    
                    if(agregado){
                        System.out.println("");
                        System.out.println("Actividad agregada exitosamente");
                    }
                    break;
                case "3":
                    mostrarDatos();
                    break;
                default:
                    if (op.equals("4")){
                        System.out.println("Saliendo......");
                    } else {
                        System.out.println("Ingresa una opcion valida");
                    }
        }} while (!op.equals("4"));
    }
    
    public static boolean crearCurso(){
        // Seleccionar el Tutor
        if (totalTutores == 0){
            return false;
        }
        
        System.out.println("============ Selecciona Tutor ============");
        for (int i = 0; i < totalTutores; i++){
            TutorAcademico tutor = tutores[i];
            System.out.println(i + 1 + ". " + tutor.getNombre());
        }
        System.out.print("Op: ");
        int nTutor = Integer.parseInt(sc.nextLine());
        
        TutorAcademico tutor = tutores[nTutor - 1];
        String nombreTutor = tutor.getNombre();
        
        // Solicitando datos para crear el objecto
            System.out.println("");
            System.out.println("============ Crear Curso ============");
            System.out.print("Código del curso: ");
            String codigoCurso = sc.nextLine();
            System.out.print("Nombre Curso: ");
            String nombreCurso = sc.nextLine();
            
            // Creando el objeto
            Curso c = new Curso(codigoCurso, nombreCurso, nombreTutor);    
            cursos[totalCursos] = c;
            totalCursos++;
             
            return true;
    }
    
    public static boolean agregarActividad(){
        // Buscar a cual curso asignarle la tarea
        
        System.out.println("============ Selecciona Curso ============");
        for (int i = 0; i < totalCursos; i++){
            Curso c = cursos[i];
            System.out.println(i + 1 + ". " + c.getNombre());
        }
        System.out.print("Op: ");
        int nCurso = Integer.parseInt(sc.nextLine());
        
        Curso c = cursos[nCurso - 1];
        
        // Validando que hayan cusos en el sistema
        if (totalCursos == 0) {
            System.out.println("No hay cursos en el sistema");
            return false;
        }

        System.out.println("============ Asignar Actividad ============");
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Descripcion: ");
        String descripcion = sc.nextLine();
        System.out.println("Fecha de Entrega (Formato: (dd/mm/aaaa)");
        String fechaDeEntrega = sc.nextLine();

        int seleccion;
        do {
            System.out.println("");
            System.out.println("========== Tipo de Actividad ==========");
            System.out.println("1. Tarea");
            System.out.println("2. Hoja de Trabajo");
            System.out.print("Op: ");
            seleccion = Integer.parseInt(sc.nextLine());

            switch (seleccion) {
                case 1:
                    Actividad t = new Tarea(titulo, descripcion, fechaDeEntrega);
                    c.agregarActividad(t);
                    break;
                case 2:
                    Actividad ht = new HojaDeTrabajo(titulo, descripcion, fechaDeEntrega);
                    c.agregarActividad(ht);
                    break;
                default:
                    System.out.println("");
                    System.out.println("Ingresa una opcion valida");
            }
        } while (seleccion != 1 && seleccion != 2);

        return true;
    }
    
    public static void mostrarDatos(){
        for(int i = 0; i < totalCursos; i++){
            Curso c = cursos[i];
            if (c != null){
                System.out.println("Curso: " + c.getNombre() + " Tutor: " + c.getTutor());
                c.mostrarActividades();
            }
           
        }
    }
}
