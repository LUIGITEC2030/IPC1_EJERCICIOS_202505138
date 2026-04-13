package ludtec.tarea9;

/**
 *
 * @author LudTec
 */
public class ListaDobleEstudiantes {
    private NodoEstudianteDoble head;

    public ListaDobleEstudiantes() {
        head = null;
    }

    public void agregarInicio(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);

        if (head != null) {
            head.setPrev(nuevo);
            nuevo.setNext(head);
        }

        head = nuevo;
    }

    public void agregarFinal(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);

        if (head == null) {
            head = nuevo;
            return;
        }

        NodoEstudianteDoble temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(nuevo);
        nuevo.setPrev(temp);
    }

    public void eliminarPorCarnet(String carnet) {
        NodoEstudianteDoble temp = head;

        while (temp != null) {
            if (temp.getCarnet().equals(carnet)) {

                if (temp.getPrev() != null) {
                    temp.getPrev().setNext(temp.getNext());
                } else {
                    head = temp.getNext();
                }

                if (temp.getNext() != null) {
                    temp.getNext().setPrev(temp.getPrev());
                }

                return;
            }
            temp = temp.getNext();
        }
    }

    // ADELANTE
    public void imprimirAdelante() {
        NodoEstudianteDoble temp = head;

        while (temp != null) {
            System.out.println(
                temp.getCarnet() + " - " +
                temp.getNombre() + " - " +
                temp.getNota()
            );
            temp = temp.getNext();
        }
    }

    // ATRÁS
    public void imprimirAtras() {
        if (head == null) return;

        NodoEstudianteDoble temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        while (temp != null) {
            System.out.println(
                temp.getCarnet() + " - " +
                temp.getNombre() + " - " +
                temp.getNota()
            );
            temp = temp.getPrev();
        }
    }

    // INSERTAR ORDENADO POR NOTA
    public void insertarOrdenado(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);

        if (head == null || nota < head.getNota()) {
            agregarInicio(carnet, nombre, nota);
            return;
        }

        NodoEstudianteDoble temp = head;

        while (temp.getNext() != null && temp.getNext().getNota() < nota) {
            temp = temp.getNext();
        }

        nuevo.setNext(temp.getNext());

        if (temp.getNext() != null) {
            temp.getNext().setPrev(nuevo);
        }

        temp.setNext(nuevo);
        nuevo.setPrev(temp);
    }
}

