public class Ejercicio3 {
    /*
    Realiza un programa en java que dada dos variables a y b, intercambie los valores de a y b
    */
    public static void main(String[] arg){
        int a = 5, b = 8, tmp;
        tmp = a;
        a = b;
        b  = tmp;
        System.out.println("El valor de a ahora es : " + a + " y el de b de es : " + b);
    }
}
