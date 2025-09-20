package Dependency;

public class Siswa {
    private String nama;

    public Siswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public boolean kenaikanKelas(Rapor rapor, int kelas) {
        if (rapor.getNilai() >= 70) {
            System.out.println("Naik ke kelas " + (kelas + 1));
            return true;
        } else {
            System.out.println("Tidak naik kelas");
            return false;
        }
    }

    public Rapor getRapor(int kelas, int semester) {
        int nilai = 85;
        System.out.println("Rapor kelas " + kelas + " semester " + semester);
        return new Rapor(nilai);
    }

    public void isiRapor() {
        Rapor rapor = new Rapor();
        rapor.setNilai(92);
        System.out.println("Nilai rapor : " + rapor.getNilai());
    }
}