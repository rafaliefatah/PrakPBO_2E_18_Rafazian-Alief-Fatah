public class Penumpang {
    private String ktp,nama;

    Penumpang(String ktp, String nama) {
        this.ktp=ktp;
        this.nama=nama;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info() {
        String info = "";
        info += "KTP: "+ktp+"\n";
        info += "Nama: "+nama+"\n";
        return info;
    }
}