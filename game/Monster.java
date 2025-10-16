public class Monster extends Enemy {
    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        int damage = strategy.computeDamage(this, target) + (int) (getAttackPower() * (Math.random()));
        System.out.printf("%s attacks %s => %d\n", getName(), target.getName(), damage);
        target.takeDamage(damage);
    }
}