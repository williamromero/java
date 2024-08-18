public class Casting {
    public static void main(String[] args) {
        double monthlyDogs = 30.0/12.0;
        System.out.println("monthlyDogs = " + monthlyDogs);

        // Estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println("estimatedMonthlyDogs = " + estimatedMonthlyDogs);

        // Exactitud
        int a = 30;
        int b = 12;

        System.out.println(a/b);            // 2
        System.out.println((double) a/b);   // 2.5
        
        double c = a/b;     // 2.0
        System.out.println("c = " + c);
        c = (double) a/b;   // 2.5
        System.out.println("c = " + c);

        char n = 'I';
        int nI = n;     // 73 - Código ascii de la letra I
        System.out.println("nI = " + nI);

        short nS = (short) n;
        System.out.println("nS = " + nS);

        
    }
}
