package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class hw3 {
    public static Scanner sc = new Scanner(System.in);
    public static int r;
    public static void main(String[] args) {
//Задача 3.1
        do{
             System.out.println("Задача.1\nПрограмма загадывает случайное число от 0 до 9, вам дается 3 попытки угадать его.");

             int i = 3;
            int random = (int)(Math.random()*10);
            for (; i > 0 ; i --) {
                if(i>1) {
                    System.out.println("У вас осталось " + i + " попытки");
                }else{
                    System.out.println("У вас осталось " + i + " попыткa");
                }
                int a = sc.nextInt();
                if(a==random){
                    System.out.println("Вы угадали!!");
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1-да");
             r = sc.nextInt();

        }while (r==1);
        System.out.println("Вы вышли из игры :(");


// Задача 3.2
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Программа загадает одно из этих слов: " + Arrays.toString(words));
        System.out.println("Попробуйте отгадайте какое");
   int ran = (int)(Math.random()*words.length);
   String question = words[ran];
   String answer = sc.nextLine();
       if(question.equals(answer)){
           System.out.println(" Поздравляю вы отгадали!!");
       }else{
           searchAnswer(question,answer);

   }

    }
public static void searchAnswer(String question, String answer){
        char [] hidden = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
        int length = question.length();
        do {
            if(length > answer.length()){
                length = answer.length();
            }
                for (int i = 0; i < length; i++) {
                    if (question.charAt(i) == answer.charAt(i)) {
                        hidden[i] = question.charAt(i);
                    }
                }
            System.out.println("Слово не угадано, попробуйте еще: "+ String.valueOf(hidden));
            answer =sc.nextLine();
        }while (!question.equals(answer));
    System.out.println(" Поздравляю вы отгадали это "+ answer);
}
}
