package JavaTask.task03;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
*/

        import java.util.ArrayList;
        import java.util.Collections;

public class task03 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 100));
        }
        System.out.println("Исходный список: " + myList);
        int max = Collections.max(myList);
        int min = Collections.min(myList);
        double average = myList.stream().mapToInt(a -> a).average().orElse(0);
        System.out.println("Минимальное число в списке: " + min);
        System.out.println("Максимальное число в списке: " + max);
        System.out.println("Среднее арифметическое из этого списка: " + average);

    }
}

