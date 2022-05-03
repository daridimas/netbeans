package L11_TipeDataArray;

public class Membuat_Array {
    public static void main(String[] args) {
        String[] stringArray; // deklarasi array dengan nama stringArray
        stringArray = new String[3]; // panjang array 3

        /*
         * Bisa dipersingkat menjadi :
         *
         * cara 2
         * String[] stringArray = new String[3];
         *
         * cara 3
         * long[] arrayLong = {10L, 20L, 30L};
         */

        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khannedy";

        // cara akses Array
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Mengubah isi dari Array
        stringArray[2] = "Budi";

        System.out.println(stringArray[2]);

        // Contoh deklarasi dan penentuan panjang array lebih singkat
        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Eko", "Kurniawan", "Khannedy"
        };

        int[] arrayInt = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        // mengetahui panjang array
        System.out.println(arrayLong.length);

        // tidak ada cara menghapus data Array, yang ada hanya mengubah ke nol / null
        // hal ini dikarenakan panjang array di Java sudah fix, tidak bisa dihapus
        // contohnya pengubahan ke nol / null sebagai berikut :

        namaNama[0] = null; // karena datanya ada tipe data non primitif (String)
        arrayLong[0] = 0;

        System.out.println(namaNama[0]);
        System.out.println(arrayLong[0]);

        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0][1]); // kurniawan
        System.out.println(members[1][0]); // Budi
        System.out.println(members[2]); // [Ljava.lang.String;@5594a1b5
    }
}
