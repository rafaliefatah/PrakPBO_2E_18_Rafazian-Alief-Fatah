public class Sopir {
    private String nama;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private int biaya;
    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    Sopir() {
    }

    public int hitungBiayaSopir(int hari) {
        return biaya*hari;
    }
}