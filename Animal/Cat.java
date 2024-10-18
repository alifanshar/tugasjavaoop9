package Animal;

class Cat extends animal implements Pet{
    private String name;

    public Cat(String name){
        this.name = name;
        super.setLegs(4);
    }
    public Cat(){
        this.name = "Cat";
        super.setLegs(4);
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
        System.out.println(name + " jalan dengan " + legs + " kaki");
    }
}