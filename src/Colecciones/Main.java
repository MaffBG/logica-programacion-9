package Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("nochebuena", "christmas eve");
        diccionario.put("papá noel", "santa claus");
        diccionario.put("villancico", "carol");
        diccionario.put("estrella", "star");
        diccionario.put("nieve", "snow");
        diccionario.put("belen", "nativity");
        diccionario.put("trineo", "sleigh");
        diccionario.put("pavo", "turkey");
        diccionario.put("copo", "snowflake");
        diccionario.put("luz", "light");
        diccionario.put("flor de pascua", "poinsettia");
        diccionario.put("campana", "bell");
        diccionario.put("candelabro", "candelabra");
        diccionario.put("celebración", "celebration");
        diccionario.put("familia", "family");
        diccionario.put("árbol", "tree");
        diccionario.put("regalo", "gift");
        diccionario.put("renos", "reindeer");
        diccionario.put("muérdago", "mistletoe");
       
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	System.out.println("¡Estás en el diccionario anvideño, ingresa una palabra en español para conocer su traducción al inglés.");
            System.out.print("¡Pst! Tambièn puedes escribir 'salir' para terminar: ");
            String palabraEspañol = scanner.nextLine().toLowerCase();

            if (palabraEspañol.equals("salir")) {
                System.out.println("¡Gracias por usar el diccionario navideño! ¡Nos vemos !");
                break;
            }
        

        if (diccionario.containsKey(palabraEspañol)) {
            System.out.println("La traducción de '" + palabraEspañol + "' al inglés es: " + diccionario.get(palabraEspañol));
        } else {
            System.out.println("¡Lo sieno! La palabra no se encuentra en el diccionario.");
            System.out.println("¡Vamos, inténtalo de nuevo!");
        }
        }
        
        scanner.close();
    }
}