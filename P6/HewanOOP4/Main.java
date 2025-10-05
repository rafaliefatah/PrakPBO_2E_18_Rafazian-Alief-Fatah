package P6.HewanOOP4;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Oranye");
        kucing.berjalan();
        kucing.info();

        // System.out.println(kucing.nama); // Error, 'nama' adalah private
        System.out.println(kucing.umur); // Valid, 'umur' adalah protected dan bisa diakses oleh subclass
    }
}