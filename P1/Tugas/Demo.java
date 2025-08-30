package Tugas;

public class Demo {
    public static void main(String[] args) {
        Dompet dp = new Dompet();
        Sepatu sp = new Sepatu();
        Buku bk1 = new Buku();
        BukuTulis bk2 = new BukuTulis();
        BukuNovel bk3 = new BukuNovel();

        dp.setMerek("Boweisi");
        dp.simpanUang(150000);
        dp.cetakStatus();
        System.out.println("----------------------------------------");

        sp.setUkuran(40);
        sp.ikatTali(true);
        sp.cetakStatus();
        System.out.println("----------------------------------------");

        bk1.setTipeBuku("Kamus");
        bk1.hitungLembar(680);
        bk1.cetakStatus();
        System.out.println("----------------------------------------");

        bk2.setTipeBuku("Buku tulis");
        bk2.hitungLembar(58);
        bk2.setMerek("Alfa Premium");
        bk2.tulis("Buku ini milik Rafazian");
        bk2.cetakStatus();
        System.out.println("----------------------------------------");

        bk3.setTipeBuku("Novel");
        bk3.hitungLembar(200);
        bk3.setJudul("86 [Eighty Six]");
        bk3.baca(112);
        bk3.cetakStatus();
        System.out.println("----------------------------------------");
    }
}