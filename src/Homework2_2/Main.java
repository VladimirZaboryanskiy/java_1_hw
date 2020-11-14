package Homework2_2;

public class Main {
    /**
     * когда я бросаю исключение MyArrayDataException, то Exception улетает до main и
     * программа прекращает работу не посчитав при этом сумму массива.  Пытался создать метод в
     * который из цикла будет отправлен символ из определенной ячейки и уже там производить проверку
     * на возможность ("кастануть"??) привести к инту, но при инициализации инта внутри try/catch инт становится не активным
     * ---хотел прикрутить такой метод-----
     * privat static int convert(String s, int x, int y){
     * int a = 0;
     * try{
     * int a = Integer.parseInt(s);(тут "а" горит серым цветом и не дает осуществить задуманное:)))
     * }catch(NumberFormatException e){
     * throw new MyArrayDataException(" в ячейке " + x + " x " + y + " лежит символ или текст вместо числа");
     * }
     * return a;
     * }
     * -------
     * */
    static int arrSum(String arr [][]) throws MyArraySizeException {

        if (!(arr.length == 4 && arr[0].length == 4 && arr[1].length == 4 && arr[2].length == 4 && arr[3].length == 4)) {

            throw new MyArraySizeException("Массив не соответствует размерам 4х4");
        }

        int sum =0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {

                     int a = Integer.parseInt(arr[i][j]);

                        sum += a;
                    } catch (NumberFormatException e) {
                        System.out.println(" в ячейке " + i + " x " + j + " лежит символ или текст вместо числа");
//                        throw new MyArrayDataException(" в ячейке " + i + " x " + j + " лежит символ или текст вместо числа");

                    }
                }
            }

            return sum;
        }


    public static void main(String[] args) {
        String [] [] arrStr = {
                {"23", "n", "32", "6"},
                {"3", "a", "2", "56"},
                {"7", "3", "n", "11" },
                {"41", "34", "2", "21"}
        };
        try {

            System.out.println("Сумма чисел массива: " + arrSum(arrStr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" Работа программы завершена");
}

    }

