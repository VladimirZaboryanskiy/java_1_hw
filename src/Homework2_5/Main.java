package Homework2_5;


import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=1;
        }
        float[] arr2 = Arrays.copyOf(arr, arr.length);;
        long b = System.currentTimeMillis();
        arrone(arr);
        System.out.println(System.currentTimeMillis()-b);
//
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        long a = System.currentTimeMillis();
        System.arraycopy(arr2, 0, a1, 0, HALF);
        System.arraycopy(arr2, HALF, a2, 0, HALF);


        Thread t1 = new Thread(new Arrtwo("1", a1));
        Thread t2 = new Thread(new Arrtwo("2", a2));
try {
    t1.join();
    t2.join();
}catch (InterruptedException e){
    e.getStackTrace();
}

        System.arraycopy(a1, 0, arr2, 0, HALF);
        System.arraycopy(a2, 0, arr2, HALF, HALF);
        System.out.println(System.currentTimeMillis()-a);
//        System.out.println(Arrays.toString(arr2));
    }

    public static void arrone(float arr[]){

//        long a = System.currentTimeMillis();

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
//        System.out.println(System.currentTimeMillis()-a);
    }


   static class Arrtwo extends Thread {
      static float[] arr = new float[HALF];
private String name;

       public Arrtwo(String name,float arr[]) {
          this.name = name;
           this.arr = arr;


       }


       @Override
       public void run() {

           arrone(arr);
//           for (int i = 0; i < arr.length ; i++) {
//               arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//           }
//           System.out.println(Arrays.toString(arr));
       }

   }


    }

