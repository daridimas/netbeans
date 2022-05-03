package L27_Method_Parameter;

public class MethodParameter {
    public static void main(String[] args) {
        /*
         * Kita bisa mengirim informasi ke parameter
         * Seperti method println("hello world");
         *
         * Untuk melakukan hal itu, kita perlu :
         * 1. Menambahkan parameter atau argument di method yang sudah kita buat
         * 2. Buat parameter seperti cara membuat variabel.
         *    Jadi Kita tentukan tipe variabelnya apa dan nama variabelnya apa
         *
         * Syarat membuat parameter :
         * 1. Parameter ditempatkan di dalam tanda kurung () di deklarasi method
         * 2. Parameter yang lebih dari satu harus dipisah dengan tanda koma
         *
         * Tidak ada batasan jumlah parameter. Buatlah sebanyak-banyaknya sesuai kebutuhan
         */

        sayHello("Eko", "Khannedy");
        sayHello("Budi", "Gunawan");
        sayHello("Joko", "Nugroho");
    }
        static void sayHello(String firstName, String lastName) { // artinya saya bisa ambil parameter firstname dan lastname
            System.out.println("Hello " + firstName + " " + lastName);
        }
}
