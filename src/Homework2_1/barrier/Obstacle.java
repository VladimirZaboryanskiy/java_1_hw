package Homework2_1.barrier;

import Homework2_1.Jumping;
import Homework2_1.Running;

public interface Obstacle extends Running, Jumping {
    @Override
    default void jump(Wall wall) {

    }

    @Override
    default void run(Treadmill treadmill) {

    }
}
