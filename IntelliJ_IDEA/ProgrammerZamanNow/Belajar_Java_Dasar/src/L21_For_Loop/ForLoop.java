package L21_For_Loop;

public class ForLoop {
    public static void main(String[] args) {
        /*
         * for (init statement; kondisi; post statement) {
         *    // block perulangan
         * }
         *
         * init statement = dieksekusi 1 kali di awal sebelum perulangan
         * kondisi akan dilakukan pengecekan dalam setiap perulangan,
         * 1. jika kondisi bernilai True maka perulangan akan dilakukan
         * 2. jika False perulangan akan berhenti
         * post statement akan dieksekusi setiap kali diakhir perulangan
         *
         * init statement, kondisi, dan post statement tidak wajib diisi,
         * namun jika kondisi tak diisi maka kondisi akan selalu bernilai true dan terjadi perulangan tanpa henti.
         *
         */

        // Contoh Perulangan tanpa henti
        // for (;;) {
        //    System.out.println("Perulangan Tanpa Henti");
        //}

        // Perulangan dengan kondisi
//        var counter = 1;
//        for (; counter <=10; ) { // kalau counter kurang dari sama dengan 10 maka jalankan kode di bawah ini
//            System.out.println("Perulangan Ke-" + counter);
//
//            counter++;
//        }

        // System.out.println(counter); // ini hasilnya 11 maka perulangan for-nya berhenti

        // Perulangan dengan Init Statement
        // Init statement akan dieksekusi sekali dan di awal perulangan

//        for (var counter = 1; counter <=10; ) { // kalau counter kurang dari sama dengan 10 maka jalankan kode di bawah ini
//            System.out.println("Perulangan Ke-" + counter);
//
//            counter++;
//        }

        // Post statement akan dieksekusi di akhir perulangan dan setiap perulangan akan dieksekusi
        for (var counter = 1; counter <=10; counter++) {
            System.out.println("Perulangan Ke-" + counter);
        }
    }
}
