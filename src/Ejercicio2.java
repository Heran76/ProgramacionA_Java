public class Ejercicio2 {
    /*
     Escribe un programa Java que realice lo siguiente : declarer una variable N de tipo int
     una variable  A de tipo double y una variable C de tipo char y asigna a cada un valor
     A continuación muetra por pantalla
     el valor  de cada variable
     la suma de N + A
     la diferencia de A - n
     El valor numérico correspondiente al carácter que contiene la variable C
    */
    public static void main(String[] arg){
        int n = 56;
        double A = 42.2;
        char c = 'a';
        System.out.println("El valor de N es = " + n);
        System.out.println("El valor de A es = " + A);
        System.out.println("El valor d C es = " + c);
        System.out.println("La suma de N + A es = "+ (n + A));
        System.out.println("La diferencia de A - N es = " + (n - A));
        System.out.println("El valor numérico del caracter que contiene c es = " + c + " = " + (int)c);

    }
}
