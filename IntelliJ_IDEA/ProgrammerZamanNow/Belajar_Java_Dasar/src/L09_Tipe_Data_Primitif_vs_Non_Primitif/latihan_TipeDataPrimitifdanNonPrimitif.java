package L09_Tipe_Data_Primitif_vs_Non_Primitif;

public class latihan_TipeDataPrimitifdanNonPrimitif {
    public static void main(String[] args) {
        /*
         * Beda tipe data primitif dan non primitif adalah :
         * 1. Default Value data primitif (int, char, boolean, dll) itu adalah 0
         * 2. Sedangkan untuk non data primitif (Integer, CHaracter, Boolean) tidak memiliki nilai default
         *    value sehingga jika tidak ada isinya akan bernilai null
         * 3. Tipe data non primitif bisa memiliki method/ function
         * 4. tipe data non primitif berbentuk tipe data objek contohnya String
         * 5.
         *
         * contoh penggunaan tipe data non primtif seperti di bawah ini
         */

        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Boolean iniBoolean = true;

        Short iniShort; // null
        iniShort = 100;

        /* Byte iniByte;
         * System.out.println(iniByte); // harus di inisialisasi dulu
         */

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        /*
         * Untuk melakukan parsing atau konversi dari tipe data primitif ke non primitif bisa melakukan
         */

        int iniInt = 100;
        Integer iniInteger2 = iniInt; // konversi dari primitif ke non primitif

        System.out.println(iniInteger2);

    }
}
