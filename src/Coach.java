class Coach extends Person {

    protected double experience;

    public Coach(String name) {
        super(name);
        this.experience = GetRandomNum.getNumber(70, 99);
    }

    public int getExperience() {
        return (int) this.experience;
    }

}