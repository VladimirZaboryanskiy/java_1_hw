package Homework6.zoo;

public abstract class Animal {
    String name;
static int counts;
    public Animal(String name){

        this.name = name;
        counts++;
    }

    public abstract void run(int a);

    public abstract void swim(int a);

    public static int count(){
        return counts;
    }
}
