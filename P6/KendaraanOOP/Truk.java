package P6.KendaraanOOP;

class Truk extends Kendaraan {
    String barangMuatan;

    public Truk(String merk, int tahunProduksi, String barangMuatan) {
        super(merk, tahunProduksi);
        this.barangMuatan = barangMuatan;
    }

    @Override
    void jalankan() {
        System.out.println("Truk " + merk + " berjalan...");
    }

    void info() {
        super.info();
        System.out.println("Barang muatan: "+barangMuatan);
    }
}