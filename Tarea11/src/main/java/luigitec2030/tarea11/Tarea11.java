package luigitec2030.tarea11;

import java.util.Scanner;

public class Tarea11 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Validar Carnet");
            System.out.println("2. Validar Correo USAC");
            System.out.println("3. Validar Telefono GT");
            System.out.println("4. Extraer Fechas");
            System.out.println("5. Extraer Correos");
            System.out.println("6. Censurar Datos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese carnet: ");
                    String carnet = sc.nextLine();
                    System.out.println(
                        Ejercicio1.buscarCarnet(carnet) ? "Valido" : "Invalido"
                    );
                    break;

                case 2:
                    System.out.print("Ingrese correo: ");
                    String correo = sc.nextLine();
                    System.out.println(
                        Ejercicio1.buscarCorreoUSAC(correo) ? "Valido" : "Invalido"
                    );
                    break;

                case 3:
                    System.out.print("Ingrese telefono: ");
                    String tel = sc.nextLine();
                    System.out.println(
                        Ejercicio1.buscarTelefonoGT(tel) ? "Valido" : "Invalido"
                    );
                    break;

                case 4:
                    System.out.println("\n--- Fechas encontradas ---");
                    Ejercicio2.extractorFechas();
                    break;

                case 5:
                    System.out.println("\n--- Correos encontrados ---");
                    Ejercicio2.extractorCorreos();
                    break;

                case 6:
                    System.out.print("Ingrese texto a censurar: ");
                    String texto = sc.nextLine();
                    Ejercicio2.censuradorDeDatos(texto);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
