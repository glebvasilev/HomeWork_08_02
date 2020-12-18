package com.company;

abstract class Animal {
    /*
     *  Class serves for creating animals
     */

    public String name;
    public String family;
    public boolean Fly;
    public boolean Run;
    public boolean Swim;

    public abstract void getName();

    public interface AbleToMakeFly {
        public void makeFly();
    }
    public interface AbleToMakeRun {
        public void makeRun();
    }
    public interface AbleToMakeSwim {
        public void makeSwim();
    }
}

class Squirrel extends Animal implements Animal.AbleToMakeFly, Animal.AbleToMakeRun, Animal.AbleToMakeSwim {

    public String name = "Fox";
    public String family = "Squirrel";
    public boolean Fly = false;
    public boolean Run = true;
    public boolean Swim = true;

    @Override
    public void makeFly() {
        System.out.println(family + " can fly - " + Fly);
    }
    @Override
    public void makeRun() {
        System.out.println(family + " can run - " + Run);
    }
    @Override
    public void makeSwim() {
        System.out.println(family + " can swim - " + Swim);
    }
    @Override
    public void getName() {
        System.out.println(family + " " + name);
    }
}

class Chipmunk extends Animal implements Animal.AbleToMakeFly, Animal.AbleToMakeRun, Animal.AbleToMakeSwim {

    public String name = "Nox";
    public String family = "Chipmunk";
    public boolean Fly = false;
    public boolean Run = true;
    public boolean Swim = true;

    @Override
    public void makeFly() {
        System.out.println(family + " can fly - " + Fly);
    }
    @Override
    public void makeRun() {
        System.out.println(family + " can run - " + Run);
    }
    @Override
    public void makeSwim() {
        System.out.println(family + " can swim - " + Swim);
    }
    @Override
    public void getName() {
        System.out.println(family + " " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Squirrel s = new Squirrel();
        s.getName();
        s.makeFly();
        s.makeRun();
        s.makeSwim();
        Chipmunk c = new Chipmunk();
        c.getName();
        c.makeFly();
        c.makeRun();
        c.makeSwim();
    }
}
