package Tugas;

public class BukuTulis extends Buku {
    private String merek, isi="";

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void tulis(String newValue) {
        isi = isi+newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Merek buku tulis: "+merek);
        System.out.println("Isi buku tulis: "+isi);
    }
}