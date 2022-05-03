package L24_Break_dan_Continue;

public class ContohKasusContinueGanjil {
    public static void main(String[] args) {
        /*
         * Contoh kasus continue
         * Untuk mengambil bilangan Ganjil saja
         * Jika ketemu bilangan Genap, maka kode akan dilewatkan atau perulangan saat itu diberhentikan
         *
         * untuk contoh ada di file ContohKasusContinueGanjil
         */

        for (var counterin = 1; counterin <= 100; counterin++) {
            if (counterin %2 == 0) { // Jika Counter adalah angka yang tidak ada sisa hasil baginya
                continue; // maka perulangan dilewatkan
            }

            System.out.println("Perulangan Ganjil " + counterin);
        }
    }
}
