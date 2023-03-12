package ejercicios.recursividad;

public class Ejercicio2 {

    public static void main( String[] args ) {
        String palabra = "NATO";
        int tamano = 0;
        String palabraAlReves = voltearPalabra(palabra);
        System.out.println("La palabra al reves es: "+ palabraAlReves);
    }

    public static String voltearPalabra(String palabra){
        String palabraInvertida = "";
        if(palabra.length()==0){
            return palabra;
        }else{
            char primerCaracter = palabra.charAt(0);
            String restoDeLaPalabra = palabra.substring(1);
            palabraInvertida = voltearPalabra(restoDeLaPalabra);
            return palabraInvertida + primerCaracter;
        }

    }
}
