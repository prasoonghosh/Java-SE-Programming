package com.example;

public class Fish extends Animal implements Pet {
    String name;

    protected Fish(){
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public void play() {
    }

    @Override
    public void setName(String s) {

    }

    @Override
    public void eat(){

    }
}
