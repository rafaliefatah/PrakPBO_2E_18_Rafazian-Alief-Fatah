public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        int base = self.getAttackPower();
        int bonus = 0;
        if (self instanceof Player) {
            bonus = ((Player) self).getLevel() * bonusPerLevel;
        }
        return base + bonus;
    }
}