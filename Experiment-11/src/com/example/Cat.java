package com.example;

public class Cat extends Animal implements Pet{
    public String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        this("Prasoon");
    }
    @Override
    public void eat() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setname(String name) {

    }

    @Override
    public void play() {

    }

    @Override
    public void setName(String s) {

    }
}
