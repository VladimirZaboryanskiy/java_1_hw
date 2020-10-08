package Homework5;

public class Main {
    public static void main(String[] args) {
        Worker [] workArr = new Worker[5];
        workArr [0] = new Worker("Ivanov Ivan", "Aquamen", "ivanOV@mail.ru", "89269269966", 30000, 50);
        workArr [1] = new Worker("Petrov Petr", "Superman", "petroV@mail.ru", "89159151555", 23000, 18);
        workArr [2] = new Worker("Volodin Volodya", "Cleaner", "volodyA@mail.ru", "89269269966", 40000, 48);
        workArr [3] = new Worker("Hrenova Gaadya", "Kvn", "Gaadya@mail.ru", "8905553343", 15000, 80);
        workArr [4] = new Worker("Sidorov Sidr", "Alcoholic", "aLCO@mail.ru", "89269759966", 30000, 30);

        for (int i = 0; i <workArr.length ; i++) {
            workArr[i].info();

        }
    }
}
