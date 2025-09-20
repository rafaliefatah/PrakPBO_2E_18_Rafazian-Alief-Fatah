public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    Gerbong(String kode, int jumlah) {
        this.kode=kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    public void setArrayKursi(Kursi[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i+1));
        }
    }

    public String info() {
        String info = "";
        info += "Kode: "+kode+"\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info()+"\n";   
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor-1].getPenumpang()==null) {
            this.arrayKursi[nomor-1].setPenumpang(penumpang);
        } else {
            System.out.println("Maaf, kursi sudah terisi");
        }
    }
}