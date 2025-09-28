class Player extends Character {
    private int level;

    public Player(String name, int health, int attackPower, int level) {
        super(name, health, attackPower);
        this.level = level;
    }

    @Override
    public void attack(Character target) {
        int damage = (int)(super.getHealth() * 0.1) + level;
        System.out.println(getName() + " attacks with sword! Damage: " + damage);
        target.takeDamage(damage);
    }

    public void healing(Character player) {
        int health = (int) (super.getHealth() + Math.random()*10 + level);
        System.out.println(getName() + " uses healing spell! Health: "+health);
        player.setHealth(health);
    }
}