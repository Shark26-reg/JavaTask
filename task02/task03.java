package JavaTask.task02;

        import java.io.IOException;
        import java.util.Scanner;
        import java.util.logging.FileHandler;
        import java.util.logging.Logger;
        import java.util.logging.SimpleFormatter;

/**
 * 3*(дополнительно). К калькулятору из предыдущего дз добавить логирование.
 */
public class task03 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task03.class.getName());
        FileHandler fHandler = new FileHandler("task03_log.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        logger.addHandler(fHandler);
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
        String sol = num1 + " " + operations + " " + num2 + " = ";
        logger.info(sol + result);
    }

    // метод получения числа
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    // метод получения операции над числом
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;
    }

    // метод получения результата
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Ошибка");
                break;
        }
        return result;

    }


}