/**
 * Created by ericweidman on 2/1/16.
 */
public class IndieGames {

    public String gameName;
    public String gameDev;
    public boolean isOnSteam = true;
    public double costIKnowItShoulntBeADoubleButIdc;
    public int averageLengthToFinish;


    public IndieGames(String gameName, String gameDev, boolean isOnSteam, double costIKnowItShoulntBeADoubleButIdc, int averageLengthToFinish) {
        this.gameName= gameName;
        this.gameDev = gameDev;
        this.isOnSteam = isOnSteam;
        this.costIKnowItShoulntBeADoubleButIdc = costIKnowItShoulntBeADoubleButIdc;
        this.averageLengthToFinish = averageLengthToFinish;

    }

    public String getGameName() {
        return gameName;

    }

    public void setGameName(String newGameName) {
        gameName = newGameName;

    }

    public String getGameDev() {
        return gameDev;

    }

    public void setGameDev(String newGameDev) {

            gameDev = newGameDev;
    }

    public boolean getisOnSteam() {
        return isOnSteam;
    }


    public void setOnSteam(boolean newIsOnSteam) {

        isOnSteam = newIsOnSteam;
    }

    public double getCostIKnowItShoulntBeADoubleButIdc() {
        return costIKnowItShoulntBeADoubleButIdc;

    }

    public void setCostIKnowItShoulntBeADoubleButIdc(double newCostIKnowItShoulntBeADoubleButIdc) {
        costIKnowItShoulntBeADoubleButIdc = newCostIKnowItShoulntBeADoubleButIdc;
    }

    public int getAverageLengthToFinish() {
        return averageLengthToFinish;
    }

    public void setAverageLengthToFinish(int newAverageLengthToFinish) {
       averageLengthToFinish = newAverageLengthToFinish;
    }
}

