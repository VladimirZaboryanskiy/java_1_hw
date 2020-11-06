package Homework2_1;

import Homework2_1.barrier.Obstacle;
import Homework2_1.barrier.Treadmill;
import Homework2_1.barrier.Wall;

public class Robot implements Obstacle {
    private String name;
    private int runTreadmill;
    private int jumpWall;
    private boolean participation;

    public Robot(String name, int runTreadmill, int jumpWall) {
        this.name = name;
        this.runTreadmill = runTreadmill;
        this.jumpWall = jumpWall;
        this.participation = true;
    }

    @Override
    public void run(Treadmill treadmill) {
        if(!participation){
            System.out.println("Робот " + name + " выбывает ");

        }else if (treadmill.getLengthtTreadmill() > runTreadmill) {
            int outHuman = treadmill.getLengthtTreadmill() - runTreadmill;
            System.out.println("Робот " + name + " пробежал " + runTreadmill + " метров и сошел с дистанции " +
                    " еще осталось " + outHuman + " метров");
            participation = false;
        } else {
            System.out.println("Робот " + name + " пробежал все " + treadmill.getLengthtTreadmill() + " метров");

        }
    }

    @Override
    public void jump(Wall wall) {
        if(!participation){
            System.out.println("Робот " + name + " выбывает ");

        }else if (wall.getHeightWall() > jumpWall) {
            int outRobot = wall.getHeightWall() - jumpWall;
            System.out.println("Робот " + name + " прыгнул на высоту " + jumpWall + " метров и ударился о стену " +
                    " он не допрыгнул каких-то  " + outRobot + " метров");
            participation = false;
        } else {
            System.out.println("Робот " + name + " перепрыгнул " + wall.getHeightWall() + " метровую стену");

        }
    }


}
