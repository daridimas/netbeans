package L23_Do_While_Loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * Do While Loop adalah perulangan yang mirip dengan while
         * Perbedaan hanya terletak pada "pengecekan kondisi"
         *
         * Di While Loop, pengecekan kondisi dilakukan sebelum perulangan dilakukan
         * namun di Do While Loop, pengecekan kondisi dilakukan "setelah perulangan dilakukan".
         *
         * Oleh karena itu, Do While Loop pasti akan melakukan 1x (satu kali) perulangan meskipun
         * kondisinya tidak bernilai true.
         */

        var counter = 100;

        // contoh while loop
        while (counter <= 10) { // kondisi bernilai false
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        }

        // di while loop, perulangan tidak terjadi, karena kondisi bernilai false


        // Di bawah ini, contoh Do While Loop
        do {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        } while (counter <= 10);

        // Karena perulangan dilakukan sebelum pengecekan kondisi, perulangan akan tetap dilakukan 1x (satu kali)
        // meskipun kondisinya bernilai false.
    }
}
