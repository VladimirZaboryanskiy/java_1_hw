package Homework7;

import java.util.Random;

public class Cat {
    private static Random rand = new Random();
    private String name;
    private Boolean satiety;
    private int appetite;

    public Cat(String name) {
        this.name = name;
        this.satiety = false;
        this.appetite = rand.nextInt(20)+1;

    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public Boolean getSatiety() {
        return satiety;

    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            System.out.println("Кот " + name + " кушает с аппетитом " + appetite);

            setSatiety(true);

            plate.decreaseFood(appetite);
        }else{
            System.out.println("Кот " + name + " не покушал");
        }
    }


    public static void word(Cat cats[]) {
        for (int i = 0; i < cats.length; i++) {


            System.out.println(
                    "name='" + cats[i].name + '\'' +
                    ", сытость=" + cats[i].satiety +
                    ", аппетит=" + cats[i].appetite +
                    '}');
        }
    }
}
