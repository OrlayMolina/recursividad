package ejercicios.recursividad;

public class Ejercicio3 {

    public static void main( String[] args ) {
        int fila = 0;
        int columna = 0;
        int[][] matriz ={{1,2,4,3},{2,3,2,3},{5,4,1,2},{3,5,2,3}};
        int suma = sumaMatriz(matriz, matriz.length-1, matriz.length-1);
        System.out.println("suma de toda la matriz: " + suma);
    }

    public static int sumaMatriz(int[][] matriz, int fila, int columna) {
        if (fila < 0 || columna < 0) {
            return 0;
        }
        int suma = matriz[fila][columna] + sumaMatriz(matriz, fila, columna - 1);
        if (columna == 0) {
            suma += sumaMatriz(matriz, fila - 1, matriz[0].length-1);
        }
        return suma;
    }
}
