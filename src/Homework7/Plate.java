package Homework7;


public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }


    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food < 0) {

            return;
        }
        this.food += food;

    }

    public void decreaseFood(int amount) {
        if (amount < 0) {
            return;
        } else if (food < amount) {

            System.out.println("Осталось мало еды, насыпьте минимум " + (amount - food) + " еды");

        } else {
            food -= amount;
        }


    }
    //public void catEat(Cat cat){
//        if(food<0|| food<cat.){
//            System.out.println("Еда закончиласть, насыпьте еще");;
//        }
//        food -= amount;
//    }


    @Override
    public String toString() {
        return "Осталось " + food +
                " еды";
    }
}
