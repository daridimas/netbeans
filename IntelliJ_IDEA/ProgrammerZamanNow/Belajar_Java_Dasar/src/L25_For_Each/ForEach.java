package L25_For_Each;

public class ForEach {
    public static void main(String[] args) {
        /*
         * For Each biasanya digunakan untuk mengakses data array dengan cara perulangan
         * Bisa mengakses seluruh data array
         */

        // Contoh akses data array "Tanpa For Each"

        String[] names = {
                "Eko", "Kurniawan", "Khannedy",
                "Programmer", "Zaman", "Now"
        };

        // mengakses array tanpa For Each
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println(names.length);

        System.out.println();
        System.out.println();

        System.out.println("Contoh Akses Array dengan For Each");
        // mengakses array dengan metode FOR EACH
        for (var value : names) {  // Tiap perulangan, si data value ini akan selalu dimasukkan data tiap array satu per satu
            System.out.println(value);
        }
    }
}
