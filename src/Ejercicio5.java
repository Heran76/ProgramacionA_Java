
    /*
    Dentro de una clase joven tenemos la variable enteras de edad, nivelEstudios e ingresos.
    Necesitamos almacenar en la variable booleana jasp el valor:
      * Verdadero, Si la edad es menor o igual a 28, el nivelEstudios es mayor que tres y lon ingresos superan
      los 28.000 euros-
      * Falso. En caso contrario.
     Escribe el código necesario. ( 2 lineas)
    */
    public class Ejercicio5 {
        static class joven {
            public static void main(String[] args) {
                int edad = 25, nivelEstudios = 4, ingresos = 30000;
                boolean jasp = (edad <= 28) && (nivelEstudios > 3) && (ingresos > 28000);
                System.out.println(jasp);
            }
        }
    }