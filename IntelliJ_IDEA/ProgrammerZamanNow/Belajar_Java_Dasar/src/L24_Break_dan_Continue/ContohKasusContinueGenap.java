package L24_Break_dan_Continue;

public class ContohKasusContinueGenap {
    public static void main(String[] args) {
        /*
         * Contoh kasus continue
         * Untuk mengambil bilangan Ganjil saja
         * Jika ketemu bilangan Genap, maka kode akan dilewatkan atau perulangan saat itu diberhentikan
         *
         * untuk contoh ada di file ContohKasusContinueGanjil
         */

        for (var counter = 1; counter <= 100; counter++) {
            if (counter %2 == 1) { // Jika Counter adalah angka yang sisa hasil baginya bernilai satu
                continue; // maka perulangan dilewatkan
            }

            System.out.println("Perulangan Genap " + counter);
        }
    }
}
