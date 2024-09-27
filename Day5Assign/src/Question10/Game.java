package Question10;

public class Game {
    private String name;
    private int maxNoPlayers;

    public String getName() {
        return name;
    }

    public int getMaxNoPlayers() {
        return maxNoPlayers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxNoPlayers(int maxNoPlayers) {
        this.maxNoPlayers = maxNoPlayers;
    }
    @Override
    public String toString() {
        return "Maximun number of Players for "+ name + " is " + maxNoPlayers;
    }
}
