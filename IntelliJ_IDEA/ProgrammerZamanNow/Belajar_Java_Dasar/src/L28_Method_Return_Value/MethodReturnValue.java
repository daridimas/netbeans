package L28_Method_Return_Value;

public class MethodReturnValue {
    public static void main(String[] args) {
        /*
         * Secara default, method tidak menghasilkan value apapun.
         * Namun, jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai.
         * Sebelumnya kan, method hanya kita panggil saja tanpa memberikan value apapun.
         *
         * Ketentuan MethodReturnValue
         * 1. Agar bisa memberikan value  kita harus mengubah kata kunci "void" dengan tipe data yang dihasilkan.
         *    Jika ingin memberikan hasil String, maka kata void diganti String
         * 2. Di dalam block method tersebut, kita harus gunakan kata kunci "return" lalu diikuti dengan data
         *    yang sesuai dengan tipe data yang sudah kita deklarasikan di method.
         * 3. Di Java kita hanya bisa menghasilkan 1 data disebuah method, tidak bisa lebih dari satu.
         *
         */

        var a = 100;
        var b = 200;
        var c = sum(a, b); // pemanggilan method sekaligus mengisi parameternya didalam sebuah variabel

        System.out.println(c);

        // atau yang lebih singkat seperti ini pemanggilan methodnya
        var result1 = sum(100, 100);
        System.out.println(result1);

        // ada lagi cara lain yang bentuknya lebih singkat
        System.out.println(sum(200,200));

        // mencoba method hitung
        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "*", 100));
        System.out.println(hitung(200, "/", 100));
        System.out.println(hitung(200, "salah", 100));

    }

    static int sum(int value1, int value2) { // kita punya method bernama sum dan return valuenya int sehingga parameternya juga int
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch(operasi) {
            case "+" -> {
                return value1 + value2;
            }
            case "-" -> {
                return value1 - value2;
            }
            case "*" -> {
                return value1 * value2;
            }
            case "/" -> {
                return value1 / value2;
            }
            default -> {
                return 0;
            }
        }
    }
}
