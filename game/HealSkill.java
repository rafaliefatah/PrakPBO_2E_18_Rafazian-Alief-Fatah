public class HealSkill implements Skill {
    private final int amount;

    public HealSkill(int amount) {
        this.amount = amount;
    }

    @Override
    public String name() {
        return "Heal(" + amount + ")";
    }

    @Override
    public void apply(Character self, Character target) {
        if (self == null) return;
        int newHp = (int) (self.getHealth() + (self.getAttackPower() * Math.random()) + amount);
        self.setHealth(newHp);
        System.out.printf("%s uses Heal(%d) -> HP is now %d\n", self.getName(), amount, self.getHealth());
    }
}