package ludtec.tarea9;

/**
 *
 * @author LudTec
 */
public class Tarea9 {

    public static void main(String[] args) {
        // Creando una ListaEstudiantes
        ListaEstudiantes lista = new ListaEstudiantes();

        System.out.println("=== PRUEBAS LISTA SIMPLE ===");

        // Quemando datos en la lista
        lista.agregarInicio("202300001", "Ana", 85.0);
        lista.agregarInicio("202300002", "Luis", 90.0);
        lista.agregarFinal("202300003", "Maria", 78.0);

        // Mostrando los valores de la lista simple
        lista.imprimirLista();

        // Buscando carnet especificio
        System.out.println("\nBuscando carnet 202300002:");
        NodoEstudiante encontrado = lista.buscarPorCarnet("202300002");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre());
        }

        // Obteniendo promedios
        System.out.println("\nPromedio: " + lista.obtenerPromedio());

        // Obteniendo la mejor nota
        NodoEstudiante mejor = lista.obtenerMejorNota();
        System.out.println("Mejor estudiante: " + mejor.getNombre());

        // Eliminando por carnet
        lista.eliminarPorCarnet("202300001");

        // Mostrando cambios
        System.out.println("\nDespues de eliminar:");
        lista.imprimirLista();


        // ===============================
        System.out.println("\n=== LISTA DOBLE ===");

        // Creando la lista doble
        ListaDobleEstudiantes listaDoble = new ListaDobleEstudiantes();

        // Agregando valores
        listaDoble.agregarInicio("1", "A", 70);
        listaDoble.agregarFinal("2", "B", 80);
        listaDoble.insertarOrdenado("3", "C", 75);

        // Mostrando las referencias dobles
        // Mostrando hacia adelante
        System.out.println("\nAdelante:");
        listaDoble.imprimirAdelante();

        // Mostrando hacia atrás
        System.out.println("\nAtras:");
        listaDoble.imprimirAtras();

        listaDoble.eliminarPorCarnet("2");

        System.out.println("\nDespues de eliminar:");
        listaDoble.imprimirAdelante();
    }
}
