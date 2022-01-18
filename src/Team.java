import java.util.ArrayList;

public class Team {

    private static final int MAXPLAYER = 10;
    private static final int MAXGOALKEEPER = 1;
    private String name;
    private int motivation;
    private ArrayList<Player> playerList = new ArrayList<>();
    private Goalkeeper goalKeeper;

    public Team(String name){
        this.name = name;
    }

    public int getStrength(){
        return 10;
    }

    public void setStrength(){

    }

    public int getMotivation(){
        return 10;
    }

    public void setMotivatin(){
        //todo:
    }

    public int calculateTeamStrength(){
        return 10;
    }

    public void addPlayer(Player player){
        if (playerList.size() < MAXPLAYER) {
            this.playerList.add(player);
        }else {
        }
    }

    public void addGoalKeeper(Goalkeeper goalkeeper) {
        this.goalKeeper = goalkeeper;
    }

    public Player getRandomPlayer(){

        return playerList.get(0);
    }
    public int getAllTeamGoals(){
        int teamGoals = 0;
        for (Player player : playerList) {
            teamGoals += player.getGoals();
        }

       return teamGoals;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
