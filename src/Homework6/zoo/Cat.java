package Homework6.zoo;

import Homework6.zoo.Animal;

public class Cat extends Animal {
final int maxMetre =200;
static int counts;

    public Cat(String name) {
        super(name);
        counts++;
    }

    @Override
    public void run(int metre) {
        if (metre <= maxMetre && metre >= 0) {
            System.out.println(name + " пробежал " + metre + " метров");
        } else {
            System.out.println(name + " может пробежать не более "+maxMetre+" метров");
        }
    }

    @Override
    public void swim(int metre) {
        System.out.println(name + " не умеет плавать 8)");

    }
    public static int count(){
        return counts;
    }
}
