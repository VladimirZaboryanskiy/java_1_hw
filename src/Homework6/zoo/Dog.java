package Homework6.zoo;

import Homework6.zoo.Animal;

public class Dog extends Animal {
    final int maxMetreRun = 500;
    final int getMaxMetreSwim = 10;
   static int counts;

    public Dog(String name) {
        super(name);
        counts ++;
    }

    @Override
    public void run(int metre) {
        if(metre<=maxMetreRun && metre>=0) {
            System.out.println(name + " пробежал " + metre + " метров");
        }else{
            System.out.println(name + "может пробежать не более " + maxMetreRun + " метров");
        }
    }

    @Override
    public void swim(int metre) {
        if (metre <= getMaxMetreSwim && metre >= 0) {
            System.out.println(name + " проплыл " + metre);
        } else {
            System.out.println(name + " так не может, его максимум " + getMaxMetreSwim + " метров");
        }
    }
    public static int count(){
        return counts;
    }
    }

