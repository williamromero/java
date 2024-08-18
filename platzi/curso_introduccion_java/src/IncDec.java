import java.util.Arrays;

public class IncDec {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println("Lives = " + lives);

        lives--; // Decrement
        System.out.println("Lives = " + lives);

        lives++; // Increment
        System.out.println("Lives = " + lives);
        
        int gift = 100 + lives++; // postfijo - Si no es necesario incluir el monto actualizado antes de realizar la operación
        System.out.println("gift = " + gift); // 104
        System.out.println("lives = " + lives); // 5

        gift = 100 + ++lives; // prefijo - Si es necesario incluir en las operaciones de la ejecución
        System.out.println("gift = " + gift); // 106
        System.out.println("lives = " + lives); // 6
    }
}
