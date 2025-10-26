public class TestSegitiga {
     public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Total sudut (1 sudut diketahui): " + s.totalSudut(60));
        System.out.println("Total sudut (2 sudut diketahui): " + s.totalSudut(60, 30));
        System.out.println("Keliling segitiga: " + s.keliling(3, 4, 5));
        System.out.println("Sisi miring segitiga siku-siku: " + s.keliling(3, 4));
    }
}