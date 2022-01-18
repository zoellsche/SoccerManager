public class Goalkeeper extends Person {

    private int reaction;

    public Goalkeeper(String name) {
        super(name);
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    public boolean didHoldTheBall(){
        return false;
    }

}
