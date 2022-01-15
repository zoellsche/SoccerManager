class coach extends person {

    protected double experience;

    public coach() {
        setExperience();
    }

    //Todo: wenn XP gesetzt ist, dann sollte sie dem Objekt auch erhalten bleiben. Wie löst man das in schön?
    public void setExperience()
    {
        if (experience > 0)
            {
                return;
            }
            else
            {
                this.experience = GetRandomNum.getNumber();
            }
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getExperience(){
       return (int) this.experience;
    }

    public String getName()
    {
        return this.name;
    }


}