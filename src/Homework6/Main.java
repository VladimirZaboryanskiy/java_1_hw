package Homework6;

import Homework6.zoo.Animal;
import Homework6.zoo.Cat;
import Homework6.zoo.Dog;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       Cat cat = new Cat("Tisha");
        System.out.println("Введите растояние для бега и плавания кота");
        //формат ввода "ХХ ХХ"
        int c = sc.nextInt();
        cat.run(c);
        cat.swim(c);
        sc.nextInt();
       Dog dog = new Dog("Sharik");
        System.out.println("Введите растояние для бега и плавания собаки");
       c = sc.nextInt();
        dog.run(c);
        dog.swim(c);
        System.out.println("Счетчик собак: " + Dog.count());
        System.out.println("Счетчик котов: " + Cat.count());
        System.out.println("Счетчик животных: " + Animal.count());
    }
}
