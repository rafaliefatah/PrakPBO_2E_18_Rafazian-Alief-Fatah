public class BossMonster extends Enemy {
    private int turnCounter = 0;

    public BossMonster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        turnCounter++;
        int damage = strategy.computeDamage(this, target) + (int) (getAttackPower() * (Math.random()));
        if (this.getHealth() < (this.getHealth() * 0.5) || turnCounter % 3 == 0) {
            damage *= 2;
            System.out.printf("%s (Boss) rage attacks %s => %d\n", getName(), target.getName(), damage);
        } else {
            System.out.printf("%s (Boss) attacks %s => %d\n", getName(), target.getName(), damage);
        }
        target.takeDamage(damage);

    }
}