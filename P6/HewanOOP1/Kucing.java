class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println("Meong!"); // Meng-override metode bersuara() dari Hewan
    }

    void mengeong() {
        System.out.println("Meong!");
    }
}