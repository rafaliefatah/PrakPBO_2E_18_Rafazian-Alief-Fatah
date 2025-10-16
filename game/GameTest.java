import java.util.*;

public class GameTest {
    public static void main(String[] args) {
        Player p1 = new Player("Klein Moretti the Fool", 180, 30, 10, new LevelScaledStrategy(2));
        Player p2 = new Player("Gehrman Sparrow the World", 150, 25, 8, new LevelScaledStrategy(3));
        p1.addSkill(new HealSkill(15));
        p1.addSkill(new PiercingStrike(1.8));
        p2.addSkill(new PiercingStrike(2.5));

        Monster m1 = new Monster("Demonic Wolf", 50, 12, 3, new FixedStrategy());
        BossMonster boss1 = new BossMonster("Amon the Error", 140, 20, 5, new FixedStrategy());
        BossMonster boss2 = new BossMonster("Adam the Visionary", 170, 18, 5, new FixedStrategy());

        p1.addEffect(new Regen(5, 3));
        p2.addEffect(new Regen(6, 2));
        p2.addEffect(new Shield(10, 3));
        boss1.addEffect(new Regen(10, 4));
        boss2.addEffect(new Shield(10, 5));

        List<Character> teamA = Arrays.asList(p1, p2);
        List<Character> teamB = Arrays.asList(m1, boss1, boss2);

        Battle battle = new Battle(teamA, teamB);
        battle.run();
    }
}