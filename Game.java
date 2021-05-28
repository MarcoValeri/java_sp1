/**
 * This class models (football) games between two teams on a
 * specific date with a number of goals for each team and
 * functionality to update each team's internal statistics
 * when the game has finished.
 */
public class Game {
    
    private Team teamH, teamG;
    private int goalsH, goalsG;
    private String date;

    private static Game[] allGames = new Game[100];
    private static int lastGameNumber = 0;

    
    public Game(String date, Team teamH, Team teamG) {
        allGames[lastGameNumber] = this;
        lastGameNumber++;

        this.date = date;
        this.teamH = teamH;
        this.teamG = teamG;
        
        
    }

    public static Game[] getGames() {
        return allGames;
    }

    public static Game[] getGames(String date) {

        Game[] f = new Game[allGames.length];
        int i = 0;
        for (Game g : allGames)
            if (g != null && g.getDate().equals(date)) {
                f[i] = g;
                i++;
            }
            return f;
    }

    public String getDate() {
        return date;
    }
        
    public Team getTeamH() {
        return teamH;
    }
    
    public Team getTeamG() {
        return teamG;
    }
    
  
    public void goalH() {
        goalsH++;
    }

    public void goalG() {
        goalsG++;
    }

    public void whistle() {
        teamH.addResult(goalsH, goalsG);
        teamG.addResult(goalsG, goalsH);
    }

    public int getGoalsH() {
        return goalsH;
    }

    public int getGoalsG() {
        return goalsG;
    }
    
}