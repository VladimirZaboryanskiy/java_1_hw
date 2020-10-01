package hw2;

import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {


        //задание 2.1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        arrays(arr);
        System.out.println(Arrays.toString(arr));


        //задание  2.2
        int[] arr2 = new int[8];
        for (int i = 0, number = 0; i < arr2.length; i++, number += 3) {
            arr2[i] = number;
        }
        System.out.println(Arrays.toString(arr2));


//задание 2.3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        arrays2(arr3, 6, 2);
        System.out.println(Arrays.toString(arr3));


        //задание 2.4
        int[][] arr4 = new int[8][8];
        for (int y = 0; y < arr4.length; y++) {
            arr4[y][(arr4.length - 1) - y] = 1;
            arr4[(arr4.length - 1) - y][(arr4.length - 1) - y] = 1;
        }
        wordArr(arr4);


// задание 2.5*
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Максимальное значение массива: " + max(arr5));
        System.out.println("Минимальное  значение массива: " + min(arr5));


        // задание 2.7***

        int [] arr7 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr7));
        cycle(arr7,-2);
        System.out.println(Arrays.toString(arr7));


    }

    /**
     * С помощью цикла и условия заменить 0 на 1, 1 на 0
     */
    public static int[] arrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    /**
     * В метот передается массив, происходит поиск числа меньше number, и умножается на multi.
     * *
     */
    public static int[] arrays2(int[] array, int number, int multi) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) {
                array[i] *= multi;
            }
        }
        return array;
    }

    public static void wordArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Поиск MAX занчения в массиве
     */
    public static int max(int arr[]) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (m < arr[i]) {
                m = arr[i];
            }
        }
        return m;
    }

    /**
     * Поиск MIN значения
     */
    public static int min(int arr[]) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (m > arr[i]) {
                m = arr[i];
            }
        }
        return m;
    }
/**
 * Двигаем влево (если n < 0) и вправо(если n > 0) массив*/
    public static int[] cycle(int[] arr, int n) {
if (n > 0){
        for (int i = n; i > 0; i--) {
            int m = arr[arr.length-1];
            for (int j = arr.length - 1; j >= 0; j--) {
                if (j == 0) {
                    arr[j] = m;
                } else {
                    arr[j] = arr[j - 1];
                }
            }


            }
        }else if(n < 0){
    for (int i = -n; i > 0; i--) {
        int m = arr[0];
        for (int j = 0; j <= arr.length - 1; j++) {
            if (j == arr.length - 1) {
                arr[j] = m;
            } else {
                arr[j] = arr[j + 1];
            }
        }


    }
        }
return arr;
    }
}
