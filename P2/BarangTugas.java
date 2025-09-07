package P2;

public class BarangTugas {
    public String kode,namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return hargaDasar - (int)((diskon/100)*hargaDasar);
    }

    public void tampilData() {
        System.out.println("Kode barang     :"+kode);
        System.out.println("Nama barang     :"+namaBarang);
        System.out.println("Harga dasar     :"+hargaDasar);
        System.out.println("Diskon          :"+diskon+"%");
        System.out.println("Harga jual      :"+hitungHargaJual());
    }
}
