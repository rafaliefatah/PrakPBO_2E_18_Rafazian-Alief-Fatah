package Tugas;

public class Buku {
    private int lembar;
    private String tipeBuku;

    public void hitungLembar(int newValue) {
        lembar = newValue;
    }

    public void setTipeBuku(String newValue) {
        tipeBuku = newValue;
    }

    public void cetakStatus() {
        System.out.println("Tipe buku: "+tipeBuku);
        System.out.println("Banyaknya lembar buku: "+lembar+" lembar");
    }
}