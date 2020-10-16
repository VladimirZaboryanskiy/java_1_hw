package Homework7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int questEat;

    public static void main(String[] args) {
        System.out.println("Сколько положить еды?");
int food = sc.nextInt();
        Plate plate = new Plate(food);

        Cat[] cats = new Cat[rand.nextInt(10)+1];
        System.out.println("Создано " + cats.length + " совершенно разных котов, для упрощения имена присваиваются автоматически" );
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + (i + 1));

        }
        do {
            for (int i = 0; i < cats.length; i++) {
                if (cats[i].getSatiety() == true) {
                    continue;
                }
                cats[i].eat(plate);

            }
            System.out.println(plate);

            Cat.word(cats);

            System.out.println("Хотите добавить еды? 1 - да \\ любой символ - нет ");
             questEat = sc.nextInt(); // тут мы присваиваем переменной значение

            if (questEat == 1) { // здесь равен 1
                System.out.println("Сколько добавить?");

                 food = sc.nextInt();
                plate.setFood(food);

            }

        } while (questEat == 1); //  а тут почему значение слетает??
        }
    }


