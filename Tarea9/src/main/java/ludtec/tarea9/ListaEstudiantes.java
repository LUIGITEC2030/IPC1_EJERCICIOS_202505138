package ludtec.tarea9;

/**
 *
 * @author LudTec
 */
public class ListaEstudiantes {
    private NodoEstudiante head;

    public ListaEstudiantes() {
        head = null;
    }
    
    // INSERTA AL INICIO DE LA LISTA
    public void agregarInicio(String carnet, String nombre, double nota) {
        // Creando nuevo Nodo
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        // El nuevo nodo tomará como siguiente a la cabeza actual
        nuevo.setNext(head);
        // La cabeza de la lista sera igual al nuevo
        head = nuevo;
    }

    // INSERTA AL FINAL DE LA LISTA
    public void agregarFinal(String carnet, String nombre, double nota) {
        // Creando nuevo Nodo
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);

        // Validando que la lista no esé vacia
        if (head == null) {
            head = nuevo;
            return;
        }

        // Creando un nodo temporal para validar
        NodoEstudiante temp = head;
        // Donde la referencia sea null ahí es el final de la lista
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        
        // Aqui se insertará el valor
        temp.setNext(nuevo);
    }

    // ELIMINA NODO CON CARNET PASADO POR PARAMETRO
    public void eliminarPorCarnet(String carnet) {
        // Validando que no esté vacia
        if (head == null) return;

        // La lista solo tiene una lista
        if (head.getCarnet().equals(carnet)) {
            head = head.getNext();
            return;
        }

        NodoEstudiante temp = head;

        // Recorriendo toda la lista hasta encontrar el valor
        while (temp.getNext() != null) {
            if (temp.getNext().getCarnet().equals(carnet)) {
                temp.setNext(temp.getNext().getNext());
                return;
            }
            temp = temp.getNext();
        }
    }

    // BUSCAR POR CARNET PASADO POR PARAMETRO
    public NodoEstudiante buscarPorCarnet(String carnet) {
        NodoEstudiante temp = head;

        // Recorre toda la lista hasta encontrar el carnet
        while (temp != null) {
            if (temp.getCarnet().equals(carnet)) {
                return temp;
            }
            temp = temp.getNext();
        }

        // Si no lo encuentra retornará null
        return null;
    }

    // Imprimir lista en orden
    public void imprimirLista() {
        NodoEstudiante temp = head;

        // Recorre toda la lista mostrando valores
        while (temp != null) {
            System.out.println(
                temp.getCarnet() + " - " +
                temp.getNombre() + " - " +
                temp.getNota()
            );
            temp = temp.getNext();
        }
    }

    // PROMEDIO
    public double obtenerPromedio() {
        if (head == null) return 0;

        double suma = 0;
        int count = 0;

        NodoEstudiante temp = head;

        while (temp != null) {
            suma += temp.getNota();
            count++;
            temp = temp.getNext();
        }

        return suma / count;
    }

    // MEJOR NOTA
    public NodoEstudiante obtenerMejorNota() {
        if (head == null) return null;

        NodoEstudiante mejor = head;
        NodoEstudiante temp = head;

        while (temp != null) {
            if (temp.getNota() > mejor.getNota()) {
                mejor = temp;
            }
            temp = temp.getNext();
        }

        return mejor;
    }
} 
