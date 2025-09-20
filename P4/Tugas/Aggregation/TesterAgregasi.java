package Aggregation;

public class TesterAgregasi {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("1", "Adam");
        Jurusan jurusan = new Jurusan("Teknik Informatika");
        jurusan.setDosen(dosen);

        System.out.println("NIP Dosen   : "+jurusan.getDosen().getNip());
        System.out.println("Nama Dosen  : "+jurusan.getDosen().getNama());
        System.out.println("Jurusan     : "+jurusan.getNamaJurusan());
    }
}