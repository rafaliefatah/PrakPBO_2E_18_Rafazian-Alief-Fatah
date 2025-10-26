public class TestStereotype {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Mahasiswa mhs = new Mahasiswa();
        Dosen dsn = new Dosen();

        System.out.println("Stereotype Manusia:");
        manusia.bernafas();
        manusia.makan();
        
        System.out.println("\nStereotype Dosen:");
        dsn.bernafas();
        dsn.makan();
        dsn.lembur();
        
        System.out.println("\nStereotype Mahasiswa:");
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
    }
}