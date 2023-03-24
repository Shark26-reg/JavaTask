package JavaTask.task06;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
*/

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Acer", "Nitro-555", "Black", 15.6, "LCD", 8, 256, "Win");
        Notebook notebook2 = new Notebook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "Win");
        Notebook notebook3 = new Notebook("Samsung", "S-150", "Green", 17.0, "TFT", 16, 512, "Lin");
        Notebook notebook4 = new Notebook("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "Win");
        Notebook notebook5 = new Notebook("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "Lin");
        Notebook notebook6 = new Notebook("MSI", "Gaming-29", "Red", 17.0, "AMOLED", 32, 1024, "Lin");


        List<Notebook> notebookList = List.of(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду\n3 - по операционной системе\n4 - по модели");
        int choiceUserSearch = scannerUser.nextInt();
        try (Scanner scannerRequestUserForSearch = new Scanner(System.in)) {
            System.out.println("Напишите параметр: ");
            String requestUserForSearch = scannerRequestUserForSearch.nextLine();

            if (choiceUserSearch == 1) {
                for (Notebook color : notebookList) {
                    if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(color.printInfo());
                    }
                }
            } else if (choiceUserSearch == 2) {
                for (Notebook brand : notebookList) {
                    if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(brand.printInfo());
                    }
                }
            } else if (choiceUserSearch == 3) {
                for (Notebook oS : notebookList) {
                    if (oS.getOs().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(oS.printInfo());
                    }
                }
            } else if (choiceUserSearch == 4) {
                for (Notebook model : notebookList) {
                    if (model.getModel().equalsIgnoreCase(requestUserForSearch)) {
                        System.out.println(model.printInfo());
                    }
                }
            } else {
                System.out.println("Ошибка.");
            }
        }
        scannerUser.close();


    }


}