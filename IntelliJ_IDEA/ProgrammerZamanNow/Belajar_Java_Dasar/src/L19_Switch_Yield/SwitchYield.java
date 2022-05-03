package L19_Switch_Yield;

public class SwitchYield {
    public static void main(String[] args) {
        /*
         * Dikenalkan juga sejak Java 14, digunakan untuk mengembalikan nilai pada switch statement
         * Mempermudah saat butuh membuat data berdasarkan kondisi switch statement
         */

        var nilai = 51;
        var absen = 50;
        var grade = "";

        if (nilai >= 80 && absen >= 80) {
            grade = "A";
        } else if (nilai >= 70 && absen >= 70) {
            grade = "B";
        } else if (nilai >= 60 && absen >= 60) {
            grade = "C";
        } else if (nilai >= 50 && absen >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Contoh Switch "tanpa" kata kunci Yield
        String ucapan1;
        switch (grade) {
            case "A" -> {
                ucapan1 = "Wow Anda Lulus Dengan Baik";
            }
            case "B", "C" -> {
                ucapan1 = "Anda Lulus";
            }
            case "D"-> {
                ucapan1 = "Anda Tidak Lulus";
            }
            default-> {
                ucapan1 = "Mungkin Anda salah jurusan";
            }
        }
        System.out.println(ucapan1);

        // Switch dengan Kata Kunci Yield
        String ucapan2 = switch (grade) {
            case "A" -> {
                yield "Wow Anda Lulus Dengan Baik";
            }
            case "B", "C" -> {
                yield "Anda Lulus";
            }
            case "D"-> {
                yield "Anda Tidak Lulus";
            }
            default-> {
                yield "Mungkin Anda salah jurusan";
            }
        }; // Kalo pake yield harus titik koma

        System.out.println(ucapan2);
    }
}
