package L03_Konversi_Tipe_Data_Number;

public class KonversiTipeDataNumber {

    /*
     * Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
     * Narrowing Casting (Manual) : double -> float -> long -> int -> char -> short -> byte
     */
    public static void main(String[] args) {
        // contoh konversi otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // contoh konversi manual
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
    }
}
