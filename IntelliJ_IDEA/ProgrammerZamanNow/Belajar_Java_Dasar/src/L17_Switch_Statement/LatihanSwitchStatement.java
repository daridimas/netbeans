package L17_Switch_Statement;

public class LatihanSwitchStatement {
    public static void main(String[] args) {
        /*
         * Kadang kita hanya butuh kondisi sederhana di if statement
         * seperti, hanya menggunakan perbandingan == maka kita bisa menggunakan
         * Switch statement dibanding IF Statement
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

        System.out.println("Nilai = " + nilai);
        System.out.println("Absen = " + absen);
        System.out.println("");
        System.out.println("Grade Anda " + grade);

        switch (grade) {
            case "A":
                System.out.println("Wow Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }
    }
}
