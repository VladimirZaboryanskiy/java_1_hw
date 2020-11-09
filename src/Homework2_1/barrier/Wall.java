package Homework2_1.barrier;

public class Wall {
    private int heightWall = 10;

    public int getHeightWall() {
        return heightWall;
    }
    @Override
    public String toString() {
        return "Высота стены " + heightWall;
    }
}