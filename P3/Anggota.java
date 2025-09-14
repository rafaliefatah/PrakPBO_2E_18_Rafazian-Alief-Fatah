public class Anggota {
    private String ktp,nama;
    private int jmlPinjaman,limitPinjaman;

    Anggota (String ktp, String nama, int limitPinjaman) {
        this.ktp=ktp;
        this.nama=nama;
        this.limitPinjaman=limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jmlPinjaman;
    }

    public void pinjam(int jmlPinjaman) {
        if (jmlPinjaman>limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            this.jmlPinjaman=jmlPinjaman;
        }
    }
    
    public void angsur(int angsur) {
        if (angsur>=jmlPinjaman*0.1) {            
            jmlPinjaman-=angsur;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
