/**
 * Created by ericweidman on 2/1/16.
 */
public class Beer {
    public String nameOfBeer;
    public String nameOfManufacturer;
    public int caseSize;
    public double numberOfOunces = 12.0;
    public boolean tasteGood = true;

    public Beer(String nameOfBeer, String nameOfManufacturer, int caseSize, double numberOfOunces, boolean tasteGood) {
        this.nameOfBeer = nameOfBeer;
        this.nameOfManufacturer = nameOfManufacturer;
        this.caseSize = caseSize;
        this.numberOfOunces = numberOfOunces;
        this.tasteGood = tasteGood;

    }

    public String getNameOfBeer() {
        return nameOfBeer;

    }

    public void setNameOfBeer(String newNameOfBeer) {
        nameOfBeer = newNameOfBeer;

    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;

    }

    public void setNameOfManufacturer(String newNameOfManufacturer) {
        nameOfManufacturer = newNameOfManufacturer;

    }

    public int getCaseSize() {
        return caseSize;

    }

    public void setCaseSize(int newCaseSize) {
        if(newCaseSize >= 6) {
        caseSize = newCaseSize;

            caseSize = newCaseSize;
        }
    }

    public double getNumberOfOunces() {
        return numberOfOunces;

    }

    public void setNumberOfOunces(double newNumberOfOunces) {
        numberOfOunces = newNumberOfOunces;
    }

    public boolean isTasteGood() {
        return tasteGood;
    }

    public void doesTasteGood(boolean isTasteGood) {
        tasteGood = isTasteGood;
    }
}
