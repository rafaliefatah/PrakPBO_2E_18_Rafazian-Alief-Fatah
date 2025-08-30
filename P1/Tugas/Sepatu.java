package Tugas;

public class Sepatu {
    private boolean tali;
    private int ukuran;

    public void setUkuran(int newValue) {
        ukuran = newValue;
    }

    public void ikatTali(boolean newValue) {
        tali = newValue;
    }

    public void cetakStatus() {
        System.out.println("Ukuran sepatu (Euro): "+ukuran);
        System.out.print("Kondisi tali: ");
        if (tali==true) {
            System.out.println("Terikat");
        } else {
            System.out.println("Tidak terikat");
        }
    }
}