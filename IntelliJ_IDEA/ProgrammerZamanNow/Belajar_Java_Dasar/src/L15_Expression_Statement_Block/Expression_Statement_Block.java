package L15_Expression_Statement_Block;

import java.util.Date;

public class Expression_Statement_Block {
    public static void main(String[] args) {

        /*
         * Semua kode yang akan menjadikan satu single value disebut expression
         */

        int value; // bisa dibilang expression dan bisa juga statement
        value = 10; // bisa dibilang expression dan bisa juga statement

        System.out.println(value = 100); // ini adalah expression

        /*
         * statement berisikan execution komplit, biasanya diakhiri dengan titik koma
         * kadang ada konsepsi bahwa statement adalah kumpulan beberapa expression
         *
         * ada beberapa jenis statement
         * 1. Assignment Expression
         * 2. Penggunaan ++ dan --
         * 3. Method invocation
         * 4. Object creation expression
         */

        // assignment statement
        double aValue = 8933.234;

        // increment statement
        aValue++;

        // method invocation statement
        System.out.println("Hello World!");

        // Object creation statement
        Date date = new Date();

        /*
         * Kumpulan statement yang terdiri dari nol atau lebih statement
         * Block diawali dan diakhiri dengan kurung kurawal {}
         */
    }
}
