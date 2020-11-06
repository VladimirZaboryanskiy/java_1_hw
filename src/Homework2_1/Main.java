package Homework2_1;

import Homework2_1.barrier.Obstacle;
import Homework2_1.barrier.Treadmill;
import Homework2_1.barrier.Wall;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();


        System.out.println("Длина дорожки " + treadmill.getLengthtTreadmill() +"\nВысота стены " + wall.getHeightWall());

        Obstacle[] runnings = {
                new Cat("Basya", 100, 15),
                new Human("Vasya", 1500, 5),
                new Robot("Bender", 2000, 30)

        };
        for (Obstacle r : runnings) {
            r.run(treadmill);
            r.jump(wall);
        }


            Obstacle[] jumpings = {
                    new Cat("Bas", 400, 15),
                    new Human("Vas", 900, 10),
                    new Robot("Ben", 2000, 1)
            };
        for (Obstacle j : runnings) {
            j.run(treadmill);
            j.jump(wall);
        }


        }
    }


