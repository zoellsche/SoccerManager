public class Player extends Person {

    private int strength;
    private int motivation;
    private int goals = 0;

    public Player(String name){
        super(name);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getGoals() {
        return goals;
    }

    public void addOneGoalToPlayer() {
        this.goals += 1;
    }

}
