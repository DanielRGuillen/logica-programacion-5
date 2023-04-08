import java.util.*;

public class Diccionario {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>(); //  Objeto hashmap que almacena pares de palabras español-inglés.
        diccionario.put("Aprender", "Learn"); // El método .put() se usa para agregar un key-value a un objeto Map
        diccionario.put("Ayudar", "Help");
        diccionario.put("Comenzar", "Start");
        diccionario.put("Desarrollar", "Develop");
        diccionario.put("Diferente", "Different");
        diccionario.put("Escuchar", "Listen");
        diccionario.put("Estudiar", "Study");
        diccionario.put("Explicar", "Explain");
        diccionario.put("Fácil", "Easy");
        diccionario.put("Hablar", "Speak");
        diccionario.put("Interesante", "Interesting");
        diccionario.put("Lento", "Slow");
        diccionario.put("Mejorar", "Improve");
        diccionario.put("Olvidar", "Forget");
        diccionario.put("Poder", "Can");
        diccionario.put("Querer", "Want");
        diccionario.put("Recordar", "Remember");
        diccionario.put("Resolver", "Solve");
        diccionario.put("Seguir", "Follow");
        diccionario.put("Trabajar", "Work");

        // Seleccionar cinco palabras al azar
        List<String> palabras = new ArrayList<String>(diccionario.keySet());
        Collections.shuffle(palabras); // El método shuffle es un método de la clase Collections de Java que se utiliza para mezclar los elementos de una lista en un orden aleatorio
        List<String> palabrasAleatorias = palabras.subList(0, 5);

        // Pedir al usuario que ingrese la traducción en inglés de cada palabra y comprobar las respuestas
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (int i = 0; i < 5; i++) {
            String palabra = palabrasAleatorias.get(i);
            String traduccion = diccionario.get(palabra);

            System.out.print("¿Cuál es la traducción en inglés de la palabra \"" + palabra + "\"? ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase(traduccion)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es \"" + traduccion + "\".");
                respuestasIncorrectas++;
            }
        }

        // Mostrar el resultado final
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}