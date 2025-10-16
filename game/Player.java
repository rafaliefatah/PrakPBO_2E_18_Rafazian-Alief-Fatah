import java.util.*;

public class Player extends Character {
    private int level;
    private AttackStrategy strategy;
    private final List<Skill> skills = new ArrayList<>();

    public Player(String name, int hp, int ap, int level, AttackStrategy strategy) {
        super(name, hp, ap);
        if (level < 1) {
            throw new IllegalArgumentException("Level minimal 1");
        }
        this.level = level;
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy tidak boleh null");
        }
        this.strategy = strategy;
    }

    public void addSkill(Skill s) { 
        if (s == null) {
            throw new IllegalArgumentException("Skill tidak boleh null");
        }
        skills.add(s);
    }

    @Override
    public void attack(Character target) {
        List<Object> actions = new ArrayList<>();
        
        actions.add("NormalAttack"); 
        
        actions.addAll(skills);

        Random random = new Random();
        Object selectedAction = actions.get(random.nextInt(actions.size()));

        if (selectedAction instanceof Skill) {
            Skill skillToUse = (Skill) selectedAction;
            
            if (skillToUse instanceof HealSkill) {
                skillToUse.apply(this, this); 
            } else if (skillToUse instanceof PiercingStrike) {
                skillToUse.apply(this, target); 
            }
            
        } else if (selectedAction instanceof String && "NormalAttack".equals(selectedAction)) {
            int damage = strategy.computeDamage(this, target);
            System.out.printf("%s attacks %s (Normal Attack) => %d\n", getName(), target.getName(), damage);
            target.takeDamage(damage);
        } 
    }

	public int getLevel() {
        return level;
    }
}