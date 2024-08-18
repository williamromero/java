import java.util.Arrays;

public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println("Valor PI: " + Math.PI);
        System.out.println(Math.ceil(x));   // Retorna entero hacia arriba
        System.out.println(Math.floor(x));  // Retorna entero hacia abajo;
        System.out.println(Math.pow(x, y)); // Retorna número elevado a otro;
        System.out.println(Math.max(x, y)); // Retorna número mayor
        System.out.println(Math.sqrt(y));   // Retorna raiz cuadrada

        // Retorna el área de círculo | Pi * radio²
        System.out.println("Área Círculo: " + Math.PI * Math.pow(y, 2));

        // Retorna el área de una esfera | 4 * PI * radio²
        System.out.println("Área Esfera: " + 4 * Math.PI * Math.pow(y, 2));
    }
}
