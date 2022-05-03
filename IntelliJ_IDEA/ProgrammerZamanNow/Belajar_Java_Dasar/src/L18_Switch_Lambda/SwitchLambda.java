package L18_Switch_Lambda;

public class SwitchLambda {
    public static void main(String[] args) {
        /*
         * Dikenalkan sejak java 14
         * tidak perlu mengetikkan kata kunci break untuk berhenti pada switch
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

        switch (grade) {
            case "A" -> {
                System.out.println("Wow Anda Lulus Dengan Baik");
            }
            case "B", "C" -> {
                System.out.println("Anda Lulus");
            }
            case "D"-> {
                System.out.println("Anda Tidak Lulus");
            }
            default-> {
                System.out.println("Mungkin Anda salah jurusan");
            }
        }
    }
}
