package P2;

public class Peminjaman {
    public String id,namaMember,namaGame;
    public double harga;
    public int lamaSewa;

    public void dataHasilPinjam() {
        System.out.println("ID Peminjaman   :"+id);
        System.out.println("Nama Member     :"+namaMember);
        System.out.println("Nama Game       :"+namaGame);
        System.out.println("Lama sewa (hari):"+lamaSewa);
        System.out.println("Harga           :"+harga);
        System.out.println("Total harga     :"+hitungTotalHarga());
    }

    public double hitungTotalHarga() {
        return lamaSewa*harga;
    }
}
