package L22_While_Loop;

public class WhileLoop {
    public static void main(String[] args) {
        /*
         * While Loop lebih sederhana dibanding For Loop
         * Hanya ada kondisi, tanpa ada Init Statement dan Post Statement
         */

        var counter = 1;

        while (counter <= 10) {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        }
    }
}
