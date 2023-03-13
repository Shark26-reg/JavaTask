package JavaTask.task04;

/*
В калькулятор добавьте возможность отменить последнюю операцию.
Дополнительно каскадная отмена - отмена нескольких операций.
*/

import java.util.LinkedList;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        LinkedList<Double> results = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        results.add(sc.nextDouble());
        sc.nextLine();

        while (true) {
            System.out.print("Введите оператор (+, -, *, /, cancel, exit): ");
            String op = sc.nextLine();

            if ("exit".equals(op)) break;
            else if ("cancel".equals(op) || "cancel".equals(op)) {
                results.removeFirst();

                if (results.size() == 0) results.add(0.0);
            } else {
                System.out.print("Введите второе число: ");
                double secNumber = sc.nextDouble();

                operation(results, op, secNumber);
                sc.nextLine();
            }

            System.out.println("Результат = " + results.getFirst());
        }

        sc.close();
    }

    public static void operation(LinkedList<Double> list, String op, double number) {
        switch (op) {
            case "+":
                list.add(0, list.getFirst() + number);
                break;

            case "-":
                list.add(0, list.getFirst() - number);
                break;

            case "*":
                list.add(0, list.getFirst() * number);
                break;

            case "/":
                if (number == 0) {
                    System.out.println("Не может делить на ноль!");
                    break;
                }
                list.add(0, list.getFirst() / number);
                break;

            default:
                System.out.println("Неправильный оператор!");
        }
    }
}





    

