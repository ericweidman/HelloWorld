/**
 * Created by ericweidman on 2/1/16.
 */
public class DecentBands {

    public String groupName;
    public int numberOfMembers;
    public boolean isNotDaveMatthewsBand = true;
    public int numberOfRecords;
    public boolean hasKeytar = false;

    public DecentBands(String groupName, int numberOfMembers, boolean isNotDaveMatthewsBand, int numberOfRecords, boolean hasKeytar) {
        this.groupName = groupName;
        this.numberOfMembers = numberOfMembers;
        this.isNotDaveMatthewsBand = isNotDaveMatthewsBand;
        this.numberOfRecords = numberOfRecords;
        this.hasKeytar = hasKeytar;

    }

    public String getGroupName() {
        return groupName;

    }

    public void setGroupName(String newGroupName) {
        groupName = newGroupName;

    }

    public int getNumberOfMembers() {
        return numberOfMembers;

    }

    public void setNumberOfMembers(int newNumberOfMembers) {
        if(newNumberOfMembers <= 8) {
            numberOfMembers = newNumberOfMembers;
        }
    }

    public boolean getIsNotDaveMatthewsBand() {
        return isNotDaveMatthewsBand;

    }

    public void setIsNotDaveMatthewsBand(boolean newIsNotDaveMatthewsBand) {

            isNotDaveMatthewsBand = newIsNotDaveMatthewsBand;
    }

    public int getNumberOfRecords() {
        return numberOfRecords;

    }

    public void setNumberOfRecords(int newNumberOfRecords) {
        numberOfRecords = newNumberOfRecords;
    }

    public boolean hasKeytar() {
        return hasKeytar;
    }

    public void setHasKeytar(boolean newHasKeytar) {
        hasKeytar= newHasKeytar;
    }
}
