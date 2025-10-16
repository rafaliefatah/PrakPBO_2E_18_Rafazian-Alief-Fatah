public class PiercingStrike implements Skill {
    private final double multiplier;

    public PiercingStrike(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }

    @Override
    public String name() {
        return "PiercingStrike x" + multiplier;
    }

    @Override
    public void apply(Character self, Character target) {
        if (self == null || target == null) return;
        int base = self.getAttackPower();
        int dmg = (int) Math.round(base * multiplier);
        int incoming = target.onIncomingDamage(base);
        incoming = incoming + (int) (dmg - (base * 0.25));
        target.takeDamage(incoming);
        System.out.printf("%s uses PiercingStrike x%.2f on %s -> Damage: %d\n", self.getName(), multiplier, target.getName(), incoming);
    }
}