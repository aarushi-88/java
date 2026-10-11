import java.util.Scanner;

class Team {
    private String name;
    private int matchesPlayed;
    private int wins;
    private int draws;

    // Constructor
    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    // Method to be overridden
    public int calculatePoints() {
        return 0;
    }

    @Override
    public String toString() {
        return "Team: " + name
                + ", Matches: " + matchesPlayed
                + ", Wins: " + wins
                + ", Draws: " + draws
                + ", Points: " + calculatePoints();
    }
}


// Cricket Team
class CricketTeam extends Team {

    public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (getWins() * 2) + (getDraws() * 1);
    }
}


// Football Team
class FootballTeam extends Team {

    public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (getWins() * 3) + (getDraws() * 1);
    }
}


public class SportsLeague {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Enter team details (type,name,matchesPlayed,wins,draws)"
        );

        String input = sc.nextLine();

        String[] data = input.split(",");

        String type = data[0].trim();
        String name = data[1].trim();
        int matchesPlayed = Integer.parseInt(data[2].trim());
        int wins = Integer.parseInt(data[3].trim());
        int draws = Integer.parseInt(data[4].trim());

        Team team;

        // Polymorphism
        if (type.equalsIgnoreCase("Cricket")) {
            team = new CricketTeam(
                    name, matchesPlayed, wins, draws
            );
        } else {
            team = new FootballTeam(
                    name, matchesPlayed, wins, draws
            );
        }

        System.out.println(team);

        sc.close();
    }
}