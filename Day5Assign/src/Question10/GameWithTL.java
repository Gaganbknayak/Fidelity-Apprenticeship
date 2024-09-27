package Question10;

public class GameWithTL extends Game {
    private int timelimit;

    public int getTimelimit() {
        return timelimit;
    }
    public void setTimelimit(int timelimit) {
        this.timelimit = timelimit;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTime Limit for  "+ getName() + " is " + timelimit + " minutes";

    }
}
