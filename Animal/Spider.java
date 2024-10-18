package Animal;

class Spider extends animal{

    public Spider(){
        super.setLegs(8);
    }
    @Override
    public void eat() {
        System.out.println("Laba-laba makan");
    }
    @Override
    public void walk() {
        System.out.println("Laba laba jalan dengan " + legs + " kaki");
    }
}