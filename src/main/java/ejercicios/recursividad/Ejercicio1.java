package ejercicios.recursividad;

public class Ejercicio1 {

    public static void main( String[] args ) {
        int fila = 0;
        int columna = 0;
        int[][] matriz ={{3,9,12,4},{4,6,10,12},{4,7,12,11},{5,7,9,14}};
        int suma = sumaDiagonal(matriz, matriz.length-1, columna);
        System.out.println("La suma de la diagonal principal: " + suma);
    }

    public static int sumaDiagonal(int[][]matriz, int fila, int columna){
        if(fila <= matriz.length-1 && fila>=0)
            if(columna <= matriz.length-1 && columna>=0)
                if(fila == columna){
                    return matriz[fila][columna] + sumaDiagonal(matriz, fila-1, columna-1);
                }else {
                    columna++;
                    return sumaDiagonal(matriz, fila, columna);
                }
        return 0;
    }
}
