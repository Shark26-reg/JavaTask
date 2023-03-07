package JavaTask.task02;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 1.Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
*    результат после каждой итерации (после перемещения числа) запишите в лог-файл.
 */


public class task01 {
    public static int[] myArr(){
        int[] arr = {3, 3, 5, 8, 9, 2, 1, 5, 6};
        return arr;

    }

    public static int[] bablSort(int arr[]) throws IOException{
        Logger loger = Logger.getLogger(task01.class.getName());
        FileHandler fHandler = new FileHandler("task01_log.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);
        int tmp;
        for(int i = arr.length - 1; i >= 0; i-- ){
            for(int j = 0; j < arr.length - 1; j++){
                if (arr[j] < arr[j + 1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            loger.info(Arrays.toString(arr));
        }

        return arr;

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
    }
    
    public static void main(String[] args) throws IOException {
        print(bablSort(myArr()));
    }
}
