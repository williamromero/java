public class DataTypes {
    public static void main(String[] args) {
        byte small_number  = 126; // 3 decimas hasta 128 || 1 byte
        short short_number = 24259; // 5 décimas         || 2 bytes
        int number         = 1234567890; // 10 décimas   || 4 bytes
        long large_number  = 1234567891255342441L; //    || 8 bytes - Mandatory to use L on final character
        System.out.println(
            "Small Number: " + small_number +
            "\nShort number: " + short_number +
            "\nNumber: " + number +
            "\nLarge number: " + large_number
        );
        System.out.println("ºººººººººººººººººººººººººººººº");
        System.out.println("Bytes por tipo LONG:" + Long.BYTES + "\nValor mínimo: " + Long.MIN_VALUE + "\nValor máximo: " + Long.MAX_VALUE);
        System.out.println("ºººººººººººººººººººººººººººººº");

        char letter = 'A';      // 2 BYTES
        boolean flag = true;    // 2 Bytes

        var salary = 10000.0;
        var pension = salary*0.03;
        var total_salary = 1000 - pension;
        System.out.println("Total salary: $\s" + total_salary);



    }
}
