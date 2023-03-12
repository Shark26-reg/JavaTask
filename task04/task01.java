
package JavaTask.task04;

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
*/

import java.util.LinkedList;

public class task01 {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(getRandomNumber());
        }
        System.out.println(ll);
        ll = reverseLinkedList(ll);
        System.out.print("\nПеревернутый список: " + ll);


    }


    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll) {
        LinkedList<Integer> revLl = new LinkedList<Integer>();

        for (int i = ll.size() - 1; i >= 0; i--) {

            revLl.add(ll.get(i));
        }
        return revLl;

    }


    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
