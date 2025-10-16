public abstract class Enemy extends Character {
    private int threatLevel; // 1..5
    protected AttackStrategy strategy;

    protected Enemy(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap);
        if (threatLevel < 1 || threatLevel > 5) {
            throw new IllegalArgumentException("Threat level harus antara 1 sampai 5");
        }
        this.threatLevel = threatLevel;
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy tidak boleh null");
        }
        this.strategy = strategy;
    }

    public final int getThreatLevel() { 
        return threatLevel; 
    }

    public final void setStrategy(AttackStrategy s) { 
        if (s == null) {
            throw new IllegalArgumentException("Strategy tidak boleh null");
        }
        this.strategy = s;
    }
}