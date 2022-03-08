package com.example;

public class PetMain {
    public static void playWithAnimal(Animal a) {
        if(a instanceof Pet) {
            Pet p = (Pet)a;
            p.play();
        } else {
            System.out.println("Danger! Wild Animal");
        }
    }
    public static void main(String[] args) {
        Animal a;
        Spider s=new Spider();
        s.eat();
        s.walk();
        a=new Spider();
        a.eat();
        a.walk();
        System.out.println("-------------");
        System.out.println();

        Pet p;
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        a = new Cat();
        a.eat();
        a.walk();
        System.out.println("--------------");
        System.out.println();

        Pet f;
        Fish f = new Fish();
        f.setName("Rohu");
        f.eat();
        f.walk();
        f.play();
        a=new Fish();
        a.eat();
        a.walk();


        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);
    }
}
