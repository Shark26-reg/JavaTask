package JavaTask.task03;
/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
*/

import java.util.ArrayList;

public class task01 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 20));
        }
        System.out.println("Исходный список: " + myList);


        for (int i = 0; i < myList.size(); i++) {
            int even = myList.get(i) % 2;

            if (even == 0) {
                System.out.println("Четное число: " + myList.get(i));
                myList.remove(i);
                i--;
            }

        }
        System.out.println();
        System.out.println("Список без четных чисел: " + myList);

    }
}
