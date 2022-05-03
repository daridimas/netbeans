package L08_Final;

public class latihanFinal {
    public static void main(String[] args) {
        final String name = "Eko Kurniawan Khannedy";
        var age = 30;
        var address = "Indonesia";

        // kode di bawah ini akan error karena kata kunci final itu seperti konstanta
        // membuat variabel menjadi tidak bisa diubah lagi seteleh dideklarasikan

        //name = "Nama Diubah";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
