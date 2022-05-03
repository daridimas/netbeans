package L14_Operasi_Boolean;

public class OperasiBoolean {
    public static void main(String[] args) {
        /*
         * Operasi yang digunakan untuk 2 (dua) data boolean
         */

        var absen = 75;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
