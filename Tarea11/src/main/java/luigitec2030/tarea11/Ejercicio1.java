package luigitec2030.tarea11;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

// VALIDADOR DE DATOS DEL ESTUDIANTE
public class Ejercicio1 {
    
    // CARNET UNIVERSITARIO
    public static boolean buscarCarnet(String carnet){
        // 202300123 Válido 
        Pattern patron = Pattern.compile("^(19|20)\\d{2}\\d{5}$");
        Matcher matcher = patron.matcher(carnet);
        return matcher.matches();
    }
    
    // CORREO INSTITUCIONAL USAC
    public static boolean buscarCorreoUSAC(String correo){
        // juan.perez@usac.edu.gt  
        Pattern patron = Pattern.compile("^[^_.][a-zA-Z0-9]+@usac.edu.gt$");
        Matcher matcher = patron.matcher(correo);
        return matcher.matches();
    }
    
    // NÚMERO DE TELÉFONO GUATEMALTECO
    public static boolean buscarTelefonoGT(String numero){
        // 5555-1234 
        Pattern patron = Pattern.compile("^[3-6]{1}\\d{3}-?\\d{4}$");
        Matcher matcher = patron.matcher(numero);
        return matcher.matches();
    } 
}
