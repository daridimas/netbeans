package L10_Konversi_dari_Tipe_Primitif;

public class latihan_konversi_primitif_ke_non_primitif {
    public static void main(String[] args) {
        int iniInt = 100;

        Integer iniObject = iniInt; // konversi dari tipe data primitif ke non primitif / objek yang sepadan

        short iniShort = iniObject.shortValue(); // Integer ke Short
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 1000000L;
    }
}
