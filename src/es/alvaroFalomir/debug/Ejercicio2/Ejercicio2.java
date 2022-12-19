package es.alvaroFalomir.debug.Ejercicio2;


public class Ejercicio2 {

    public static void main(String[] args) {

        int aleatorio = devuelveNumeroAleatorio(80, 160); // devuelve un valor entre 80 y 160
        long sum = 0;

        System.out.println("El valor de la variable aleatorio es " + aleatorio);

        /* Cambiar mediante el explorador de variables del debugger el valor 
         * de la varible aleatorio para que sea mayor de 100_000
         */
        if (aleatorio > 100000) {

            //Antes de entrar en el bucle for cambiar la variable aleatorio a su valor original
            for (int i = 0; i < aleatorio; i++) {
                for (int j = aleatorio; j > 0; j--) {
                    sum = sum + sumame(i, j);
                    System.out.println("resultado de las sumas(" + i +","+j+") = " + sum);
                }
            }
        }
    }

    //Devuelve un numero aleatorio entre ini y fin
    public static int devuelveNumeroAleatorio(int ini, int fin) {
        return (int) Math.floor(Math.random() * (fin - ini) + 1 + ini);
    }

    public static long sumame(int a, int b) {
        long res = a + b;
        return res;
    }

}
