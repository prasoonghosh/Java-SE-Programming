package com.example;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs= legs;
    }
    public void walk(){
        System.out.println("this animal walks on" +legs + "legs");
    }
    public abstract void eat();
}
