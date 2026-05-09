public class Ejercicio4 {
    /*
    Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int,
    dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por pantalla
    * El valor de cada variable
    * La suma de X + y
    * La diferencia X - y
    * El producto X * y
    * El cociente x/y
    * El resto x % Y
    * La suma N + M
    * La diferencia N - M
    * El producto N * M
    * El cociente N / M
    * EL resto N % M
    * La suma X + N
    * El cociente Y / M
    * El resto Y % M
    * El doble de cada variable
    * La suma de todas la variables
    Si por ejemplo  le hemos dado a X el valor 1, a Y el valor 2; a M el valor 3.2 y a N el valor 4.7 se
    debe mostrar por pantalla
    */
    public static void main(String[] arg){
        int x = 40;
        int Y = 10;
        double N = 10.22;
        double M = 5.42;
        System.out.println("[ El valor de las variables ]");
        System.out.println("-------------------------------");
        System.out.println("El valor de X es = " + x);
        System.out.println(" El valor de Y es = " + Y);
        System.out.println(" El valor  de N es " + N);
        System.out.println(" El valor de M es = " + M);
        System.out.println("------------------------------");
        System.out.println(" [ Operaciones ]");
        System.out.println("------------------------------");
        System.out.println(" La suma de X + Y es = " + (x + Y));
        System.out.println(" la diferencia de X - Y es = " + (x-Y));
        System.out.println(" El producto de X * y es = "+ (x*Y));
        System.out.println(" El consciente de X / Y es = "+(x / Y));
        System.out.println(" El resto de X % y es = " + (x%Y));
        System.out.println(" La suma de N + M es = " + ( N + M));
        System.out.println(" La diferencia de N - M  es = " + (N - M));
        System.out.println(" El producto de N * M es = " + (N*M));
        System.out.println(" El cosciente de N/M " + (N/M));
        System.out.println(" El resto de N %M " + (N%M));
        System.out.println(" La suma de X + N es = " + (x + N));
        System.out.println(" El cosciente de Y/M es = " + (Y/M));
        System.out.println(" El resto de Y % M es = " + (Y%M));
        System.out.println("------------------------------");
        System.out.println(" [ El doble de cada variable ]");
        System.out.println("------------------------------");
        System.out.println(" Variable X = " + x + " el doble es " + 2*x);
        System.out.println(" Variable  y = " + Y + " el doble es " + 2*Y);
        System.out.println(" variable  N = " + N + "el doble es "+2*N);
        System.out.println(" variable M es = " + M+ " el doble es "+2*M);
        System.out.println("------------------------------");
        System.out.println(" [la suma de todas las variables]");
        System.out.println("------------------------------");
        System.out.println(x + " + " + Y +" + " + N + " + " + M + " = " +(x+Y+M+N));
        System.out.println("------------------------------");
        System.out.println(" [la multiplicación de todas las variables]");
        System.out.println("------------------------------");
        System.out.println(x + " * " + Y +" * " + N + " * " + M + " = " +(x*Y*M*N));
    }
}
