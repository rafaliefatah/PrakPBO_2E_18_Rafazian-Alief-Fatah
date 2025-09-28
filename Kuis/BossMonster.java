class BossMonster extends Character {
    private String type;

    public BossMonster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower);
        this.type = type;
    }
    
    @Override
    public void attack(Character target) {
        int damage = (int)((Math.random() * 10) + 5) *2; //damage 2x lipat dari monster biasa
        System.out.println(getName() + " (" + type + ") uses special attack! Damage: " +damage);
        target.takeDamage(damage);
    }
}