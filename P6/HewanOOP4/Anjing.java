package P6.HewanOOP4;

class Anjing extends Hewan {
    private String jenisBulu;

    public String getJenisBulu() {
        return jenisBulu;
    }

    public Anjing(String nama, int umur, String jenisBulu) {
        super(nama, umur);
        this.jenisBulu = jenisBulu;
    }

    void menggonggong() {
        System.out.println("Guk...Guk!!");
    }
}