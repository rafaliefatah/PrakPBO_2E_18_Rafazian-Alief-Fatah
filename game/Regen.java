public class Regen implements StatusEffect {
    public int getPerTurn() {
        return perTurn;
    }

    private final int perTurn;
    private int duration;

    public Regen(int perTurn, int duration) {
        this.perTurn = perTurn;
        this.duration = duration;
    }

    @Override
    public void onTurnStart(Character self) {
    }
    
    @Override
    public void onTurnEnd(Character self) {
        if (duration>0) {
            int newHp = (int) (self.getHealth() + getPerTurn());
            self.setHealth(newHp);
            System.out.printf("%s regenerates %d HP -> %d (remaining %d turn)\n", self.getName(), perTurn, self.getHealth(), duration);
            duration--;
        } else if (isExpired()) {
            System.out.printf("Regen Expires");
        }
    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }
}