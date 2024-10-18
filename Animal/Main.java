package Animal;

public class Main {
    public static void main(String[] args) {
        Cat kucingku = new Cat();
        Cat kucingku1 = new Cat("Imo");
        Fish ikanku = new Fish();
        Spider laba_labaku = new Spider();

        //Untuk class Cat
        System.out.println(kucingku.getName());
        kucingku.setName("Neko");
        System.out.println(kucingku.getName());
        System.out.println(kucingku1.getName());
        kucingku.play();
        kucingku1.play();
        kucingku.eat();
        kucingku1.eat();
        System.out.println("\n");

        //Untuk class Spider
        laba_labaku.eat();
        laba_labaku.walk();
        System.out.println("\n");

        //Untuk class Fish
        System.out.println(ikanku.getName());
        ikanku.setName("Dori");
        System.out.println(ikanku.getName());
        ikanku.eat();
        ikanku.play();
        ikanku.walk();
    }
}