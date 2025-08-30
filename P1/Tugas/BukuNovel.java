package Tugas;

public class BukuNovel extends Buku {
    private String judul;
    private int halaman;

    public void setJudul(String newValue) {
        judul = newValue;
    }

    public void baca(int newValue) {
        halaman = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Judul novel: "+judul);
        System.out.println("Banyak halaman yang sudah dibaca: "+halaman+" halaman");
    }
}