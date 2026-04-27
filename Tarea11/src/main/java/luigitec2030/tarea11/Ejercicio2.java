package luigitec2030.tarea11;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

// EXTRACTOR Y TRANSFORMADOR DE TEXTO
public class Ejercicio2 {

    public static final String TEXTO =
        "UNIVERSIDAD DE SAN CARLOS DE GUATEMALA \n" +
        "Facultad de Ingeniería — Boletín Informativo 2024-04-25 \n" +
        "Actividades programadas: \n" +
        "- Conferencia el 2024-05-01 a las 10:30 en el Edificio T3 \n" +
        "- Examen parcial el 2024-05-15 a las 08:00 en el Edificio S11 \n" +
        "- Defensa de proyecto el 2024-06-10 a las 14:30 en el Edificio T7 \n" +
        "Contactos del departamento: \n" +
        "- Coordinador:  coord.ipc1@ingenieria.usac.edu.gt   Tel: 2418-8000 \n" +
        "- Auxiliar 1:   aux01_ipc1@ingenieria.usac.edu.gt   Tel: 5555-1234 \n" +
        "- Auxiliar 2:   aux02.ipc1@gmail.com   Tel: 4321-9876";

    // EXTRAER FECHAS
    public static void extractorFechas(){  
        Pattern patron = Pattern.compile("(\\d{4})-((0[1-9]|1[0-2]))-((0[1-9]|[12]\\d|3[01]))");
        Matcher matcher = patron.matcher(TEXTO);
        
        while(matcher.find()){
            String anio = matcher.group(1);
            String mes = matcher.group(2);
            String dia = matcher.group(4);
            
            String resultado = "Anio: " + anio +
                    " Mes: " + mes +
                    " Dia: " + dia;
            
            System.out.println(resultado);
        }
    }
    
    // EXTRAER CORREOS ELECTRÓNICOS
    public static void extractorCorreos(){
        // Correo válido: aux02.ipc1@gmail.com
        Pattern patron = Pattern.compile("[\\w._-]+@[\\w.-]+\\.\\w+");
        Matcher matcher = patron.matcher(TEXTO);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    
    public static void censuradorDeDatos(String input){
        // Número de Telefono
        Pattern patronTelefono = Pattern.compile("\\d{4}-\\d{4}");
        Matcher matchTelefono = patronTelefono.matcher(input);
        
        String resultado = matchTelefono.replaceAll("[TEL]");
        
        // Correo Electronico
        Pattern patronCorreo = Pattern.compile("[\\w._-]+@[\\w._-]+\\.\\w+");
        Matcher matchCorreo = patronCorreo.matcher(resultado);
        
        resultado = matchCorreo.replaceAll("[CORREO]");

        System.out.println(resultado);
    }
}
