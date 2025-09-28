public class GameTest {
    public static void main(String[] args) {
        Player p1 = new Player("Rafazian", 150, 25, 5);
        Monster m1 = new Monster("Kuro", 80, 15, "Goblin");
        Monster m2 = new Monster("Cielf", 30, 40, "Dwarf");
        BossMonster bm1 = new BossMonster("Ankelog", 200, 60, "Dragon");
        Monster[] monsters = {m1, m2};
        for (Character m : monsters) {
            m.attack(p1);
        }
        bm1.attack(p1);
        p1.healing(p1);
        p1.attack(m2);
        m2.attack(p1);
        bm1.attack(p1);
        p1.attack(m2);
    }
}