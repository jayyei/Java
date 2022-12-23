package com.company;

public class Dog extends Animal{
    // When extends from another class you must to define a constructor and calling super() [the Animal's constructor]
    // only if you define a specific constructor (with arguments), also you can define an empty constructor to avoiding call super()


    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes =eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private  void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        this.chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        this.move(5);
    }

    public void run() {
        System.out.println("Dog run()");
        this.move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        this.moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
}
