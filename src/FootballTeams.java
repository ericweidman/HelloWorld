/**
 * Created by ericweidman on 2/1/16.
 */
public class FootballTeams {

    public String nameOfTeam;
    public int numberOfPlayers = 11;
    public float averagePointsPerGame;
    public boolean playoffs = false;


    public FootballTeams(String nameOfTeam, int numberOfPlayers, float averagePointsPerGame, boolean playoffs) {
        this.nameOfTeam = nameOfTeam;
        this.numberOfPlayers = numberOfPlayers;
        this.averagePointsPerGame = averagePointsPerGame;
        this.playoffs = playoffs;

    }

    public String getNameOfTeam() {
        return nameOfTeam;

    }

    public void setNameOfTeam(String newNameOfTeam) {
        nameOfTeam = newNameOfTeam;

    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;

    }

    public void setNumberOfPlayers(int newNumberOfPlayers) {
        if(newNumberOfPlayers >= 11) {
            numberOfPlayers = newNumberOfPlayers;
        }
    }

    public float getAveragePointsPerGame() {
        return averagePointsPerGame;

    }

    public void setAveragePointsPerGame(float newAveragePointsPerGame) {

            averagePointsPerGame = newAveragePointsPerGame;
        }

    public boolean madePlayoffs() {
        return playoffs;

    }

    public void setPlayoffs(boolean newPlayoffs) {
        playoffs = newPlayoffs ;
    }
}