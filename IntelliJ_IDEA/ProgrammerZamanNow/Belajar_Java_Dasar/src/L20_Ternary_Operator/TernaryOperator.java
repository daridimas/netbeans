package L20_Ternary_Operator;

public class TernaryOperator {
    public static void main(String[] args) {
        /*
         * Operator sederhana dari if statement
         * Ternary operator terdiri dari :
         * 1. Kondisi yang di evaluasi
         * 2. Jika True, maka nilai pertama yang diambil
         * 3. Bila False, maka nilai kedua yang diambil
         */

        var nilai = 75;
        String ucapan1;

        // IF Else 'Tanpa' Ternary Operator
        if (nilai >= 75) {
            ucapan1 = "Selamat Anda Lulus";
        } else {
            ucapan1 = "Silakan Coba Lagi";
        }
        System.out.println(ucapan1);


        // IF Else dengan Ternary Operator
        String ucapan2 = nilai >= 75 ? "Selamat Anda Lulus" : "Silakan Coba Lagi";
        System.out.println(ucapan2);

    }
}
