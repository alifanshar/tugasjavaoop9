package Animal;

class Fish extends animal implements Pet{
    private String name;

    public Fish(){
        this.name = "Kil";
        super.setLegs(0);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void play(){
        System.out.println(name + " main");
    }
    public void eat(){
        System.out.println(name + " makan");
    }
    public void walk(){
        System.out.println(name + " berenang dan memiliki " + legs + " kaki");
    }
}
