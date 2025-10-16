import java.util.*;

public abstract class Character {
    private final String name;
    protected final int maxHealth;
    private int health;
    private final int attackPower;
    private final List<StatusEffect> effects = new ArrayList<>();

    protected Character(String name, int health, int attackPower) {
        this.name = name;
        if (health<0) {
            throw new IllegalArgumentException("Health tidak boleh negatif");
        }
        this.health = health;
        if (attackPower<0) {
            throw new IllegalArgumentException("Attack Power tidak boleh negatif");
        }
        this.attackPower = attackPower;
        this.maxHealth = health;
    }
    
    public final String getName() {
        return name;
    }
    
    public final int getAttackPower() {
        return attackPower;
    }

    public final int getHealth() { 
        return health; 
    }

    protected final void setHealth(int value) {
        health = Math.max(0, Math.min(value, maxHealth));
    }

    protected int onIncomingDamage(int base) {
        for (StatusEffect e : new ArrayList<>(effects)) {
            if (e instanceof Shield) {
                base = base - ((Shield) e).getFlatReduction();
            }
        }
        return base;
    }

    public final boolean isAlive() { 
        return health > 0; 
    }
    
    public final void takeDamage(int dmg) { 
        setHealth(getHealth() - Math.max(0, dmg)); 
    }

    public final void addEffect(StatusEffect e) {
        if (e == null) {
            throw new IllegalArgumentException("StatusEffect tidak boleh null");
        }
        effects.add(e);
    }

    public final void performTurn(Character target) {
        for (StatusEffect e : effects) {
            e.onTurnStart(this);
        }
        attack(target);
        for (StatusEffect e : effects) {
            e.onTurnEnd(this);
        }
        effects.removeIf(StatusEffect::isExpired);
    }

    public abstract void attack(Character target);
}