package L26_Method;

public class Method {
    public static void main(String[] args) {
        /*
         * Block kode program yang akan berjalan saat kita panggil
         *
         * Sebelumnya kita biasa menggunakan method println() untuk menampilkan tulisan di console
         *
         * Cara membuat method :
         * 1. Gunakan kata kunci void,
         * 2. lalu diikuti dengan nama method,
         * 3. gunakan simbol kurung ()
         * 4. lalu diakhiri dengan block kode programnya. Didalam block kode program silakan masukkan kode program
         *    java seperti biasanya.
         *
         * Cara memanggil method :
         * Dengan menggunakan nama method diikuti dengan simbol ()
         *
         * Di bahasa pemograman lain, Method biasa juga disebut Function.
         *
         * Kebiasaan Programmer Java ialah
         * 1. Biasanya nama method diawali dengan huruf kecil seperti sayHelloWorld()
         */

        sayHelloWorld();
        System.out.println();

        sayHelloWorld();
        System.out.println();

        sayHelloWorld();
        System.out.println();

    }
    static void sayHelloWorld() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }
}
