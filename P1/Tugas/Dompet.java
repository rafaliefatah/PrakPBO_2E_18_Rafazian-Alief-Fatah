package Tugas;

public class Dompet {
    private String merek;
    private int uang=0;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void simpanUang(int newValue) {
        uang = uang+newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek dompet: "+merek);
        System.out.println("Jumlah uang: Rp. "+uang);
    }
}