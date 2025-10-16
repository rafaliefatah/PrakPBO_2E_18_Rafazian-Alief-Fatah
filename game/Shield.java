public class Shield implements StatusEffect {
    private final int flatReduction;
    private int duration;

    public int getDuration() {
        return duration;
    }

    public Shield(int flatReduction, int duration) {
        this.flatReduction = flatReduction;
        this.duration = duration;
    }

    public int getFlatReduction() {
        return flatReduction;
    }

    @Override
    public void onTurnStart(Character self) {
        // nothing per-turn before attack
    }

    @Override
    public void onTurnEnd(Character self) {
        if (duration>0) {
            System.out.printf("%s's shield reduces %s damage (remaining %d turn)\n", self.getName(), flatReduction, duration);
            duration--;            
        } else if (isExpired()) {
            System.out.printf("Shield Expires");
        }
    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }
}