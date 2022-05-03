package L16_IF_Statement;

public class ElseIFStatement {
    public static void main(String[] args) {
        /*
         * Kadang kita butuh membuat beberapa kondisi
         * Else IF bisa digunakan untuk mengecek hal ini
         */


        var nilai = 70;
        var absen = 70;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
