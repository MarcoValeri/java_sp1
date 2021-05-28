/**
 * This class models a football team with a name, a number of
 * games played, a number of points and a total goal difference.
 */
public class Team {
    private String name;
    private int games, points, goalDifference;
    
    public Team(String name) {
        this.name = name;
        games = 0;
        points = 0;
        goalDifference = 0;
    }

    public String getName() {
        return name;
    }
    
    public int getPoints() {
        return points;
    }
    
    public int getGames() {
        return games;
    }
    
    public int getGoalDifference() {
        return goalDifference;
    }
    
    public void addResult(int goalsFor, int goalsAgainst) {
        games++;
        
        if (goalsFor > goalsAgainst) points+= 3;
        if (goalsFor == goalsAgainst) points+= 1;
    }
   
}