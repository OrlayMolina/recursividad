package ejercicios.recursividad;

public class Ejercicio5 {

    public static void main( String[] args ) {

        int fila = 0;
        int columna = 0;
        int[][] matriz ={{3,9,12,4},{4,6,10,12},{4,7,12,11},{5,7,9,14}};
        int mayor = filaMayor(matriz, fila, columna);
        System.out.println("La fila con la sumatoria de componentes mayor es: " + mayor);

    }

    public static int filaMayor(int[][]matriz, int fila, int columna) {
        if (fila == matriz.length - 1) {
            return fila;
        }
        int sumaFilaActual = sumaFila(matriz[fila], columna);
        int filaMayorSiguiente = filaMayor(matriz, fila + 1, columna);
        return (sumaFilaActual > sumaFila(matriz[filaMayorSiguiente], columna)) ? fila : filaMayorSiguiente;
    }

    public static int sumaFila(int[] fila, int columna) {
        if (columna == fila.length - 1) {
            return fila[columna];
        }
        return fila[columna] + sumaFila(fila, columna + 1);
    }
}
