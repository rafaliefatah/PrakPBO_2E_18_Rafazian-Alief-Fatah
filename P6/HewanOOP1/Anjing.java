class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    void menggonggong() {
        System.out.println("Guk...Guk!!");
    }

    @Override
    void bersuara() {
        System.out.println("Guk!");
    }
}