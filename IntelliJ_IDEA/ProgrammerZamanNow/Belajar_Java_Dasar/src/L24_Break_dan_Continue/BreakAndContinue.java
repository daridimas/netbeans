package L24_Break_dan_Continue;

public class BreakAndContinue {
    public static void main(String[] args) {
        /*
         * Di Switch statement, kita sudah mengenal kata kunci break,
         * break digunakan untuk menghentikan case dalam switch.
         *
         * Sama dengan pada perulangan,
         * break juga dapat digunakan untuk memaksa menghentikan perulangan yang terjadi.
         *
         * Berbeda dengan Break, kata kunci Continue hanya menghentikan perulangan saat ini,
         * sehingga perulangan selanjutnya tetap dilakukan.
         */

        var counter = 1;
        while (true) { // perulangan ini tak akan berhenti, karena kondisi selalu bernilai true
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan Berhenti");

        /*
         * Contoh kasus continue
         * Untuk mengambil bilangan Ganjil saja
         * Jika ketemu bilangan Genap, maka kode akan dilewatkan atau perulangan saat itu diberhentikan
         *
         * untuk contoh ada di file ContohKasusContinueGenap dan ContohKasusContinueGanjil
         */

//        for (var counterin = 1; counterin <= 100; counterin++) {
//            if (counterin %2 == 0) { // Jika Counter1 bertemu dengan angka yang tidak ada sisa hasil baginya
//                continue; // maka perulangan dilewatkan
//            }
//
//            System.out.println("Perulangan Ganjil " + counterin);
//        }

    }

}
