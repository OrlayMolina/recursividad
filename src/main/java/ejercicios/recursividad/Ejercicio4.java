package ejercicios.recursividad;

public class Ejercicio4 {

    public static void main( String[] args ) {
        int repeticiones=0;
        int valorBuscado = 2;
        int[] arreglo = {2,2,4,6,4,2,7,8};
        repeticiones = contarRepeticiones(arreglo,0,arreglo.length-1,valorBuscado);
        System.out.println("El elemento "+ valorBuscado +" aparece un total de "+ repeticiones);
    }

    public static int contarRepeticiones(int[] arreglo, int inicio, int fin, int valorBuscado) {
        if (inicio > fin) {
            return 0;
        }
        int contador = contarRepeticiones(arreglo, inicio + 1, fin, valorBuscado);
        if (arreglo[inicio] == valorBuscado) {
            contador++;
        }
        return contador;
    }
}
