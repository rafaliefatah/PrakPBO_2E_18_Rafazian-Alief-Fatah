package Dependency;

public class MainRapor {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Adrian");
        Siswa siswa2 = new Siswa("Bobo");
        Siswa siswa3 = new Siswa("Caca");

        Rapor rapor1 = new Rapor(80);
        siswa1.kenaikanKelas(rapor1, 10);

        Rapor rapor2 = siswa2.getRapor(11, 2);
        System.out.println("Nilai dari rapor " + siswa2.getNama() + ": " + rapor2.getNilai());

        siswa3.isiRapor();
    }
}