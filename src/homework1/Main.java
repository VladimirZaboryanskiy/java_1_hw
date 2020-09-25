package homework1;

public class Main {
    public static void main(String[] args) {
        //ссылочный тип
        String s = "Hello";
// простой тип
        byte b = 50;
        short sh = 250;
        int i = 3000;
        long l = 5374748L;
        float f = 4.57832874F;
        double d = 6.3457;
        char ch = 'a';
        boolean boo = false;
        int year = 2000;

        f = calcul(2.853f, 5.364f, 3.748f, 47.3848f);

        System.out.println("Задание 1.3: " + f);
        System.out.println("Задание 1.4: " + range(13, 23));
        number(7);
        System.out.println("Задание 1.6: " + numberTest(-23));
        word("Владимир");
        vis(2000);

    }

    //1.3
    public static float calcul(float a, float b, float c, float d) {
        float f = a * (b + (c / d));
        return f;
    }

    //1.4
    public static boolean range(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //1.5
    public static void number(int a) {
        if (a >= 0) {
            System.out.println("Задание 1.5: Число положительное");
        } else {
            System.out.println("Задание 1.5: Число отрицательное");
        }
    }

    //1.6
    public static boolean numberTest(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    // 1.7
    public static void word(String s) {
        System.out.println("Привет, " + s);
    }

    public static void vis(int yearV) {

        if (yearV % 100 == 0) {
            if (yearV % 400 == 0) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");
                if (yearV % 4 == 0) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год не високосный");
                }
            }
        }
    }
}