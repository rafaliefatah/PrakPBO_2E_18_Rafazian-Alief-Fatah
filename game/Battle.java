import java.util.*;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void run() {
        System.out.println("=== Battle Start ===");

        int maxTurns = 5;
        int turn = 1;

        while (isTeamAlive(teamA) && isTeamAlive(teamB) && turn <= maxTurns) {
            System.out.println("\n===== TURN " + turn + " =====");
            performTeamTurn(teamA, teamB);
            if (!isTeamAlive(teamB)) break;
            performTeamTurn(teamB, teamA);
            printTeamStatus();
            turn++;
        }

        System.out.println("\n=== Battle End ===");
        printWinner();
    }

    private void performTeamTurn(List<Character> attackers, List<Character> defenders) {
        for (Character attacker : attackers) {
            if (!attacker.isAlive()) continue;

            Character target = chooseTarget(attacker, defenders);
            if (target == null) break;

            attacker.performTurn(target);
        }
    }

    private Character chooseTarget(Character attacker, List<Character> defenders) {
        List<Character> alive = new ArrayList<>();
        for (Character c : defenders) {
            if (c.isAlive()) alive.add(c);
        }

        if (alive.isEmpty()) return null;

        if (attacker instanceof Player) {
            return alive.stream()
                    .filter(c -> c instanceof Enemy)
                    .map(c -> (Enemy) c)
                    .sorted(Comparator
                            .comparingInt(Enemy::getThreatLevel).reversed()
                            .thenComparingInt(Enemy::getHealth))
                    .findFirst()
                    .orElse((Enemy) alive.get(0));
        }
        
        return alive.stream()
                .sorted(Comparator.comparingInt(Character::getHealth))
                .findFirst()
                .orElse(alive.get(0));
    }

    private boolean isTeamAlive(List<Character> team) {
        return team.stream().anyMatch(Character::isAlive);
    }

    private void printTeamStatus() {
        System.out.println("\n-- Status Tim A --");
        teamA.forEach(c -> System.out.println(c.getName() + " | HP: " + c.getHealth()));
        System.out.println("-- Status Tim B --");
        teamB.forEach(c -> System.out.println(c.getName() + " | HP: " + c.getHealth()));
    }

    private void printWinner() {
        if (isTeamAlive(teamA) && !isTeamAlive(teamB)) {
            System.out.println("Team A menang!");
        } else if (isTeamAlive(teamB) && !isTeamAlive(teamA)) {
            System.out.println("Team B menang!");
        } else {
            System.out.println("Pertarungan berakhir seri setelah 5 giliran!");
        }
    }
}