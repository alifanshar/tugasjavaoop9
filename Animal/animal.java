package Animal;

abstract class animal {
    protected int legs;

    protected void setLegs(int leg){
        this.legs = leg;
    }
    public abstract void walk();
    public abstract void eat();
}