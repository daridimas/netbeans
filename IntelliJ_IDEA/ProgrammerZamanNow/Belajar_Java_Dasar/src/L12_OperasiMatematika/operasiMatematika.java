package L12_OperasiMatematika;

public class operasiMatematika {
    public static void main(String[] args) {
        // Syarat operasi matemtika adalah tipe datanya number

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        int c = 100;

        c += 10; // c = c + 10
        System.out.println(c);

        c -= 10; // c = c - 10
        System.out.println(c);

        c *= 10; // c = c * 10
        System.out.println(c);

        // unary operator

        int d = +100;

        d++; // menambahkan 1
        System.out.println(d);

        d--; // mengurangi 1
        System.out.println(d);

        // operasi kebalikan jika true, maka kebalikannya adalah false
        System.out.println(!false);
    }
}
