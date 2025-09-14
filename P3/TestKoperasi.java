import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlPinjaman,angsuran;
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        System.out.print("Masukkan jumlah pinjaman: ");
        jmlPinjaman = input.nextInt();
        donny.pinjam(jmlPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        System.out.print("Masukkan jumlah pinjaman: ");
        jmlPinjaman = input.nextInt();
        donny.pinjam(jmlPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        System.out.print("Masukkan jumlah angsuran: ");
        angsuran = input.nextInt();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000");
        System.out.print("Masukkan jumlah angsuran: ");
        angsuran = input.nextInt();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
