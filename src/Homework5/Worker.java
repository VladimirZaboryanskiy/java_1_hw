package Homework5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phoneNomber;
    private int pay;
    private int age;

    public Worker(String name, String position, String email, String phoneNomber, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNomber = phoneNomber;
        this.pay = pay;
        this.age = age;
    }



    public void info(){
        if(age>=40){
        System.out.printf("Сотрудник %s  в должности %s с электронной почтой %s и номером телефона %s с зарплатой %d рублей, возраст %d лет\n",name , position, email, phoneNomber, pay,age);
        }
    }


}
