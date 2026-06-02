public class estructura_return {
    public static void main(String[] args){
        int resultado = sumar(10, 5);
        System.out.println("La suma es " + resultado);
    }
    public static int sumar(int a, int b){
        return a + b;
    }
}
